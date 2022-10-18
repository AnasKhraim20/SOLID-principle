package ISP;

public class Eagle implements IFlying,IMolting {

    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void fly() {
        this.currentLocation = "in the air";
    }

    @Override
    public void Molt() {

    }

    @Override
    public void molt() {

        this.numberOfFeathers -= 1;
    }



}
