package FastFood;



public abstract class Employee extends Person{
    
    // Instance Variable
    private int employeeNumber;


    /**
    * Constructor - creates a new employee instance
    * @param fname employee first name
    * @param lname employee last name
    * @param emailAddr employee email address
    * @param phoneNum employee phone number
    * @param employeeNum employee number
    */
    public Employee(String fname, String lname, String emailAddr, String phoneNum, int employeeNum) {
        super(fname, lname, emailAddr, phoneNum);
        this.employeeNumber = employeeNum;
    }

    /**
    * Method - getter method that returns the employee number
    * @return employee number
    */
    public int getEmployeeNumber() {
        return employeeNumber;
    }



    // Declare abstract methods 
    public abstract void collectPaycheque();

    public abstract Double getAmountPaid();




}
