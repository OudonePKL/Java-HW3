
// Make two numbers as input,subtract the larger number from 
// the smaller number and print the result.

// @author: Oudone PKL


import java.util.Scanner;

public class SubtractNum {

    // Method for subtract the larger number from the smaller number
    public static void subtractNum(int num1, int num2) {

        int result = 0;
        
        if (num1 > num2) {
            result = num1 - num2;
        } 
        else {
            result = num2 - num1;
        }

        System.out.println("Result: " + result);
       
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // call the method
        subtractNum(num1, num2);
    }
}
