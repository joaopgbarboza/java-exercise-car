package java_ex;

public class City implements CarInterface{
    @Override
    public void turnOn() {
        System.out.println("City is on");
    }

    @Override
    public void turnOff() {
        System.out.println("City is off");
    }

    @Override
    public void accelerate() {
        System.out.println("City is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("City is braking");
    }
}
