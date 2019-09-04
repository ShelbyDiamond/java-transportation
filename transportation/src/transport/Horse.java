package transport;

// interfaces you can have more than one (Vehicle, Animal)
public class Horse implements Vehicle, Animal {
    private int fuel = 0;
    private String name;

    public Horse(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // an @override impliments the method inside of the class
    @Override
    public void eat(int i) {
        fuel = fuel + i;
    }

    @Override
    public String speak() {
        return "Neigh";
    }

    @Override
    public String getPath() {
        return "Grass";
    }

    @Override
    public void move() {
        fuel = fuel - 1;
    }

    @Override
    public int getFuelLevel() {
        return fuel;
    }

    @Override
    public void addFuel(int i) {
        eat(i);
    }
}
