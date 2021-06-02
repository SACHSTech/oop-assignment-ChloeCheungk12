package FastFood;

public abstract class Employee extends Person{
    
    // Instance Variable
    private int employeeNumber;
    public double amountEarnedTD;

    public Employee(String fname, String lname, String emailAddr, int phoneNum, int employeeNum) {
        super(fname, lname, emailAddr, phoneNum);
        this.employeeNumber = employeeNum;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public abstract void collectPaycheque(boolean isPayDay);




}
