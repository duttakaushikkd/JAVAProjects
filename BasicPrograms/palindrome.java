package bootcamp;

import java.util.Scanner;

public class palindrome {

    public static void main(String []args)
    {
        String str, nstr="";
        char ch;

        Scanner sc = new Scanner(System.in);
        str=sc.nextLine();

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }
        if(str.equals(nstr))
        {
            System.out.println("its' palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
        
    }
}
