package FastFood;
public class Team_Member extends Employee {
    // Instance variables
    private String jobPosition;
    private Double biweeklyHoursWorked;
    private Double hourlyWage;

    /**
     * Constructor- creates a new team member instance
     * @param fname team member first name
     * @param lname team member last name
     * @param emailAddr team member email address
     * @param phoneNum team member phone number 
     * @param employeeNum team member employee number
     * @param hWage team member hourly wage
     * @param jobPos team member job position
     */
    public Team_Member(String fname, String lname, String emailAddr, String phoneNum, int employeeNum, String jobPos, Double hWage) {
        super(fname, lname, emailAddr, phoneNum, employeeNum);
        this.hourlyWage = hWage;
        this.jobPosition = jobPos;
        this.biweeklyHoursWorked = 0.0;

    }

    /**
     * method- getter method that returns the team member's hourly wage
     * @return the hourly wage
     */
    public Double getHourlyWage() {
        return hourlyWage;
    }

    /**
     * method- getter method that gets the number of hours 
     * worked in the biweekly pay period
     * @return number of hours worked in pay period
     */
    public Double getBiweeklyHoursWorked() {
        return biweeklyHoursWorked;
    }
    

    /**
     * method- getter method that gets the team member's job position
     * @return the job position
     */
    public String getJobPos() {
        return jobPosition;
    }

    /**
     * method- getter method that gets the team member's job position
     * @return the job position
     */
    public void setJobPos(String newJobPos) {
        this.jobPosition = newJobPos;
    }

    /**
     * method- getter method that calculates and returns
     * the amount the team member was paid during the pay period
     * @return the amount the team member was paid during the pay period
     */
    public Double getAmountPaid() {
        return this.biweeklyHoursWorked * this.hourlyWage;
    }

    /**
     * method- setter method that changes the hourly wage of a team member
     * @param newHourlyWage the updated hourly wage
     */    
    public void setHourlyWage(Double newHourlyWage) {
        if (newHourlyWage < 14.25) {
            System.out.println("Cannot be below minimum wage.");
        }
        else {
            this.hourlyWage = newHourlyWage;
            System.out.println("Hourly wage changed to " + this.hourlyWage);
        }
    }

    /**
     * method- adds the number of hours worked to the total number
     * of hours worked during the last pay period
     */
    public void workShift(Double hWorked) {
        this.biweeklyHoursWorked += hWorked;
    }


    /**
     * method- adds the amount the team member earns during the last 
     * pay period to the total amount earned to date and resets the 
     * number of hours worked in the last pay period back to 0
     */
    public void collectPaycheque() {
        setAmountEarnedTD(this.biweeklyHoursWorked * this.hourlyWage);
        this.biweeklyHoursWorked = 0.0;

    }


    /**
     * method- string representation of a team member
     * @return team member name, number, employee number and job position
     */
    public String toString() {
        return "TEAM MEMBER: \n" + getFirstName() + " " + getLastName() +"\nEmployee Number: " + getEmployeeNumber() + "\nPosition: "+ getJobPos();
    }

   



}
