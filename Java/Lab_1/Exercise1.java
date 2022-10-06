package Lab_1;

import java.util.Scanner;

/*
Find the Area of a Circle. Write a program that takes in 
a user's input of the radius and calculates the area of 
a circle. The radius should be read as an integer from 
the keyboard.
 */
class exercise1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the radius:");
        int r = sc.nextInt();
        double area = (Math.PI)*(Math.pow(r,2));
        System.out.println("The area is: " + area);
        sc.close();
    }
}