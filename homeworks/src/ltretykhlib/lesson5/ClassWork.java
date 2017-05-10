package ltretykhlib.lesson5;

import ltretykhlib.ltretykhlib.lessontask.Animal;

import java.util.Arrays;


/**
 * Created by Tretykhlib on 26.04.2017.
 */
public class ClassWork {
    public static void main(String[] args) {
        Animal[] oldArray = new Animal[1];
        oldArray = addAnimalToArray(oldArray, new Animal("test", "test"));

        oldArray[0] = new Animal("Unicorn", "grass");
        oldArray[1] = new Animal("Fish", "corn");

        for (Animal animal : oldArray) {
            if (animal != null) {
                // System.out.println(animal.getName());
            }
        }
        // ClassWork cl = new ClassWork();
        oldArray = addAnimalToArray(oldArray, new Animal("Pig", "everything"));
        oldArray = addAnimalToArray(oldArray, new Animal("Horse", "dry grass"));
        oldArray = addAnimalToArray(oldArray, new Animal("Unicorn", "flowers"));
        oldArray = addAnimalToArray(oldArray, new Animal("Falcon", "mice"));
        oldArray = addAnimalToArray(oldArray, new Animal("Bear", "berry"));

        for (Animal animal : oldArray) {
            if (animal != null) {
                System.out.println(animal.getName());
            }
        }

    }


    public static Animal[] addAnimalToArray(Animal[] oldArray, Animal newElement) {
        if (oldArray[oldArray.length - 1] == null) {
            for (int i = oldArray.length - 1; i > 0; i--) {
                if (oldArray[i] != null) {
                    oldArray[i + 1] = newElement;
                    return oldArray; // end of method

                }
            }
        }
        Animal[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        newArray[oldArray.length - 1] = newElement;
        return newArray;
    }


    Integer number1 = Integer.valueOf("23456");
    Double d = new Double(2.25);
    Integer val = 104;

    int number = 45;
}
