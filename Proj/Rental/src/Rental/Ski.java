package Rental;

/**
 * Date: 5/29/16
 * Session Time 
 *      Start: 10:52 AM
 *        End: 11:10 AM
 * @author Alfredo
 */
public class Ski extends Rental{
    
    private int size;
    
    public Ski(boolean newModel, double rentalCost, long rentalNumber, int size){
        super(newModel, rentalCost, rentalNumber);
        this.setSize(size);
    }

    @Override
    public double lateCharge() {
        return (getRentalCost() + (getRentalCost() * .10));
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        if(size > 0)this.size = size;
        else
            throw new IllegalArgumentException(" Size is Invalid"
                    + ", it cannot be negative.");
    }
    
    @Override
    public String toString(){
        return String.format("New Model: %s\nRental Cost: %.2f\n"
                + "Rental Number: %d\nSize: %d cm\n", isNewModel(), 
                getRentalCost(), getRentalNumber(), size);
    }
    
}
