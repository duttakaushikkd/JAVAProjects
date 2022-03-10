import java.util.Scanner; 
public class CarRental{ 
public static void main(String[] args){ 
Scanner scanner=new Scanner(System.in); 
int select,check =0;

System.out.println("*****************************************************************************************************");
System.out.println("****************Welcome to India's trending best car rental company!!********************************");
System.out.println("************************Rent O Ride*******************************************************************");
System.out.println("********Where we make renting easy for you everytime and everywhere**********************************");
System.out.println("*****************************************************************************************************");

System.out.println("****************Please select your choice************************************************************");
System.out.println("1. Login for the day");
System.out.println("2. Rent a car");
System.out.println("3. Return a car");
System.out.println("4. Talk to the customer");
System.out.println("5. Logout for the day");

select = scanner.nextInt();

if(select ==1)
{

do{



  System.out.println("you are logged in");
  System.out.println("****************Please select your choice************************************************************");
  System.out.println("2. Rent a car");
  System.out.println("3. Return a car");
  System.out.println("4. Talk to the customer");
  System.out.println("5. Logout for the day");
  select = scanner.nextInt();
  

 
  switch (select){
  
  case 2 : 
        System.out.println(" Please select the car customer wants to rent");
		System.out.println("1. Skoda");
		System.out.println("2. Ford");
		System.out.println("3. BMW") ;
		System.out.println("4. Audi");
		int carChoice = scanner.nextInt();
		
		if(carChoice == 1)
		{
		 System.out.println("Thanks for taking Skoda. HAVE FUN!!");
		 }
		 
		else if (carChoice == 2)
		{
		 System.out.println("Thanks for choosing Ford. Don't get too comfortable mate!!");
		 }
		 else if (carChoice == 3)
		 {
		 System.out.println("Thanks for chooisng BMW. Mind the speed!!");
		 }
		 else{
		 System.out.println("Thanks for choosing Audi.Mind the luxury!!");
		 }
	    
		break;
	
  case 3: 
		System.out.println("Enter the car code that you want to return");
		int carCode = scanner.nextInt();
		System.out.println("Thank for returning " + carCode);
		break;
		
  case 4:
       System.out.println("Have a great and pleasant talk with the client");
	   break;
  
  default:
        System.out.println("Thanks for letting us serve you. Have a great life balance and good bye");
		break;
	}
	}while (select != 5);
}
	
else
{
System.out.println("Please login first");
}
 

}
}