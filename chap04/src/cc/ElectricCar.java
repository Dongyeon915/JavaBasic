package cc;

public class ElectricCar extends Car {
    int amountElect;

    public ElectricCar() {
        this.brand = "현대자통차";
    }

    public ElectricCar(int amountElect) {
        super();
        this.brand = "현대자통차";
        this.amountElect = amountElect;
    }

    public ElectricCar(String brand, String name, int amountElect) {
        super(brand, name);
        this.amountElect = amountElect;
    }

    public ElectricCar(int door, int wheel, String brand, String name, int amountElect) {
        super(door, wheel, brand, name);
        this.amountElect = amountElect;
    }



    public int getAmountElect() {
        System.out.println("전기가 " + amountElect + "만큼 남았습니다.");
        return amountElect;
    }

    public void setElectCharge(int amountElect) {
        System.out.println("가스가 " + amountElect + "만큼 충전되었습니다.");
        this.amountElect += amountElect;
        System.out.println("총 가스: " + this.amountElect);
    }

    @Override
    public void charge(int amount) {
        super.charge(amount);
        this.amountElect = amount;
    }
}
