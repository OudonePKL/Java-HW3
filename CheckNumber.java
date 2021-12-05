// Enter a number and write "zero" if it is 0, "plus" if it is positive, 
// and "minus" if it is negative.

// @author: Oudone PKL

import java.util.Scanner;

public class CheckNumber {

    // Method for check the numbers
    public static void checkNumber(int num) {

        if (num > 0) {
            System.out.println("Plus");
        } else if (num < 0) {
            System.out.println("Minus");
        } else {
           System.out.println("Zero");
        }
        
    }
         public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int num = sc.nextInt();

        // call the method
        checkNumber(num);
    }
}
