package andriiarzhanov.classwork_170524;

/**
 * Created by arzhanov on 24.05.17.
 */
public class Animal {
    private static int animalCount;
    private static String foodName;
    protected String name;

    public Animal() {
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static void setAnimalCount(int animalCount) {
        Animal.animalCount = animalCount;
    }

    public static String getFoodName() {
        return foodName;
    }

    protected void eat() {
        System.out.println(getClass().getEnclosingClass() + " eat " + foodName);
    }

    public void setFoodName(String foodName) {
        Animal.foodName = foodName;
    }
}
