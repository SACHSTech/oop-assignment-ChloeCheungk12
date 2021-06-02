package FastFood;
import java.util.ArrayList;

public class Fastfood_Restaurant {


    private String restaurantName;
    private Owner owner;
    private ArrayList<Employee> employees;


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
    }

    public void fireEmployee(Employee removedEmployee) {
        employees.remove(removedEmployee);
    }

}

