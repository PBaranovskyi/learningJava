package andriiarzhanov.classwork_170426;

import java.util.Arrays;

/**
 * Created by arzhanov on 26.04.17.
 */
public class Common {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("purple");
        cars[1] = null;
        cars[2] = new Car("black");
        cars = addCarToArray(cars, new Car("white"));
        cars = addCarToArray(cars, new Car("grey", 1.2));
        cars = addCarToArray(cars, new Car("blue"));
        cars = addCarToArray(cars, new Car("orange", 2.0));
        cars = addCarToArray(cars, new Car("red", 1.5));
        System.out.println(Arrays.toString(cars));
        for (int i = 0; i < cars.length; i++) {
            if(cars[i] != null) {
                System.out.println("Car" + i + " [color: " + cars[i].getColor() + ", engine: " + cars[i].getEngineValue() + "]");
            }
        }
    }

    public static Car[] addCarToArray(Car[] carArray, Car newCar) {
        if (carArray[carArray.length - 1] == null) {
            for (int i = carArray.length; i >= 0; i++) {
                if (carArray[i] != null) {
                    carArray[i + 1] = newCar;
                    return carArray;
                }
            }
        }

        Car[] newCarArray = Arrays.copyOf(carArray, carArray.length + 1);
        newCarArray[carArray.length] = newCar;
        return newCarArray;
    }
}
