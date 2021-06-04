package FastFood;

public class Supervisor extends Employee {
    private Double salary;

    public Supervisor(String fname, String lname, String emailAddr, String phoneNum, int EmployeeNum, Double thesalary) {
        super(fname, lname, emailAddr, phoneNum, EmployeeNum);
        this.salary = thesalary;



    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double newSalary) {
        if (newSalary > 31000.0) {
            salary = newSalary;
            System.out.println("New salary set to: $" + salary);
        }
        else {
            System.out.println("New salary too low. Salary remains as: $" + salary );
        }
    }

    public void collectPaycheque() {
        setAmountEarnedTD(salary);

    }

    public Double getAmountPaid() {
        return salary;
    }

    public String toString() {
        return "SUPERVISOR: \n" + getFirstName() + " " + getLastName() +"\nEmployee Number: " + getEmployeeNumber() + "\nAmount Earned to date: " + getAmountEarnedTD();
    }
}
