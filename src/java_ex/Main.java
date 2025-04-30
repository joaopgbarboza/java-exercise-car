package java_ex;

public class Main {
    public static void main(String[] args){
        CarInterface myCar = new Fit();
        CarInterface myCar1 = new City();
        CarInterface myCar2 = new HRV();

        myCar.turnOn();
        myCar1.accelerate();
        myCar2.turnOff();
    }
}

