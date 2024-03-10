package cars;

public class Car {

    public int wheelNumber;
    public int horsePower;
    public String model;

    public void print() {
        System.out.println("Wheel number: " + wheelNumber);
        System.out.println("Horse power: " + horsePower);
        System.out.println("Model: " + model);
    }

    public void print(int n) {
        for (int i = 0; i < n; i++) {
            print();
        }
    }

    public Car(int wheelNumber, int horsePower, String model) {
        this.wheelNumber = wheelNumber;
        this.horsePower = horsePower;
        this.model = model;
    }
}
