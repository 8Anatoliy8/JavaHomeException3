public class PhoneNumber {
    public static int parsePhoneNumber(String phoneNumber) {
        try{
            return Integer.parseInt(phoneNumber);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException ("Неверный формат номера");
        }
    }
}
