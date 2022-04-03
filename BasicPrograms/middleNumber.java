package bootcamp;

import java.util.Scanner;



public class middleNumber {

    public static void main(String []args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        int mid,l = s.length();
        mid = l/2;
        if(l%2==0)
        {
            System.out.println(s.charAt(mid-1));
          System.out.println(s.charAt(mid));

        }
        else
        {
            System.out.println(s.charAt(mid));

        }
    }
}
