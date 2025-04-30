package java_ex;

public class HRV implements CarInterface{

    @Override
    public void turnOn() {
        System.out.println("HRV is on");
    }

    @Override
    public void turnOff() {
        System.out.println("HRV is off");
    }

    @Override
    public void accelerate() {
        System.out.println("HRV is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("HRV is braking");
    }
}
