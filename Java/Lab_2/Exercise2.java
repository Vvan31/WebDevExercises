package Lab_2;

import java.util.Scanner;

/*
 * Write a program that asks the user for N and then sum 
 * all the integers (inclusive) between 1 and N.
 */

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the N:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i; 
        }
        System.out.println(sum);

        sc.close();
    }
}
