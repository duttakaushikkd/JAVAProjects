package bootcamp;

import java.util.Scanner;

public class fact {

    public void main(String[] args)
    {
        int number, result;
        Scanner sc= new Scanner(System.in);
        number = sc.nextInt();
        result= Factorial(number);
        System.out.println(result);
    }

    int Factorial(int num)
    {
       int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact = fact *i;
        }

        return fact;
    }
}
