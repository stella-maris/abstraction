
/**
 * Class to model a Customer
 *
 * @author Mary Lee
 * @version 1.0 2017-11-04
 */
public class Customer
{
    private String firstName;
    private String lastName;
    private String driversLicense;
    private String address;
    private String phoneNumber;
    
    /**
     * Default constructor.
     */
    public Customer()
    {
        firstName = "Jane";
        lastName = "Doe";
        driversLicense = "BC-001";
        address = "unknown";
        phoneNumber = "(604)555-1234";
    }
    
    /**
     * Constructor for creating a Customer with all listed instance
     * instance variables.
     * 
     * @param firstName         The first name of our Customer
     * @param lastName          The first name of our Customer
     * @param driversLicense    The driver's license which can be alpha-numeric of our Customer
     * @param address           The street address of our Customer's residence.
     * @param phoneNumber       The phone number including area code of our Customer.
     */
    public Customer (String firstName, String lastName, String driversLicense, String address, String phoneNumber)
    {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setDriversLicense(driversLicense);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);  
    }
    
    /**
     * Sets the first name of our Customer.
     * @param firstName The new first name of the Customer.
     * 
     */
    public void setFirstName(String firstName)
    {
        if (firstName != null && firstName.trim().length() > 0 )
        {
            this.firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        }
        else
        {
            System.out.println("Not a valid first name.");
        }
    }
    
    /**
     * Sets the last name of our Customer.
     * @param lastName The new last name of the Customer.
     * 
     */
    public void setLastName(String lastName)
    {
        if (firstName != null && lastName.trim().length() > 0 )
        {
            this.lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        }
        else
        {
            System.out.println("Not a valid last name.");
        }
    }
    
    /**
     * Sets the driver's licese of our Customer.
     * @param driversLicense    The new driver's license of this Customer.
     * 
     */
    public void setDriversLicense(String driversLicense)
    {
        if (driversLicense != null && driversLicense.trim().length() > 0 )
        {
            this.driversLicense = driversLicense;
        }
        else
        {
            System.out.println("Not a valid driver's license.");
        }
    }
    
    /**
     * Sets the address of our Customer.
     * @param address   The new address of this Customer.
     * 
     */
    public void setAddress(String address)
    {
        if (address != null && address.trim().length() > 0)
        {
            this.address = address;
        }
        else
        {
            System.out.println("Not a valid address.");
        }
    }
    
    /**
     * Sets the phone number of our Customer.
     * @param phoneNumber   The new phone number of this Customer.
     * 
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Get the first name of the customer.
     * @return  The first name of this customer.
     */
    public String getFirstName ()
    {
        return firstName;
    }
    
    /**
     * Get the last name of the customer.
     * @return  The last name of this customer.
     */
    public String getLastName ()
    {
        return lastName;
    }
    
    /**
     * Get the license of the customer.
     * @return  The driver's license of this customer.
     */
    public String getDriversLicense ()
    {
        return driversLicense;
    }
    
    /**
     * Get the address of the customer.
     * @return  The address of this customer.
     */
    public String getAddress ()
    {
        return address;
    }
    
    /**
     * Get the phone number of the customer.
     * @return  The phone number of this customer.
     */
    public String getPhoneNumber ()
    {
        return phoneNumber;
    }
    
    /**
     * Get the full name of the customer.
     * @return  A string the displays the full name of this customer
     */
    public String getFullName ()
    {
        return firstName + " " + lastName;
    }
}
