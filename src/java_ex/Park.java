package java_ex;

public abstract class Park {
    protected String place;
    public Park(String place){
        this.place = place;
    }
    public abstract void parking();

    public void gasLevel(){
        System.out.println("Gas level is low");
    }
}