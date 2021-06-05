package FastFood;

public abstract class Person {
    // Instance Variables
    private String firstName;
    private String lastName;
    private String email; 
    private String phoneNumber;
    private Double amountEarnedTD;

    /**
    * Constructor - creates a person instance
    * @param fname person first name
    * @param lname person last name
    * @param emailAddr person email address
    * @param phoneNum person phone number 
    */
    public Person(String fname, String lname, String emailAddr, String phoneNum) {
        firstName = fname;
        lastName = lname;
        email = emailAddr;
        phoneNumber = phoneNum;

        amountEarnedTD = 0.0;
    }

    /**
     * method- getter method that returns the person's first name
     * @return first name of the person]
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * method- getter method that returns the person's last name
     * @return first last of the person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * method- getter method that returns the person's email
     * @return person's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * method- getter method that returns the person's phone number
     * @return person's phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * method- setter method that updates the person's email 
     * @param emailAddr new updated email address
     */
    public void setEmail(String emailAddr) {
        this.email = emailAddr;
    }

    /**
     * method- setter method that updates the person's phone number 
     * @param phoneNum new updated phone number
     */
    public void setPhoneNumber(String phoneNum) {
        this.phoneNumber = phoneNum;;
    }

    /**
     * method- getter method that returns the amount of money
     * a person has made to date
     * @return the amount of money earned to date
     */
    public Double getAmountEarnedTD() {
        return amountEarnedTD;
    }

    /**
     * method- setter method that updates the amount
     * a person has made to date
     * @param amountEarned amount of money a person has newly earned
     */
    public void setAmountEarnedTD(Double amountEarned) {
        amountEarnedTD += amountEarned;
    }

    

    // Declare abstract methods
    public abstract void collectPaycheque();

    public abstract Double getAmountPaid();


}
