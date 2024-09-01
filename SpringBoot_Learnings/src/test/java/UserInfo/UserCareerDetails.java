package UserInfo;

import org.springframework.stereotype.Component;

@Component
public class UserCareerDetails {
    private String companyName;
    private int salary;
    private int yearOfExp;

    public UserCareerDetails(String companyName, int salary, int yearOfExp) {
        this.companyName = "Cognizant";
        this.salary = 50000;
        this.yearOfExp = 5;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public int getYearOfExp() {
        return yearOfExp;
    }

}
