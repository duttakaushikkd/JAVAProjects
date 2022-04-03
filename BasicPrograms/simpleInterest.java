package bootcamp;

import java.util.Scanner;

public class simpleInterest {

    public static void main(String []args)
    {
        Double principle,rate, time, SI;
        Scanner sc = new Scanner(System.in);
        principle = sc.nextDouble();
        rate = sc.nextDouble();
        time = sc.nextDouble();
        SI=(principle*rate*time)/100;
        System.out.println(SI);

    }
}
