package exceptionHandling;

public class exceptionHandling {

    public static void main(String[] args) {


        try{
            int x=50/0;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Ran");


    }
}
