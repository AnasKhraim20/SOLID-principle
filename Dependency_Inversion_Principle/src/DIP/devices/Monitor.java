package DIP.devices;
import DIP.interfaces.IMonitor;

public class Monitor implements IMonitor {

    public void turnOn(){
        System.out.println("Turn on " + this.getClass().getName());
    }

    public void turnOff(){
        System.out.println("Turn off " + this.getClass().getName());
    }


}
