package Lab_2;

import java.util.Scanner;

/*
 * Write a program that asks the user to enter a word. 
 * The program will then repeat the word for as many 
 * times as its characters:
 */

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String n = sc.next();
        for (int i = 1; i < n.length(); i++) {
            System.out.println(n);
        }

        sc.close();
    }
}
