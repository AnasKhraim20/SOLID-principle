package ISP;

public class Penguin implements IMolting,Iswimming {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void Molt() {
        this.numberOfFeathers-=1;
    }

    public void swim() {

        this.currentLocation = "in the water";
    }
}
