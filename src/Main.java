import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Printable[] Car = {createObject("FirstCar"), createObject("SecondCar"), createObject("TheerdCar")};
        for (Printable printable : Car) {
            printable.print();

        }


    }

    public static Printable createObject(String Car) {
        return switch (Car) {
            case "FirstCar" -> new Audi("Audi", 2004, 8, "22");
            case "SecondCar" -> new BMW("BMW", 2013, 4, 1.18);
            case "TheerdCar" -> new MersedesBens("Mers", 2019, 12, "Sport");
            default -> null;
        };
    }
}