
/**
 * Class to model the purchase date of a vehicle by a customer.
 *
 * @author Mary Lee
 * @version 1.0 2017-11-12
 */
import java.text.DecimalFormat;
public class PurchaseDate
{
    // Constants
    public static final int CURRENT_YEAR = 2017;
    
    public static final int JANUARY = 1;
    public static final int DECEMBER = 12;
    
    public static final int FIRST_DAY = 1;
    public static final int LAST_DAY = 31;
    
    //Declaration of instance variables to model the purchase date
    private int year;
    private int month;
    private int day;

    /** 
     * Default constructor
     */
    public PurchaseDate()
    {
        year    = CURRENT_YEAR;
        month   = JANUARY;
        day     = FIRST_DAY;
    }
    /**
     * Constructor for creating a PurchaseDate with all listed instance
     * variables.
     * 
     * @param year  The year the vehicle was purchased
     * @param month The month the vehicle was purchased
     * @param day   The day the vehicle was purchased
     */
    public PurchaseDate(int theYear, int theMonth, int theDay)
    {
        // initialise instance variables
        this.setYear(theYear);
        this.setMonth(theMonth);
        this.setDay(theDay);
    }
    
    /**
     * Sets the year a vehicle was purchased.
     * @param year  The new purchase year of the PurchaseDate.
     */
    public void setYear (int year)
    {
        if(year > 0 && year <= CURRENT_YEAR)
        {
            this.year = year;
        }
        else
        {
            this.year = CURRENT_YEAR;
        }
    }
    
    /**
     * Sets the month a vehicle was purchased.
     * @param month The new purchase month of the PurchaseDate.
     */
    public void setMonth (int month)
    {
        if(month >= JANUARY && month <= DECEMBER)
        {
            this.month = month;
        }
        else
        {
            this.month = JANUARY;
        }
    }
    
    /**
     * Sets the day a vehicle was purchased.
     * @param day   The new purchase day of the PurchaseDate.
     */
    public void setDay (int day)
    {
        if(day >= FIRST_DAY && day <= LAST_DAY)
        {
            this.day = day;
        }
        else
        {
            this.day = FIRST_DAY;
        }
    }
    
    /**
     * Get the year of the PurchaseDate.
     * @return year  Integer of the year a vehicle was purchased.
     */
    public int getYear ()
    {
        return year;
    }
    
    /**
     * Get the month of the PurchaseDate.
     * @return month  Integer of the month a vehicle was purchased.
     */
    public int getMonth ()
    {
        return month;
    }
    
    /**
     * Get the day of the PurchaseDate.
     * @return day  Integer of the day a vehicle was purchased.
     */
    public int getDay ()
    {
        return day;
    }
    
    /**
     * Get the full purchase date information of PurchaseDate.
     * @return  String of the purchase date in the format yyyy-mm-dd.
     */
    public String getFullPurchaseDate ()
    {
        DecimalFormat formatter = new DecimalFormat("00");
        return year + "-" + formatter.format(month) + "-" + formatter.format(day);
    }
}
