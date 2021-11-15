public class CreditCard extends Card implements IScan{

    private String expiryDate;

    public CreditCard(String cardNumber, String expiryDate, int securityNumber) {
        super(cardNumber,expiryDate, securityNumber);
    }

    public String scan() {
        return "Payment Successful";
    }
}
