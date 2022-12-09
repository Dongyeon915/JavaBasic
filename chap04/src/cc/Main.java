package cc;

public class Main {

    public static void main(String[] args) {
        GasCar car01 = new GasCar();
        car01.setGasCharge(1000);
        car01.turnLeft();
        car01.controlHandle("앞");

        ElectricCar car02 = new ElectricCar();
        car02.brand = "기아";
        car02.setElectCharge(1000);
        car02.turnRight();
        car02.controlHandle("뒤");
        System.out.println(car02.getName());
        System.out.println(car02.getBrand());
        System.out.println(car02.getNumOfDoors());
        printBrandE(car02);
        Car car05 = new ElectricCar();
        car05.brand = "현대";
        Car car06 = new GasCar();
        car06.brand = "토요타";
        printBrandAll(car05);
        printBrandAll(car06);
        car05.charge(100);
    }

    public static void printBrandE(ElectricCar car) {
        System.out.println(car.getBrand());
    }

    public static void printBrandG(GasCar car) {
        System.out.println(car.getBrand());
    }

    public static void printBrandAll(Car car) {
        System.out.println(car.getBrand());
    }
}
