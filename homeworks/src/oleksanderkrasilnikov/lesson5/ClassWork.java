package oleksanderkrasilnikov.lesson5;

import java.util.Arrays;

public class ClassWork {


    public static void main(String[] args) {

        Car firstCar = new Car("green");
        Car secondCar = new Car("black");
        Car thirdCar = new Car("yellow");
        Car[] array = new Car[0];

        array = addCarToArray(array, firstCar);
        array = addCarToArray(array, secondCar);
        array = addCarToArray(array, thirdCar);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getColor());
        }
    }


    public static Car[] addCarToArray(Car[] array, Car newCar) {

        if (array[array.length - 1] == null) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] != null) {
                    array[i + 1] = newCar;
                    return array;
                }
            }
        }
        Car[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = newCar;
        return newArray;
    }
}
