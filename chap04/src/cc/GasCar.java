package cc;

public class GasCar extends Car {
    int amountGas;

    public int getAmountGas() {
        System.out.println("가스가 " + amountGas + "만큼 남았습니다.");
        return amountGas;
    }

    public void setGasCharge(int amountGas) {
        System.out.println("가스가 " + amountGas + "만큼 충전되었습니다.");
        this.amountGas += amountGas;
        System.out.println("총 가스: " + this.amountGas);
    }

    @Override
    public void charge(int amount) {
        this.amountGas = amount;
    }
}
