package cars;

public class OldCar extends Car {

    int year;

    public OldCar(int wheelNumber, int horsePower, String model, int year) {
        super(wheelNumber, horsePower, model);
        this.year = year;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Year: " + year);
    }

}
