public class Boat implements Tradable, Drivable {
    private int speed;
    private int length;

    public Boat() {
        this.speed = 10;
    }

    @Override
    public void upgradeSpeed()  {
        this.speed+= 10;
    }

    @Override
    public void downgradeSpeed() {
        this.speed-= 10;
    }

    @Override
    public int getMaxSpeed() {
        return this.speed;
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
