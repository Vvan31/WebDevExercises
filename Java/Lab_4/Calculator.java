package Lab_4;

import java.util.Scanner;

public class Calculator {
    public Calculator(){}
    
    private  float add(float x, float y){
        return x + y;
    }

    private float subtract(float x, float y){
        return x - y;
    } 
    private float multiply(float x, float y){
        return x * y;
    } 
    private float divide(float x, float y){
        return x / y;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(); 
        boolean calculateMore = true; 

        Scanner sc = new Scanner(System.in);

        while (calculateMore) {
            System.out.println("Please type the first number");
            float firstNum = sc.nextFloat();

            System.out.println("Choose an operation:\n"+
                                  "  > Type + for addition\n" +
                                  "  > Type - for subtraction\n" +
                                  "  > Type * for multiplication\n" +
                                  "  > Type / for division");

            String operation = sc.next();

            System.out.println("Please type the second number");
            float secondNum = sc.nextFloat();

            switch (operation) {
                case "+":
                    System.out.printf("%.2f + %.2f = %.2f\n", firstNum, secondNum, calculator.add(firstNum, secondNum));
                    break;
                case "-":
                    System.out.printf("%.2f - %.2f = %.2f\n", firstNum, secondNum, calculator.subtract(firstNum, secondNum));
                    break;
                case "*":
                    System.out.printf("%.2f * %.2f = %.2f\n", firstNum, secondNum, calculator.multiply(firstNum, secondNum));
                    break;
                case "/":
                    if (secondNum <= 0) {
                        System.out.println("Cannot divide by zero\n");
                    }else{
                        System.out.printf("%.2f / %.2f = %.2f\n", firstNum, secondNum, calculator.divide(firstNum, secondNum));
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Do you want to continue [1] or quit [0]?");
            int response = sc.nextInt();
            if(response == 0){
                calculateMore = false;
            }
        }
        sc.close();

    }
}
