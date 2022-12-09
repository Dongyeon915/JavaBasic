package cc;

public class Car {

    int numOfDoors;
    int numOfWheels;
    String brand;
    String name;

    public  Car() {

    }

    public Car(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public Car(int numOfDoors, int numOfWheels, String brand, String name) {
        this.numOfDoors = numOfDoors;
        this.numOfWheels = numOfWheels;
        this.brand = brand;
        this.name = name;
    }

    public void turnRight() {
        System.out.println("오른쪽 깜빡이");
    }

    public void turnLeft() {
        System.out.println("왼쪽 깜빡이");
    }

    public void controlHandle(String direction) {
        System.out.println(direction + "방향으로 이동");
    }

    public void openDoor() {
        System.out.println("문열림");
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public void charge(int amount) {

    }
}
