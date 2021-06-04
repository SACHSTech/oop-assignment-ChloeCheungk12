package FastFood;
import java.util.ArrayList;


public class Fastfood_Restaurant {


    private String restaurantName;
    private Owner owner;
    private ArrayList<Employee> employees;
    public static int employeeCount = 0; 
    //private int employeeNum;
    //private Double hWorked;


    public Fastfood_Restaurant(String rname, Owner theowner) {
        this.restaurantName = rname;
        this.owner = theowner;

        this.employees = new ArrayList<Employee>();
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getOwner() {
        return owner.toString();
    }
    
    
    public void hireEmployee(Employee newEmployee) {
        employees.add(newEmployee);
        employeeCount += 1;
    }

    public void fireEmployee(Employee removedEmployee) {
        employees.remove(removedEmployee);
        employeeCount = employeeCount - 1;
    }
    
    public int getEmployeeCount() {
        return employeeCount;
    }

    public Employee employeeSearch(int EmployeeNum) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees.get(i).getEmployeeNumber() == EmployeeNum) {
                return employees.get(i);
            }
        }
        return null;
    }

    public void viewEmployeeList() {
        for(int i = 0; i < employeeCount; i++) {
            System.out.println(employees.get(i).toString());

        }
    }

    public void payEmployees() {
        for(int i = 0; i < employeeCount; i++) {
            System.out.println((employees.get(i).getFirstName()) + (employees.get(i).getLastName()));
            System.out.println("Employee Number: " + (employees.get(i).getEmployeeNumber()));
            System.out.println("Amount Paid for this Pay Period: " + employees.get(i).getAmountPaid());
            employees.get(i).collectPaycheque();
        }

        System.out.println("\nYour (owner) paycheque amount: " + owner.getAmountPaid());

    }



    public String toString() {
        return this.getRestaurantName() + "\nOwned by: " + owner.toString() + "\nEmploys " + employees.size() + " employees"; 
    }



}

