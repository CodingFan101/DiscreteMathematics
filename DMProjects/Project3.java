import java.util.*;
import java.io.*;
/*
 This program was written in Java, and simulates the Monty Hall Three-Door problem.
 
 Code cited from: https://rosettacode.org/wiki/Monty_Hall_problem
 */
public class Project3
{
    public static void main(String[] args){
         Scanner keyboard = new Scanner(System.in);
         Random rand = new Random();
         int trials = 0, switchwins = 0, staywins = 0;
         String response;
         char reply;
         do{
            System.out.println("Insert a number: ");
            System.out.println("0 = First door");
            System.out.println("1 = Second door");
            System.out.println("2 = Third door");
            int choice = keyboard.nextInt();
            
            if(choice < 0 || choice >= 3){
            System.out.println("Number must be within range of 0-2.");
            System.exit(0);
            }
            
            int[] decisions = {0, 0, 0};
            decisions[rand.nextInt(3)] = 1;
            int shown;
            do{
                shown = rand.nextInt(3);
            }while(decisions[shown] == 1 || shown == choice);
            staywins += decisions[choice];
            switchwins += decisions[3 - choice - shown];
            trials += 1;
         System.out.println("Switch wins: " + switchwins);
         System.out.println("Switching probability: " + (double)switchwins/trials);
         System.out.println("Stay wins: " + staywins);
         System.out.println("Staying probability: " + (double)staywins/trials);
         System.out.println("Do you want to keep going?");
         keyboard.nextLine();
         response = keyboard.nextLine();
         reply = response.charAt(0);
        } while((reply == 'Y') || (reply == 'y'));
    }
}
    

