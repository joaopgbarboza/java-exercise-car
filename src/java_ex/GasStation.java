package java_ex;

public class GasStation extends Park {
    public GasStation(){
        super("Gas Station");
    }

    @Override
    public void parking(){
        System.out.println(this.place);
        System.out.println("Parking in gas station");
    }

    @Override
    public void gasLevel(){
        System.out.println("Gas level is full");
    }

}
