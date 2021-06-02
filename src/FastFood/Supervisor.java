package FastFood;

public class Supervisor extends Employee {
    private Double salary;

    public Supervisor(String fname, String lname, String emailAddr, int phonenum, int EmployeeNum, Double thesalary) {
        super(fname, lname, emailAddr, phonenum, EmployeeNum);
        this.salary = thesalary;



    }

    public Double getSalary() {
        return salary;
    }

    public String setSalary(Double newSalary) {
        if (newSalary > 31000.0) {
            salary = newSalary;
            return ("New salary set to: $" + salary);
        }
        else {
            return ("New salary too low. Salary remains as: $" + salary );
        }
    }

    public void collectPaycheque(boolean isPayDay) {
        if (isPayDay == true) {
            setAmountEarnedTD(salary);
        }
    }
}
