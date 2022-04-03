package bootcamp;

import java.util.Scanner;

public class triangle {

    public static  void main(String []args)
    {
        int a,b,c,s;
        double area;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2;
        s=s*(s-a)*(s-b)*(s-c);
        area= Math.pow(s,2);
        System.out.println(area);

    }
}
