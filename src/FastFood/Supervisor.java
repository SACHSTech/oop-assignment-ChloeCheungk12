package FastFood;

public class Supervisor extends Employee {
    // Instance variables
    private Double salary;

    /**
     * Constructor- creates a new supervisor instance
     * @param fname supervisor first name
     * @param lname supervisor last name
     * @param emailAddr supervisor email address
     * @param phoneNum supervisor phone number 
     * @param employeeNum supervisor employee number
     * @param thesalary supervisor salary
     */
    public Supervisor(String fname, String lname, String emailAddr, String phoneNum, int employeeNum, Double thesalary) {
        super(fname, lname, emailAddr, phoneNum, employeeNum);
        this.salary = thesalary;
    }

    /**
     * method- getter method that returns the salary
     * @return the salary
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * method- setter method that updates the salary attribute
     * provided that the new salary is above the average pay of a supervisor,
     * $31 000.
     * @param newSalary the amount to which the salary is to be changed
     */
    public void setSalary(Double newSalary) {
        if (newSalary > 31000.0) {
            salary = newSalary;
            System.out.println("New salary set to: $" + salary);
        }
        else {
            System.out.println("New salary too low. Salary remains as: $" + salary );
        }
    }

    /**
     * method- updates the amount the supervisor has earned 
     * by adding the amount of their salary
     */
    public void collectPaycheque() {
        setAmountEarnedTD(salary);
    }

    /**
     * method- getter method that returns the amount
     * paid on payday 
     * @return the salary
     */
    public Double getAmountPaid() {
        return salary;
    }

    /**
     * method- string representation of a supervisor
     * @return the supervisor's name and employee number
     * 
     */
    public String toString() {
        return "SUPERVISOR: \n" + getFirstName() + " " + getLastName() +"\nEmployee Number: " + getEmployeeNumber();
    }
}
