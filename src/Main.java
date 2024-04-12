import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(new Car("Lexus","570",2023));
        carArrayList.add(new Car("Mercedes", "Benz", 2021));
        carArrayList.add(new Car("Zhiguli","S",2000));
        carArrayList.add(new Car("Lexus","570 S",2025));
        carArrayList.add(new Car("Lexus","570 Q",2029));

        ArrayList<Car> cars = Car.getCarsAfterYear(carArrayList,2023);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).getBrand() + " " + cars.get(i).getModel() + " " + cars.get(i).getYear());
        }
    }
}