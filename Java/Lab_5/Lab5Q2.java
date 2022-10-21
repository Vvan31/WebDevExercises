package Lab_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lab5Q2 {

	public static void main(String[] args) {
        // Create an ArrayList of Integers
        List<Integer> numbersList = new ArrayList<Integer>();

        // Fill the ArrayList with ten random numbers (1-50)
        Random rn = new Random();
        for(int i =0; i < 10 ; i++){
            int answer = rn.nextInt(50) + 1;
            numbersList.add(answer);
        }
        // Copy each value from the ArrayList into another ArrayList of the same capacity
        List<Integer> secondList = new ArrayList<Integer>(numbersList);

        // Change the last value in the first (original) ArrayList to a -5
        numbersList.set(numbersList.size()-1, -5);

        // Display the contents of both ArrayLists
        System.out.println("========= Original List =========");
        for (Integer number : numbersList) {
            System.out.println(number);
        }
        System.out.println("========= Second List =========");
        for (Integer number : secondList) {
            System.out.println(number);
        }
	}
}