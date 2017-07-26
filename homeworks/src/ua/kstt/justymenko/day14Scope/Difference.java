package ua.kstt.justymenko.day14Scope;

/**
 * Created by n1kropol on 7/16/17.
 */
public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a) {
        elements = a.clone();
    }

    public void computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int diff = elements[i] - elements[j];
                if (maximumDifference < Math.abs(diff)){
                    maximumDifference = Math.abs(diff);
                }
            }
        }
    }
}
