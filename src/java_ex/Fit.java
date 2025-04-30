package java_ex;

public class Fit implements CarInterface{
    @Override
    public void turnOn() {
        System.out.println("Fit is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fit is off");
    }

    @Override
    public void accelerate() {
        System.out.println("Fit is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Fit is braking");
    }
}
