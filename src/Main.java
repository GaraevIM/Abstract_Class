import Battery.Battery77;
import Battery.Battery83;
import Doors.FourDoors;
import Doors.TwoDoors;
import Range.Range210;
import Range.Range270;
import Wheels.WheelsR18;
import Wheels.WheelsR20;

public class Main {
    public static void main(String[] args) {
        TwoDoors twoDoors = new TwoDoors();
        WheelsR20 wheelsR20 = new WheelsR20();
        FourDoors fourDoors = new FourDoors();
        WheelsR18 wheelsR18 = new WheelsR18();

        Jaguar jaguar = new Jaguar(wheelsR20, twoDoors);
        Kia kia = new Kia(wheelsR18, fourDoors);
        System.out.println(jaguar.doors.stake());
        System.out.println(jaguar.wheels.size());
        System.out.println(kia.doors.stake());
        System.out.println(kia.wheels.size());

        Battery77 battery77 = new Battery77();
        Battery83 battery83 = new Battery83();
        Range210 range210 = new Range210();
        Range270 range270 = new Range270();

        eBusIkarus eBusIkarus = new eBusIkarus(battery77, range210);
        eBusLiaz eBusLiaz = new eBusLiaz(battery83, range270);
        System.out.println(eBusIkarus.battery.Capacity());
        System.out.println(eBusIkarus.range.powerReserve());
        System.out.println(eBusLiaz.battery.Capacity());
        System.out.println(eBusLiaz.range.powerReserve());
    }
}
