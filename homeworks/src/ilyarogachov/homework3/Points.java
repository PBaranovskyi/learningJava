package ilyarogachov.homework3;

/**
 * Created by Tom on 24.04.2017.
 */

public class Points {
    private double a = 0;
    private double b = 0;

    Points(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getPointa() {
        return this.a;
    }

    public double getPointb() { //геттер
        return this.b;
    }

    public void setPoints(int a, int b) { //сеттер
        this.a = a;
        this.b = b;
    }
}