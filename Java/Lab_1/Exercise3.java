package Lab_1;

import java.util.Scanner;

/*
Multiplication Table. Write a program that takes a number as input and prints 
its multiplication table up to 10. Sample Output:
 */
class exercise3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", n , i , n*i);
        }
        sc.close();
    }
}