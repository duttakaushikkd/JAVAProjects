package bootcamp;

import java.util.Scanner;

public class randomGame {

    public static void main(String[] args)
    {
        double correct, userChoice;
        Scanner sc = new Scanner(System.in);
        correct = Math.random();

        while(true)
        {
           System.out.println("Enter your number");
            userChoice= sc.nextDouble();
           if(userChoice>correct)
           {
               System.out.println("Too high, try again.");
               continue;
           }
           else if(userChoice<correct)
            {
                System.out.println("Too Low, try again.");
                continue;
            }
           else
           {
               System.out.println("You gussed it correct");
               break;
           }
        }

    }
}
