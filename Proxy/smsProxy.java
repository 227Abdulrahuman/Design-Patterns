public class smsProxy extends smsService{

    public static int counter = 0;


    //Always user to send at most 3 SMSs.
    public String sendSMS (String customerID, String message, String number) {

        if (counter < 3) {
        
            smsConcrete sender = new smsConcrete();

            counter++;

            return sender.sendSMS(customerID, message, number);

        }

        return "OUT OF CREDS!";
    }

    
}