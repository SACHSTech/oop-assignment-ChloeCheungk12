package FastFood;

public abstract class Employee extends Person{
    
    // Instance Variable
    private int employeeNumber;


    public Employee(String fname, String lname, String emailAddr, String phoneNum, int employeeNum) {
        super(fname, lname, emailAddr, phoneNum);
        this.employeeNumber = employeeNum;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }




    public abstract void collectPaycheque();

    public abstract Double getAmountPaid();




}
