import java.util.Scanner; 
public class MyCalculator{ 
public static void main(String[] args){ 
Scanner scanner=new Scanner(System.in); 
int choice, a,b;

do{
System.out.println("Enter your choice - 1 : To add, 2 : To subtract, 3: To multiply , 4: To divide , 5: To Quit");
choice = scanner.nextInt();

switch(choice){

case 1: 
     System.out.println("Enter your first number");
     a=scanner.nextInt(); 
     System.out.println("Enter your second number");
     b=scanner.nextInt(); 
     System.out.println("Answer is " + (a+b));
	 break;

case 2: 
     System.out.println("Enter your first number");
     a=scanner.nextInt(); 
     System.out.println("Enter your second number");
     b=scanner.nextInt(); 
     System.out.println("Answer is " + (a-b));
	 break;
	 
case 3: 
     System.out.println("Enter your first number");
     a=scanner.nextInt(); 
     System.out.println("Enter your second number");
     b=scanner.nextInt(); 
     System.out.println("Answer is" + (a*b));
	 break;
	 
case 4: 
     System.out.println("Enter your first number");
     a=scanner.nextInt(); 
     System.out.println("Enter your second number");
     b=scanner.nextInt(); 
     System.out.println("Answer is " + (a/b));
	 break;
	 
default:
     System.out.println("Thanks for using");
	 break;
}
}while(choice!=5);		

}
}