package Lab_2;

import java.util.Scanner;

/*
 * Write a program that asks the user for a starting value and an ending 
 * value and then writes all the integers (inclusive) between those two values.
 */

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the starting value:");
        int starting = sc.nextInt();
        System.out.println("Input the ending value:");
        int ending = sc.nextInt();
        for (int i = starting; i <= ending; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
