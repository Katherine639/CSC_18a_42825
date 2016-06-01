package Rental;

/**
 * Date: 5/29/16
 * Session Time 
 *      Start: 1:15 PM
 *        End: 1:31 PM
 * @author Alfredo
 */
public class Snowboard extends Rental {
    private int size;
    private boolean freeStyle;
    
    public Snowboard(boolean newModel, double rentalCost, long rentalNumber,
             int size, boolean freeStyle){
        super(newModel, rentalCost, rentalNumber);
        this.setSize(size);
        this.setFreeStyle(freeStyle);
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
            throw new IllegalArgumentException("A snowboard's size can "
                    + "not be negative.");
    }

    /**
     * @return the freeStyle
     */
    public boolean isFreeStyle() {
        return freeStyle;
    }

    /**
     * @param freeStyle the freeStyle to set
     */
    public void setFreeStyle(boolean freeStyle) {
        this.freeStyle = freeStyle;
    }

    @Override
    public double lateCharge() {
        return getRentalCost() + (getRentalCost()*.20);
    }
    
    @Override
    public String toString(){
        return String.format("Is it a new model?: %s"+
                "\nRental Number: %d"+
                "\nSize: %d cm\nFree Syle?: %s"+
                "\nRental Cost: $ %.2f", isNewModel(),getRentalNumber(),
                size, freeStyle, getRentalCost());
    }
}
