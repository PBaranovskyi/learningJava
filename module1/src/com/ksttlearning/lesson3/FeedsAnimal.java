package com.ksttlearning.lesson3;

/**
 * Created by citsym on 19.04.17.
 */
public class FeedsAnimal {

    public static void main(String[] args) {

        Animal catVasya = new Animal("cat", "whiskass");
        Animal mokeyNina = new Animal("monkey", "banana");
        Animal elephantKolya = new Animal("elephant", "grass");

        Animal catPetya = new Animal("cat", "mice");

        catPetya.feed();


        mokeyNina.feed();
        catVasya.feed();
        elephantKolya.feed();
        catPetya.feed();

    }
}
