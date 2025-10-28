package classes;

import interfaces.PaymentMethod;

public class CreditCard implements PaymentMethod {
    private int cardNumber;

    public CreditCard(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void executePayment(double amount) {
        double pay = amount + amount/100*25;
        System.out.println(getCardNumber()+"pays: "+pay);
    }
}
