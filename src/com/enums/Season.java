package com.enums;

public enum Season {
    SPRING("9am-7pm",100),
    SUMMER("9am-8pm",150),
    AUTUMN("9am-7pm",100),
    WINTER("10am-6pm",80);
    private String timing;
    private int fees;
    private Season(String timing,int fees){
        this.timing = timing;
        this.fees = fees;
    }
    public String getTiming(){return timing;}
    public int getFees(){return fees;}
}
class App{
    public static void main(String[] args) {
        for(Season season: Season.values()){
            System.out.println(season.getTiming());
            System.out.println(season.getFees());
        }
    }
}