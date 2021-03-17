import java.util.InputMismatchException;
import java.util.Scanner;
public class TestArray {
    //Note how these class-variables are set to private, preventing any outside influence.
    private int[] array;
    private Scanner scan;
    public TestArray() {
        //Initialize the scanner
        scan = new Scanner(System.in);
    }
    public int integerValidation() {
        while (true) {
            int value = 0;
            String input = scan.next();
            //Use Try-catch for exception handling, in case the user tries to input malicious code
            //or wrong data types
            try {
                //Set scanner result to variable if it's an integer, if not it throws an exception.
                value = Integer.parseInt(input);
                return value;
            } catch (Exception e) {
                System.out.println("Error: Invalid data type. Try again.");
                System.out.print("Enter number: ");
            }
        }
    }
    public int sizeValidation()  {
        while(true) {
            int size = integerValidation();
            if (size > 0)
            {
                System.out.println("");
                return size;
            }
            else {
                System.out.println("Error: Array size must be greater than zero");
                System.out.print("Try again: ");
            }
        }
    }
    public void fillArray() {
        //Ask user for how many numbers will be in the array, don't set it to a variable yet!
        System.out.print("Enter number of items in the array:");
        //Making sure the scan is an integer before assigning it!
        //Note that numberInput is not set to private, because it is inside the method fillArray.
        array = new int[sizeValidation()];
        //Setting each item in the array to the user's input
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Enter number " + (i+1) + " to add:\t");
            int input = integerValidation();
            array[i] = input;
        }
    }
}


