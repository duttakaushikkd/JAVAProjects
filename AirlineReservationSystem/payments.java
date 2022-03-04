package AirlineReservationSystem;

public class payments {

    private String type;
    private long cardNumber;
    private long upiNumber;
    private String message;


    public String upiPay(long upiNumber)
    {
        upiNumber = upiNumber;
        message = "Payment done through upi. Thanks";
        return message;
    }

    public String cardPay(long cardNumber)
    {
        cardNumber = cardNumber;
        message = "Payment done through card. Thanks";
        return message;
    }
}
