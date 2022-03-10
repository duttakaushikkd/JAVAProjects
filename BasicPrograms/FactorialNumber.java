import java.util.Scanner; 
public class FactorialNumber{ 
public static void main(String[] args){ 
Scanner scanner=new Scanner(System.in); 
int fact=1;
System.out.println("Enter the number");
int n=scanner.nextInt();

for (int i=1;i<=n;i++)
{
fact = fact *i;
}

System.out.println("Factorial is " + fact);



}
}