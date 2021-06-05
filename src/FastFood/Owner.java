package FastFood;

public class Owner extends Person{

    // Instance Variables
    private Double salary;

    /**
    * Constructor - creates a new owner instance
    * @param fname owner first name
    * @param lname owner last name
    * @param emailAddr owner email address
    * @param phoneNum owner phone number
    * @param salary owner salary
    */
    public Owner(String fname, String lname, String emailAddr, String phoneNum, Double thesalary) {
        super (fname, lname, emailAddr, phoneNum);
        this.salary = thesalary;
    }

    
    /**
    * method - getter method that returns the salary
    * @return the owner salary
    */
    public Double getSalary () {
        return salary;
    }

    /**
    * method - adds the salary amount to the amount the
    * owner has earned to date
    */
    public void collectPaycheque() {
        setAmountEarnedTD(salary);
    }

    /**
    * method - getter method that returns the amount the owner was paid
    * @return the salary
    */
    public Double getAmountPaid() {
        return salary;
    }

    /**
    * method - setter method that changes the salary attribute
    * @param newSalary the updated salary
    */
    public void setSalary(Double newSalary) {
        salary = newSalary;
    }

    /**
    * method - String representation of an owner object
    * @return the fullname, email, phonenumber and salary of an owner
    */
    public String toString() {
        return "Name: " + this.getFirstName() + " " + this.getLastName() + "\nEmail: " + this.getEmail() + "\nPhone Number: " + this.getPhoneNumber() + "\nSalary: $" + this.getSalary();
    }

    


    
}
