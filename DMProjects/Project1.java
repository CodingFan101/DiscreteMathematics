/*
     This program was written in Java, and performs
     the bitwise AND, OR, and XOR operations on
     two bit strings of the same length.
     Code for XOR method cited from: https://www.geeksforgeeks.org/xor-of-two-binary-strings/
 */
import java.util.Scanner;
public class Project1
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String num1 = keyboard.nextLine();
        System.out.println("Enter another binary number: ");
        String num2 = keyboard.nextLine();
        if(num1.length() != num2.length()){
            System.out.println("Binary numbers must be the same length.");
            System.exit(0);
        }
        int length = num1.length();
        XOR(num1, num2, length);
        AND(num1, num2, length);
        OR(num1, num2, length);
    }
    public static void XOR(String str1, String str2, int num){
        String answer = "";
        for(int i = 0; i < num; i++){
            if(str1.charAt(i) == str2.charAt(i)){
                answer += "0";
            }
            else{
                answer += "1";
            }
        }
        System.out.println("Bitwise XOR: " + answer);
    }
    public static void AND(String str1, String str2, int num){
        String result = "";
        for(int i = 0; i < num; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                result += "0";
            }
            else if ((str1.charAt(i) == '0') && (str2.charAt(i) == '0')){
                result += "0";
            }
            else{
                result += "1";
            }
        }
        System.out.println("Bitwise AND: " + result);
    }
    public static void OR(String str1, String str2, int num){
        String endresult = "";
        for(int i = 0; i < num; i++){
            if((str1.charAt(i) == '1') || (str2.charAt(i) == '1')){
                endresult += "1";
            }
            else if ((str1.charAt(i) == '0') && (str2.charAt(i) == '0')){
                endresult += "0";
            }
        }
        System.out.println("Bitwise OR: " + endresult);
    }
}
