package vkochergin.module1.example.homework7.hackerrankday18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Volodymyr Kochergin on 05.05.2017.
 */
public class Solution {
    Stack<Character> stack = new Stack();

    public void pushCharacter(char ch) {
        stack.push(ch);
    }

    public char popCharacter() {
         return stack.pop();
    }

    LinkedList<Character> queue = new LinkedList<>();

    public void enqueueCharacter(char ch) {
        queue.addLast(ch);
    }

    public char dequeueCharacter() {
        return (char) queue.remove(0);
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
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
