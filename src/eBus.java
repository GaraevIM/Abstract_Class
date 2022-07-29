import Battery.Battery;
import Range.Range;

public abstract class eBus {
    Battery battery;
    Range range;

    public eBus(Battery battery, Range range) {
        this.battery = battery;
        this.range = range;
    }

}


