/**
 This program was written in Java, and uses the Euclidean algorithm to determine
 the greatest common divisor of two positive integers, specified by user input.
 
 Code for 'Euclidean' method cited from: https://www.geeksforgeeks.org/euclidean-algorithms-basic-and-extended/
 */
import java.util.Scanner;
public class Project2
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter one number: "); 
        num1 = keyboard.nextInt(); // input one number
        System.out.println("Enter another number: "); 
        num2 = keyboard.nextInt(); // input another number
        if(num1 < 0 || num2 < 0){
            System.out.println("Both numbers must be positive.");
            System.exit(0);
        }
        System.out.println("Greatest Common Divisor: " + Euclidean(num1, num2));
    }
    /**
     The 'Euclidean' method determines the greatest common divisor of two
     integers.
     @param first The first number.
     @param second The second number.
     @return The greatest common divisor.
     */
    public static int Euclidean(int first, int second)
    {
        if (first == 0){
            return second;
        }
        return Euclidean(second % first, first);
    }
}
