
/**
 * A class to model the purchase of a vehicle by a customer.
 *
 * @author Mary Lee
 * @version 1.0 2017-11-13
 */
import java.text.DecimalFormat;
public class VehiclePurchase
{
    
    private Customer customer;
    private PurchaseDate purchaseDate;
    private Vehicle vehiclePurchased;
    private boolean servicePackage;
    
    public static final double SERVICE_FEE = 500.00;

    /**
     * Constructor for objects of class VehiclePurchase
     * @param renter            The customer purchasing a vehicle
     * @param purchaseDate      The date the vehicle is purchased in int yyyy, m, d.
     * @param vehiclePurchased  The vehicle that is purchased
     * @param servicePackage    Verifies whether a service package was purchased
     */
    public VehiclePurchase(Customer renter, PurchaseDate purchaseDate, Vehicle vehiclePurchased, boolean servicePackage)
    {
        this.customer = renter;
        this.purchaseDate = purchaseDate;
        this.vehiclePurchased = vehiclePurchased;
        this.servicePackage = servicePackage;
    }
    
    public void setServicePackage (boolean servicePackage)
    {
        this.servicePackage = servicePackage;
    }
    
    /**
     * Get the customer information.
     * @return customer Customer instance for this particular purchase.
     */
    public Customer getCustomer () 
    {
        return customer;
    }
    
    /**
     * Get the purchase date of this vehicle.
     * @return purchaseDate PurchaseDate instance for this particular purchase.
     */
    public PurchaseDate getPurchaseDate ()
    {
        return purchaseDate;
    }
    
    /**
     * Get the vehicle purchased.
     * @return vehiclePurchased    Vehicle instance that was purchased.
     */
    public Vehicle getVehiclePurchased ()
    {
        return vehiclePurchased;
    }
    
    public void calculatePurchasePrice (double purchasePrice) 
    {
        vehiclePurchased.setSellingPrice(purchasePrice);
        if (servicePackage)
        {
            vehiclePurchased.setSellingPrice(purchasePrice + SERVICE_FEE);
        }
    }
    
    /**
     * formats and displays all vehicle information.
     */
    public void displayDetails()
    {
        DecimalFormat formatter = new DecimalFormat("$0.00");
        DecimalFormat percentFormatter = new DecimalFormat("0%");

        System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("Purchase Date: " + purchaseDate.getFullPurchaseDate());
        System.out.println("Vehicle Description: Jalopies Are Us Vehicle Summary:");
        System.out.println("Vehicle: " + vehiclePurchased.getYear() + " " + vehiclePurchased.getMake() + " " + vehiclePurchased.getModel());
        System.out.println("Stock Code:" + vehiclePurchased.getStockCode());
        System.out.println("Dealer Cost: " + formatter.format(vehiclePurchased.getdealerCost()));
        System.out.println("Selling Price: " + formatter.format(vehiclePurchased.getSellingPrice()));
        System.out.println("Profit Margin: " + percentFormatter.format(vehiclePurchased.getProfitMargin()));
        System.out.println("Dollar Profit: " + formatter.format(vehiclePurchased.calculateProfit()));
        if (servicePackage)
        {
            System.out.println("SERVICE PACKAGE INCLUDED");
        }
        else
        {
            System.out.println("SERVICE PACKAGE NOT INCLUDED");
        }
    }
}
