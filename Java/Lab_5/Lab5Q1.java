package Lab_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lab5Q1 {

    // Create an ArrayList of Integers
    // Fill each of the 10 slots with a random value from 1-50.
    // Display those values on the screen, and then prompt the user for an integer.
    // Search through the ArrayList, and if the item is present, print a message that the number is in the list.
    // If the value is not in the ArrayList, print a message that the number is not in the list
	public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

        for(int i =0; i < 10 ; i++){
            int answer = rn.nextInt(50) + 1;
            numbers.add(answer);
            System.out.println(numbers.get(i));
        }

        System.out.println("Please type an integer");
        Integer userInteger = sc.nextInt();
        boolean foundNumber = false;

        for (Integer number : numbers) {
            if (number == userInteger) {
                foundNumber = true;
                System.out.println("The number " + userInteger + " is in the list!");
            }
        }
        if(!foundNumber){
            System.out.println("The number " + userInteger + " is NOT the list! D:");
        }
        sc.close();
	}
}