package FastFood;
public class Team_Member extends Employee {
    private String jobPosition;
    private Double biweeklyHoursWorked;
    private Double hourlyWage;

    public Team_Member(String fname, String lname, String emailAddr, int phonenum, int employeeNum, String jobPos, Double hWage) {
        super(fname, lname, emailAddr, phonenum, employeeNum);
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

    public String setHourlyWage(Double newHourlyWage) {
        if (newHourlyWage < 14.25) {
            return ("Cannot be below minimum wage.");
        }
        else {
            this.hourlyWage = newHourlyWage;
            return ("Hourly wage changed to " + this.hourlyWage);
        }
    }

    public void workShift(Double hWorked) {
        this.biweeklyHoursWorked += hWorked;
    }


    public void collectPaycheque(boolean isPayDay) {
        if (isPayDay == true) {
            setAmountEarnedTD(this.biweeklyHoursWorked * this.hourlyWage);
            this.biweeklyHoursWorked = 0.0;
        }
        

    }



}
