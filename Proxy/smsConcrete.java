public class smsConcrete extends  smsService{

    public String sendSMS (String customerID, String message, String number) {
        return customerID + " is sending " + message +" to " + number;
    }
    
}