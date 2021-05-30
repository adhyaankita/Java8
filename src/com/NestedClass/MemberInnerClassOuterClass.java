package com.NestedClass;

public class MemberInnerClassOuterClass {
    private int id=12;
    private String empName="Ankita";

    protected class InnerClass{
        private final String deptName="IT";
        public void printDetails(){
            //System.out.println(deptName);
            System.out.println(this.deptName);
            System.out.println(MemberInnerClassOuterClass.this.id);
            System.out.println(MemberInnerClassOuterClass.this.empName);
        }
    }

    public void callInnerClass(){
        InnerClass innerClass = new InnerClass();
        innerClass.printDetails();
    }
    public static void main(String[] args) {
        MemberInnerClassOuterClass memberInnerClassOuterClass = new MemberInnerClassOuterClass();
        memberInnerClassOuterClass.callInnerClass();
    }
}
