public class Car {
    private String mark;
    private  int year;
    private int engine;

    public String getMark() {
        return mark;
    }

    public int getYear() {
        return year;
    }

    public int getEngine() {
        return engine;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public Car(String mark, int year, int engine) {
        this.mark = mark;
        this.year = year;
        this.engine = engine;
    }


}
