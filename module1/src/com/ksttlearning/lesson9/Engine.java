package com.ksttlearning.lesson9;

/**
 * Created by citsym on 22.05.17.
 */
public class Engine {
    private int volume = 2;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        return getVolume() == engine.getVolume();

    }

    @Override
    public int hashCode() {
        return getVolume();
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                '}';
    }
}
