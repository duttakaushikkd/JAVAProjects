package AirlineReservationSystem;

import java.util.Scanner;

public class airline {


    public static void main(String []args)
    {

        System.out.println("Welcome to getfast airlines!!");
      stackProg  Scanner sc = new Scanner(System.in);
        customers C1= new customers();
        payments C1P1= new payments();
        System.out.println("Please enter your source");
        String source= sc.nextLine();
        System.out.println("Please enter your destination");
        String destination= sc.nextLine();

        long Number = C1.flightSearch(source, destination);

        System.out.println("Flight Number is " + Number);

        System.out.println("Are you interested in booking this flight");

        boolean choice = sc.nextBoolean();

        if(choice == true)
        {
            System.out.println("Please enter your name");
            String name= sc.next();
            C1.setName(name);

            System.out.println("Please enter your address");
            String address= sc.next();
            C1.setAddress(address);

            System.out.println("Please enter your contact number");
            long contact = sc.nextLong();
            C1.setPhone(contact);

            System.out.println("Choose the method of payment: 1 for UPI and 2 for card");
            int method = sc.nextInt();

            if(method == 1)
            {
                System.out.println("Please enter the upi number");
                long upiNumber = sc.nextLong();
                String result = C1P1.upiPay(upiNumber);
                System.out.println(result);

            }

            else if(method == 2)
            {
                System.out.println("Please enter the card number");
                long cardNumber = sc.nextLong();
                String result = C1P1.cardPay(cardNumber);
                System.out.println(result);

            }

            else
            {
                System.out.println("Please choose a valid method");
            }

            System.out.println("Flight "+ Number + " is booked from " +source + " to "+destination + " for " + name);
            System.out.println("We wish you a very safe travel!!");

        }

        else
        {
            System.out.println("Thanks for visiting our website. Hope to see you next time!");
        }

    }
}
