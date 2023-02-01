import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {return inventory;}

    public void addCar(Car car) {
        inventory.add(car);
    }

    public boolean swap(int i1, int i2) {
        int size = inventory.size();

        if (i1>=size || i2>=size) {return false;} // Early return if either index is invalid

        inventory.set(i1,inventory.set(i2,inventory.get(i1)));

        return true;
    }
}
