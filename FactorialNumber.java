// Find the factorial of the input number

// @author: Oudone PKL

import java.util.Scanner;

class FactorialNumber{

    // Method for find the factorial of the input number
    public static int findFactorialNumber(int num) {

        int fact = 1; //1,2,6,24,120

        for(int i = 1; i <= num; i++) { //1,2,3,4,5
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int num = sc.nextInt();

        // call the method and display to the screen
        System.out.println("Factorial of " + num + "is:" + findFactorialNumber(num));
    }
}