package UserInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDetails {

    @Autowired
    public UserBankDetails bankDetails;

    @Autowired
    public UserCareerDetails careerDetails;

    public void printUserDetails(){
        System.out.println("Credit card Details: "+bankDetails.getCreditCard());
        System.out.println("Debit card Details: "+bankDetails.getDebitCard());
        System.out.println("Company name: "+careerDetails.getCompanyName());
        System.out.println("Year of Exp: "+careerDetails.getYearOfExp());
        System.out.println("Salary: "+careerDetails.getSalary());

    }
}
