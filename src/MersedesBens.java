public class MersedesBens extends Car implements Printable{

    private String design;

    public void setDesign(String design) {
        this.design = design;
    }

    public String getDesign() {
        return design;
    }

    public MersedesBens(String mark, int year, int engine, String design) {
        super(mark, year, engine);
        this.design = design;
    }



   public void print(){
       System.out.println("Model: " + getMark() +
               "\nYear: " + getYear() +
               "\nEngine: " + getEngine() +
               "\nDesign: " + getDesign());
   }
}
