package com.concurrency.synchronizeCode;
class Account{
    private int balance=50;
    public int getBalance(){return balance;}
    public void withdrawMoney(int amt){balance = balance-amt;}
}
public class Solution implements Runnable{
    Account account = new Account();


    public static void main(String[] args) {
        Thread t1 = new Thread(new Solution());
        Thread t2 = new Thread(new Solution());
        t1.setName("Fred");
        t2.setName("Lucy");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            makeWithdrawal(10);
            if (account.getBalance() < 0)
                System.out.println("Account is overdrawn.");
        }
    }

    public synchronized void makeWithdrawal(int amt){
        if(account.getBalance() >= amt){
            System.out.println(Thread.currentThread().getName()+" is withdrawing money");
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){}
        account.withdrawMoney(amt);
        System.out.println(Thread.currentThread().getName()+" completes withdrawal");
        }
        else
            System.out.println("Not enough in account for "+Thread.currentThread().getName()+" withdraw "+account.getBalance());
    }
}
