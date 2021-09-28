public class Bike implements Tradable, Drivable {
    private int maxSpeed;
    private int costQuality;
  
    public Bike() {
    this.maxSpeed = 1
    this.costQuality = 10
    }
    
    @Override
    public void upgradeSpeed() {
    this.maxSpeed++;
    }
    
    @Override
    public void downgradeSpeed() {
    this.maxSpeed--;
    }
    
    @Override
    public int getMaxSpeed() {
    return this.maxSpeed;
    }
    
    @Override
    public int getPrice() {
    return this.costQuality;
    }
    
    @Override
    public String toString() {
    return "Bike with max speed " + this.maxSpeed + " and cost quality " + this.costQuality;
    }
  
}
