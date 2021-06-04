package FastFood;
public class Team_Member extends Employee {
    private String jobPosition;
    private Double biweeklyHoursWorked;
    private Double hourlyWage;

    public Team_Member(String fname, String lname, String emailAddr, String phoneNum, int employeeNum, String jobPos, Double hWage) {
        super(fname, lname, emailAddr, phoneNum, employeeNum);
        this.hourlyWage = hWage;
        this.jobPosition = jobPos;
        this.biweeklyHoursWorked = 0.0;

    }

    public Double getHourlyWage() {
        return hourlyWage;
    }

    public Double getBiweeklyHoursWorked() {
        return biweeklyHoursWorked;
    }
    

    public String getJobPos() {
        return jobPosition;
    }

    public void setHourlyWage(Double newHourlyWage) {
        if (newHourlyWage < 14.25) {
            System.out.println("Cannot be below minimum wage.");
        }
        else {
            this.hourlyWage = newHourlyWage;
            System.out.println("Hourly wage changed to " + this.hourlyWage);
        }
    }

    public void workShift(Double hWorked) {
        this.biweeklyHoursWorked += hWorked;
    }


    public void collectPaycheque() {
        setAmountEarnedTD(this.biweeklyHoursWorked * this.hourlyWage);
        this.biweeklyHoursWorked = 0.0;

    }

    public Double getAmountPaid() {
        return this.biweeklyHoursWorked * this.hourlyWage;
    }

    public String toString() {
        return "TEAM MEMBER: \n" + getFirstName() + " " + getLastName() +"\nEmployee Number: " + getEmployeeNumber() + "\nAmount Earned to date: " + getAmountEarnedTD();
    }

   



}
