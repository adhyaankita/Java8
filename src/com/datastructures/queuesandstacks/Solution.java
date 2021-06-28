//Palindrome string
package com.datastructures.queuesandstacks;
import java.util.*;

public class Solution {

    ArrayDeque<String> stack = new ArrayDeque<>();
    Queue<String> queue = new ArrayDeque<>();

    void pushCharacter(char ch){
        stack.push(Character.toString(ch));
    }
    void enqueueCharacter(char ch){
        queue.add(Character.toString(ch));
    }
    char popCharacter(){
        return stack.pop().charAt(0);
    }
    char dequeueCharacter(){
        return queue.remove().charAt(0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}

