public class BMW extends Car implements  Printable{

    private double version;

    public void setVersion(double version) {
        this.version = version;
    }

    public double getVersion() {
        return version;
    }

    public BMW(String mark, int year, int engine, double version) {
        super(mark, year, engine);
        this.version = version;
    }

    public void print(){
        System.out.println("Model: " + getMark() +
                "\nYear: " + getYear() +
                "\nEngine: " + getEngine() +
                "\nVersion: " + getVersion());
    }


}
