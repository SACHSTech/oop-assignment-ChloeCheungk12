package FastFood;

public class Owner extends Person{

    // Instance Variables
    private Double salary;

    // Constructor
    public Owner(String fname, String lname, String emailAddr, String phonenum, Double thesalary) {
        super (fname, lname, emailAddr, phonenum);
        this.salary = thesalary;
    }

    // Methods

    public Double getSalary () {
        return salary;
    }

    public void collectPaycheque() {
        setAmountEarnedTD(salary);
    }

    public Double getAmountPaid() {
        return salary;
    }

    public String toString() {
        return "Owner: " + this.getFirstName() + " " + this.getLastName();
    }

    


    
}
