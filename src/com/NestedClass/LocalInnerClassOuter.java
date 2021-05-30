package com.NestedClass;

public class LocalInnerClassOuter {
    private int noOfBooks;
    private String genreOfBooks;

    LocalInnerClassOuter(int noOfBooks,String genre){
        this.noOfBooks = noOfBooks;
        this.genreOfBooks = genre;
    }

    public void getBooks(){
        final int priceOfBook=20; //final variable or effectively final variable
        class Inner{
            public int totalCostOfBook(){
                return priceOfBook*noOfBooks;
            }
        }
        Inner inner=new Inner();
        System.out.println("Total Cost: "+inner.totalCostOfBook());
    }
}
class Solution{
    public static void main(String[] args) {
        LocalInnerClassOuter outer = new LocalInnerClassOuter(10,"Detective Books");
        outer.getBooks();
    }
}
