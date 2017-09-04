package com.ksttlearning.lesson14;

import com.ksttlearning.lesson3.Car;

import java.util.Arrays;

/**
 * Created by citsym on 03.07.17.
 */
public class UseGenerics {

    public static void main(String[] args) {
        String speed;
        speed = "100";

        Store<Car> store = new Store<>();

//        Car car = store.buy(100);
//
//        System.out.println(car.getPrice());
//
//        Car[] carArray = new Car[0];
//
//        carArray = addElementToArray(carArray, store.buy(new MasterCard()));
//        carArray = addElementToArray(carArray, store.buy(new MasterCard()));
//        carArray = addElementToArray(carArray, store.buy(new MasterCard()));
//
//
//        Store<Service> serviceStore = new Store<>();
//        Service[] serviceArray = new Service[0];
//
//        Visa<Procredit> creditCard = new Visa<>(new Procredit());
//        Service service = serviceStore.buy(creditCard);
//
//        Procredit bank = creditCard.getBank();
//        serviceArray = addElementToArray(serviceArray, service);
//
//
//        Store generalStore = new Store();
//        Item item = generalStore.buy(1000);
//
//        item.getPrice();


    }


    private static <E> E[] addElementToArray(E[] oldArray, E newElement) {
        E[] newCars = Arrays.copyOf(oldArray, oldArray.length + 1);
        newCars[newCars.length - 1] = newElement;
        return newCars;
    }

}
