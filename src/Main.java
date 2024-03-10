import cars.Car;
import cars.OldCar;
import cars.PremiumCar;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(4, 210, "Mazda");
        PremiumCar premiumCar = new PremiumCar(4, 234, "RolsRoys",11_233_213);
        OldCar oldCar = new OldCar(3, 100, "Ford", 1960);

        Car [] carArray = new Car[5];
        carArray[0] = premiumCar;
        carArray[1] = oldCar;
        carArray[2] = car;

        for (int i = 0; i < 3; i++) {
            carArray[i].print();
            System.out.println();
        }
    }
}