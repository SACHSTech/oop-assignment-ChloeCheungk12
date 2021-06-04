package FastFood;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;
        String fname;
        String lname;
        String emailAddr;
        String phoneNum; 
        Double hWage;
        Double salary;
        Double hWorked;
        String jobPos;
        int employeeNum;
        Team_Member newTeamMember;
        Supervisor newSupervisor;
        String payday;
        String tmORs;

        // Create owner object
        Owner mrFabroa = new Owner ("Eric", "Fabroa", "eric.fabroa@ycdsbk12.ca", "416-123-4567", 1000000.0);
        Employee temp;

        // Create restaurant object
        Fastfood_Restaurant mcdonalds = new Fastfood_Restaurant("McDonalds", mrFabroa);
        System.out.println("FAST FOOD RESTAURANT CORPORATION");
        System.out.println("Welcome, Mr. Fabroa.\n");

        while (choice != 7) {
            System.out.println("\nOPTION MENU");
            System.out.println("\n1- Punch-In/Punch-Out a Team Member");
            System.out.println("2- Hire An Employee");
            System.out.println("3- Fire An Employee");
            System.out.println("4- Pay Employees");
            System.out.println("5- View Employee List");
            System.out.println("6- Change Employee Wage/Salary");
            System.out.println("7- Exit Program");
            choice = Integer.parseInt(key.readLine()); 
            if (choice == 1) {
                System.out.print("Employee Number: ");
                employeeNum = Integer.parseInt(key.readLine());

                System.out.println("\nHow many hours did they work today?: ");
                hWorked = Double.parseDouble(key.readLine());
                temp = mcdonalds.employeeSearch(employeeNum);
                if (temp instanceof Team_Member) {
                    ((Team_Member)temp).workShift(hWorked);
                }
                

            } 
            else if (choice == 2) {
                System.out.print("\nEmployee first name: ");
                fname = key.readLine();
                System.out.print("\nEmployee last name: ");
                lname = key.readLine();
                System.out.print("\nEmployee email: ");
                emailAddr = key.readLine();
                System.out.print("\nEmployee phone number: ");
                phoneNum = key.readLine();
                System.out.print("\nDesignate an Employee number: ");
                employeeNum = Integer.parseInt(key.readLine());
                System.out.print("\n(T)eam member or (S)upervisor?");
                tmORs = key.readLine();
                if (tmORs.equals("t") || tmORs.equals("T")) {
                    System.out.print("\nChoose Job Position: ");
                    jobPos = key.readLine();
                    System.out.print("\nChoose Hourly Wage: ");
                    hWage = Double.parseDouble(key.readLine());
                    newTeamMember = new Team_Member(fname, lname, emailAddr, phoneNum, employeeNum, jobPos, hWage);
                    mcdonalds.hireEmployee(newTeamMember);
                }
                else {
                    System.out.print("\nChoose a Salary: ");
                    salary = Double.parseDouble(key.readLine());
                    newSupervisor = new Supervisor(fname, lname, emailAddr, phoneNum, employeeNum, salary);
                    mcdonalds.hireEmployee(newSupervisor);
                }
                
            }
            else if (choice == 3) {
                System.out.println("Enter Employee Number: ");
                employeeNum = Integer.parseInt(key.readLine());
                mcdonalds.fireEmployee(mcdonalds.employeeSearch(employeeNum));
            }
            else if (choice == 4) {
                System.out.println("Is it Pay Day Today? (y/n)");
                payday = key.readLine();
                if (payday.equals("y") || payday.equals("Y")) {
                    mcdonalds.payEmployees();
                }
                else {
                    System.out.println("ERROR. Please try again on payday.");
                }

            }
            else if (choice == 5) {
                System.out.println("EMPLOYEE LIST:\n");
                mcdonalds.viewEmployeeList();
            }
            else if (choice == 6) {
                System.out.println("Enter Employee Number: ");
                employeeNum = Integer.parseInt(key.readLine());
                temp = mcdonalds.employeeSearch(employeeNum);
                if (temp instanceof Team_Member) {
                    System.out.println("Current hourly wage: " + ((Team_Member)temp).getHourlyWage());
                    System.out.print("Set a new hourly wage: ");
                    hWage = Double.parseDouble(key.readLine());
                    ((Team_Member)temp).setHourlyWage(hWage);
                    
                }
                else {
                    System.out.println("Current salary: " + ((Supervisor)temp).getSalary());
                    System.out.print("Set a new salary: ");
                    salary = Double.parseDouble(key.readLine());
                    ((Supervisor)temp).setSalary(salary);
        
                }
                

            }
            else {
                System.out.println("Thank you for using the Fastfood System");
            }
        }
        




    }
}

