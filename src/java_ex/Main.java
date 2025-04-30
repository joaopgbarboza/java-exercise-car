package java_ex;

public class Main {
    public static void main(String[] args){
        CarInterface myCar = new Fit();
        CarInterface myCar1 = new City();
        CarInterface myCar2 = new HRV();

        Park myPark = new GasStation();
        System.out.println(myPark);
        myPark.parking();
        myPark.gasLevel();


        myCar.turnOn();
        myCar1.accelerate();
        myCar1.brake();
        myCar2.turnOff();


    }
}

