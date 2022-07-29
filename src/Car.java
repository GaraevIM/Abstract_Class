import Doors.Doors;
import Wheels.Wheels;

public abstract class Car {
    Wheels wheels;
    Doors doors;

    public Car(Wheels wheels, Doors doors) {
        this.wheels = wheels;
        this.doors = doors;
    }
}
