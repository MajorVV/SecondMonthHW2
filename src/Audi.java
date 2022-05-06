public class Audi extends Car implements Printable{

    private String corps;

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public Audi(String mark, int year, int engine, String corps) {
        super(mark, year, engine);
        this.corps = corps;
    }

    public void print(){
        System.out.println("Model: " + getMark() +
                "\nYear: " + getYear() +
                "\nEngine: " + getEngine() +
                "\nCorps: " + getCorps());
    }


}
