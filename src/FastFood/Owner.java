package FastFood;

public class Owner extends Person{

    // Instance Variables
    private Double salary;

    // Constructor
    public Owner(String fname, String lname, String emailAddr, int phonenum, Double thesalary) {
        super (fname, lname, emailAddr, phonenum);
        this.salary = thesalary;
    }

    // Methods

    public Double getSalary () {
        return salary;
    }

    public void collectPaycheque(boolean isPayDay) {
        if (isPayDay == true) {
            setAmountEarnedTD(salary);
        }
    }

    public String toString() {
        return "Owner: " + this.getFirstName() + " " + this.getLastName();
    }


    
}
