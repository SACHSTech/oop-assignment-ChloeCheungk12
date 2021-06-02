package FastFood;
public abstract class Person {
    private String firstName;
    private String lastName;
    private String email; 
    private int phoneNumber;
    private Double amountEarnedTD;

    public Person(String fname, String lname, String emailAddr, int phonenum) {
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
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Double getAmountEarnedTD() {
        return amountEarnedTD;
    }

    public void setAmountEarnedTD(Double amountEarned) {
        amountEarnedTD += amountEarned;
    }

    public abstract void collectPaycheque(boolean isPayDay);
}
