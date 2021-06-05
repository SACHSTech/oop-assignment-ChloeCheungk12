package FastFood;
import java.util.ArrayList;


public class Fastfood_Restaurant {

    // Instance Variables
    private String restaurantName;
    private Owner owner;
    private ArrayList<Employee> employees;
    public static int employeeCount = 0; 

    /**
    * Constructor - creates a new restaurant instance
    * @param rname - the restaurant name
    * @param theowner - the owner object
    */
    public Fastfood_Restaurant(String rname, Owner theowner) {
        this.restaurantName = rname;
        this.owner = theowner;
        
        // Initialize employee list
        this.employees = new ArrayList<Employee>();
    }

    /**
    * Getter method for restaurant name
    * @return restaurant name
    */
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
    * Getter method for owner object
    * @return string representation of owner 
    */
    public String getOwner() {
        return owner.toString();
    }
    
    /**
    * Method - adds employee object to the array of employees 
    * and increases the employee count
    * @param newEmployee employee object
    */
    public void hireEmployee(Employee newEmployee) {
        employees.add(newEmployee);
        employeeCount += 1;
    }

    /**
    * Method - removes employee object from the array of employees 
    * and decreases the employee count
    * @param removedEmployee employee object
    */
    public void fireEmployee(Employee removedEmployee) {
        employees.remove(removedEmployee);
        employeeCount = employeeCount - 1;
    }
    
    /**
    * Method - gets the number of employees
    * @return the number of employees
    */
    public int getEmployeeCount() {
        return employeeCount;
    }

    /**
    * Method - searches for an employee using the employee 
    * number and returns the employee object
    * @param employeeNum employee number
    */
    public Employee employeeSearch(int EmployeeNum) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees.get(i).getEmployeeNumber() == EmployeeNum) {
                return employees.get(i);
            }
        }
        return null;
    }

    /**
    * Method - prints out the list of employees and their basic information
    */
    public void viewEmployeeList() {
        for(int i = 0; i < employeeCount; i++) {
            System.out.println(employees.get(i).toString());

        }
    }

    /**
    * Method - Print the employees' name, number 
    * and the amount they were paid during the pay period. 
    * The amount is added to the amount they earned to date, 
    * The number of hours worked by a team member during the
    * last pay period is reset to 0.
    * Prints the owner's name, amount earned, and adds to the amount
    * the owner earned to date
    */
    public void payEmployees() {
        for(int i = 0; i < employeeCount; i++) {
            System.out.println(("\n" + employees.get(i).getFirstName()) + " " + (employees.get(i).getLastName()));
            System.out.println("Employee Number: " + (employees.get(i).getEmployeeNumber()));
            System.out.println("Amount Paid for this Pay Period: $" + employees.get(i).getAmountPaid());
            employees.get(i).collectPaycheque();
        }

        System.out.println(("\n" + owner.getFirstName()) + " " + (owner.getLastName()));
        System.out.println("Amount Paid for this Pay Period: " + owner.getAmountPaid());
        owner.collectPaycheque();

    }


    /**
    * Method - string representation of a fast food restaurant
    * @return restaurant name and its owner
    */
    public String toString() {
        return this.getRestaurantName() + "\nOwned by: " + owner.getFirstName() + " " + owner.getLastName() + "\nEmploys " + employees.size() + " employees"; 
    }



}

