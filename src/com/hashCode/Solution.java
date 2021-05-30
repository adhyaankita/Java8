package com.hashCode;
class Cards{
    private String rank;
    private String suit;

    public Cards(String rank,String suit){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString(){
        return "Rank: "+rank+", Suit: "+suit;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Cards))
            return false;
        Cards cards = (Cards) obj;
        return cards.rank.equals(this.rank) && cards.suit.equals(this.suit);
    }

    @Override
    public int hashCode(){
        return rank.hashCode();
    }
}
public class Solution {
    public static void main(String[] args) {
      Cards c = new Cards("5","Spades");
      Cards d = new Cards("5","Spades");
      System.out.println(c.equals(d));
      System.out.println(c.hashCode());
      System.out.println(d.hashCode());
      System.out.println(c);
    }
}
