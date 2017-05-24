package com.ksttlearning.lesson9;

/**
 * Created by citsym on 22.05.17.
 */
public class Car extends Vehicle {

    private double gasCount;
    protected int expense;

    protected Engine engine = new Engine();

    {
        System.out.println("CAR INIT");
    }

    public Car(int expense) {
        this.expense = expense;
        setDriverName("Pasha");
        System.out.println(engine.getVolume() + " volumn");
        System.out.println("CONSTRUCTOR CAR");
    }

    public Car(int expense, TurboEngine turboEngine) {
        engine = turboEngine;

        this.expense = expense;
        setDriverName("Pasha");
        System.out.println(engine.getVolume() + " volumn");
        System.out.println("CONSTRUCTOR CAR");
    }


    @Override
    public void drive(int distance) {
        double gasNeeded = distance / 100.0 * expense;
        if (gasNeeded > gasCount){
            int availableDistance = (int) (gasCount / expense * 100);
            super.drive(availableDistance);
            gasCount -= availableDistance / 100.0 * expense;
        } else {
            super.drive(distance);
            gasCount -= gasNeeded;
        }

        System.out.println(getDriverName() + " driver");
        System.out.println(gasCount  + " gas left");
    }

    public double getGasCount() {
        return gasCount;
    }

    public void setGasCount(double gasCount) {
        this.gasCount = gasCount;
    }


    @Override
    public String toString() {
        return "Car{" +
                "gasCount=" + gasCount +
                ", expense=" + expense +
                ", engine=" + engine +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (expense != car.expense) return false;
        return !(engine != null ? !engine.equals(car.engine) : car.engine != null);

    }

    @Override
    public int hashCode() {
        int result = expense;
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        return result;
    }
}
