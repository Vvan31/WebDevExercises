package Lab_2;

import java.util.Scanner;

/*
 * Write a program that adds up integers that the 
 * user enters. First the programs asks how many 
 * numbers will be added up. Then the program 
 * prompts the user for each number. Finally it 
 * prints the sum.
 */

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many integers will be added?: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter an integer: ");
            int x = sc.nextInt();
            sum += x;
        }
        System.out.println("The sum is " + sum);
        sc.close();
    }
}
