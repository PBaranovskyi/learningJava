package vkochergin.module1.example.homework7.hackerrankday15;

import java.util.Scanner;

/**
 * Created by Volodymyr Kochergin on 03.05.2017.
 */
public class Solution {
    public static  Node insert(Node head,int data) {
        //Complete this method
        Node current = head;
        Node newNode = new Node(data);
        if (current == null) {
            current = newNode;
            head = current;
        }
        else {
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
