package bootcamp;

import java.util.Scanner;

public class sitOrNot {

    public static void main(String[] args)
    {
        int total, attended;
        double  percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of class");
        total = sc.nextInt();
        System.out.println("Enter number of class attended");
        attended = sc.nextInt();
        percentage = (attended*100)/total;

        if(percentage< 75)
        {
            System.out.println("Student cannot sit in the exam");
        }
        else
        {
            System.out.println("Student can sit in the exam");
        }



    }
}
