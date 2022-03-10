import java.util.Scanner; 
public class Fibonacci{ 
public static void main(String[] args){ 
Scanner scanner=new Scanner(System.in); 
System.out.println("Enter the number");
int n=scanner.nextInt();
int a =0;
int c,b=1;
System.out.println("Fibonacci Series is :");
System.out.print(a);
System.out.print(" " + b);
for (int i=1;i<n-1;i++)
{
c=a+b;
a=b;
b=c;
System.out.print(" " + c);

}

}
}