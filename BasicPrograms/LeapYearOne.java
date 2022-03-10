import java.util.Scanner; 
public class LeapYearOne{ 
public static void main(String[] args){ 
Scanner scanner=new Scanner(System.in); 
System.out.println("Enter the year");
int year = scanner.nextInt();
if(year %400 == 0)
{
System.out.println("Yes! It's a leap year");
}

else if (year % 100 ==0)
{
System.out.println("Yes! It's a leap year");
}
else if (year % 4==0)
{
System.out.println("Yes! It's a leap year");
}

else{
System.out.println("Oops! It's not a leap year");
}

}
}