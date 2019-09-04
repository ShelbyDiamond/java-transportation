package transport;

//abstract classes you can only have one (AbstractVehicle)
public abstract class AbstractVehicle {
    // writing it like this, means protected. It is esentially a private class that
    // can be inherited. Private classes can't be inherited.

    int fuel;

    public AbstractVehicle(int fuel) {
        this.fuel = fuel;
    }

    public AbstractVehicle() {
        fuel = 1;
    }

    public abstract String getPath();

    public abstract String getName();

    public void move() {
        fuel--;
    };

    public void move(int steps) {
        fuel = fuel - steps;
    }

    public int getFuelLevel() {
        return fuel;
    };

    public void addFuel(int i) {
        fuel++;
    }
}
