package Rental;

/**
 * Date: 5/29/16
 * Session Time - Started: 9:19 am
 *              - Ended:  10:52 am
 * @author Alfredo
 */
public abstract class Rental {
    
    private boolean newModel; /// Our is a new model flag..
    private double rentalCost; /// How much our product costs.
    private long rentalNumber; /// Our rental ID number for the product.
    
    /// Contructor for rental.
    public Rental(boolean newModel, double rentalCost, long rentalNumber){
        this.setNewModel(newModel);
        this.setRentalCost(rentalCost);
        this.setRentalNumber(rentalNumber);
    }
    
    /// Equals method
    public boolean isEqual(long rentalNumber){
        boolean equal = false; /// Set it equal by defualt.
        if(this.getRentalNumber() == rentalNumber)
            equal = true;
        return equal;
    }

    /**
     * @return the newModel
     */
    public boolean isNewModel() {
        return newModel;
    }

    /**
     * @param newModel the newModel to set
     */
    public void setNewModel(boolean newModel) {
        this.newModel = newModel;
    }

    /**
     * @return the rentalCost
     */
    public double getRentalCost() {
        return rentalCost;
    }

    /**
     * @param rentalCost the rentalCost to set
     */
    public void setRentalCost(double rentalCost) {
        if(rentalCost > 0.0)this.rentalCost = rentalCost;
        else{
            throw new IllegalArgumentException("Invalid rental cost value."
                    + " It must be non-negative! ");
        }
    }

    /**
     * @return the rentalNumber
     */
    public long getRentalNumber() {
        return rentalNumber;
    }

    /**
     * @param rentalNumber the rentalNumber to set
     */
    public void setRentalNumber(long rentalNumber) {
        if(rentalNumber > 0 || rentalNumber < (9.22e18)-1)
            this.rentalNumber = rentalNumber;
        else{
            throw new IllegalArgumentException("Invalid rental number rental"
                    + " number must be between 0 and (9.22^18)-1");
        }
    }
    
    public abstract double lateCharge();
}
