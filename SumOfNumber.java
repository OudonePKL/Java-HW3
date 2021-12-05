
// Sum the entered digits program
// @author: Oudone PKL

import java.util.Scanner;


public class SumOfNumber {

    // Method for check the summation number of the user's entered
    public static int checkSumNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            sum += (num % 10);
            System.out.println(sum + " " + num);
            num /= 10;
        }

        return sum;
    }
    
    public static void main(String[] args) {

        // call the method and display to the screen
        System.out.println("Result: " + checkSumNumber());
    }
}
