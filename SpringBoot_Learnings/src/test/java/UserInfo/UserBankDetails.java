package UserInfo;

import org.springframework.stereotype.Component;

@Component
public class UserBankDetails {
    private String creditCard;
    private String debitCard;

    public UserBankDetails(){
        this.creditCard = "HDFC CreditCard";
        this.debitCard = "SBI DebitCard";
    }

    public String getCreditCard() {
        return creditCard;
    }

    public String getDebitCard() {
        return debitCard;
    }
}
