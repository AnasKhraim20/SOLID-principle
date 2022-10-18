package DIP.devices;

import DIP.interfaces.IKeyboard;

public class Keyboard implements IKeyboard {
    public void powerOn(){
        System.out.println("Power on " + this.getClass().getName());
    }

    public void powerOff(){
        System.out.println("Power off " + this.getClass().getName());
    }


}

