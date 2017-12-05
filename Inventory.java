
/**
 * A class to model the vehicles currently in inventory.
 *
 * @author Mary Lee
 * @version 1.0 2017-12-03.
 */
import java.util.ArrayList;
import java.util.Iterator;
public class Inventory
{
    private static ArrayList<Vehicle> vehicles;
    
    public Inventory()
    {
        vehicles = new ArrayList<>();
    }
    
    public void addVehicle(Vehicle vehicle)
    {
        if (vehicle != null)
        {
            vehicles.add(vehicle);
        }
        else
        {
            System.out.println("Vehicle has not been added to inventory.  Fill in all details for vehicle.");
        }
    }
    
    public void searchByModel(String model)
    {
        //use for-each
        ArrayList<Vehicle> searchModel = new ArrayList<>();
        for (Vehicle tempCar : vehicles)
        {
            if (tempCar.getModel().equals(model))
            {
                searchModel.add(tempCar);
            }
        }
        //System.out.println(searchModel.get(0).getModel());
        displaySearchResults(searchModel);
    }
    
    public void searchByYear(int year)
    {
        //use for-each
        ArrayList<Vehicle> searchYear = new ArrayList<>();
        for (Vehicle tempCar : vehicles)
        {
            if (tempCar.getYear() == year)
            {
                searchYear.add(tempCar);
            }
        }
        //System.out.println(searchYear.size());
        displaySearchResults(searchYear);
    }
    
    public void searchByPrice(double minPrice, double maxPrice)
    {
        //use for-each
        ArrayList<Vehicle> searchPrice = new ArrayList<>();
        for (Vehicle tempCar : vehicles)
        {
            if ( tempCar.getSellingPrice() >= minPrice && tempCar.getSellingPrice() <= maxPrice)
            {
                searchPrice.add(tempCar);
            }
        }
        displaySearchResults(searchPrice);
    }
    
    public void displaySearchResults(ArrayList<Vehicle> results)
    {
        System.out.println("*--DISPLAY SEARCH RESULTS--*");
        for (Vehicle tempCar : results)
        {
            System.out.println(tempCar.getMake());
            System.out.println(tempCar.getModel());
            System.out.println(tempCar.getYear());
            System.out.println(tempCar.getSellingPrice());
        }

    }
    
    public static void removeVehicle (String stockCode)
    {//use iterator
        Iterator <Vehicle> it = vehicles.iterator();
        while (it.hasNext())
        {
            Vehicle car = it.next();
            if (car.getStockCode().equals(stockCode))
            {
                it.remove();
            }
        }
    }
    
    /**
     * @return  A message that includes the number of vehicles currently in inventory
     */
    public String inventoryCount ()
    {
        //System.out.println("There are " + vehicles.size() + " vehicles in stock.");
        return "There are " + vehicles.size() + " vehicles in stock.";
    }
    
    /**
     * @return  The formatted String that is the current total dollar value of all the Vehicles in inventory.
     */
    public String inventoryValue ()
    {
        return "The total value is ";
    }
    
    public void displayInventory ()
    {
        System.out.println("*--DISPLAY INVENTORY--*");
        for (Vehicle tempCar : vehicles)
        {
            System.out.println(tempCar.getStockCode());
            System.out.println(tempCar.getMake());
            System.out.println(tempCar.getModel());
            System.out.println(tempCar.getYear());
            System.out.println(tempCar.getSellingPrice());
            System.out.println(tempCar.getdealerCost());
            System.out.println(tempCar.getProfitMargin());
            
            System.out.println("*--------------------*");
        }
    }
}
