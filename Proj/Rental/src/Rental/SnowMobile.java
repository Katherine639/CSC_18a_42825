package Rental;

/**
 * Date: 5/29/16
 * Session Time 
 *      Start: 1:32 PM
 *        End: 1:47 PM
 * @author Alfredo
 */
public class SnowMobile extends Rental{
    
    private int capacity;
    private String VIN;
    
    public SnowMobile(boolean newModel, double rentalCost, long rentalNumber,
            int capacity, String VIN){
        super(newModel, rentalCost, rentalNumber);
        this.setCapacity(capacity);
        this.setVIN(VIN);
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        if(capacity > 0)this.capacity = capacity;
        else throw new IllegalArgumentException("Capacity can not be less the zero.");
    }

    /**
     * @return the VIN
     */
    public String getVIN() {
        return VIN;
    }

    /**
     * @param VIN the VIN to set
     */
    public void setVIN(String VIN) {
        if(VIN != "")this.VIN = VIN;
        else throw new IllegalArgumentException("VIN can not be empty");
    }
    
    public String toString(){
        return String.format("Is it a new model?: %s"+
                "\nRental Number: %d"+
                "\nVIN: %s\nCapacity: %d"+
                "\nRental Cost: $ %.2f", isNewModel(),getRentalNumber(),VIN,
                capacity, getRentalCost());
    }

    @Override
    public double lateCharge() {
        return (getRentalCost()+(getRentalCost()*((20+(double)capacity*5)/100.00)));
    }
    
}
