package Lab_1;

import java.util.Scanner;

/*
Convert Cents to Dollars. Write a program that takes in an input number of cents.
Expected Output : The value is 3 dollars and 24 cents.

Note: Use integer arithmetic and avoid floating point arithmetic.
 */
class exercise2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the cents:");
        int cents = sc.nextInt();
        int dollars = cents / 100;
        int remaining_cents = cents % 100;
        System.out.printf("The value is %d dollars and %d cents.\n", dollars, remaining_cents);
        sc.close();
    }
}
