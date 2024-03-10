package cars;


public class PremiumCar extends Car {

    private int price;

    public PremiumCar(int wheelNumber, int horsePower, String model, int price) {
        super(wheelNumber, horsePower, model);
        this.price = price;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Price: " + price);
    }
}
