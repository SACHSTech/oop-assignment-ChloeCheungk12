package FastFood;
public abstract class Person {
    private String firstName;
    private String lastName;
    private String email; 
    private String phoneNumber;
    private Double amountEarnedTD;

    public Person(String fname, String lname, String emailAddr, String phonenum) {
        firstName = fname;
        lastName = lname;
        email = emailAddr;
        phoneNumber = phonenum;

        amountEarnedTD = 0.0;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Double getAmountEarnedTD() {
        return amountEarnedTD;
    }

    public void setAmountEarnedTD(Double amountEarned) {
        amountEarnedTD += amountEarned;
    }

    


    public abstract void collectPaycheque();
    public abstract Double getAmountPaid();


}
