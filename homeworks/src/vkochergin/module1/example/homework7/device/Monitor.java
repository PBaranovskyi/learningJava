package vkochergin.module1.example.homework7.device;

/**
 * Created by Volodymyr Kochergin on 30.05.2017.
 */
public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(int resolutionX, int resolutionY) {
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "manufacturer =" + getManufacturer() + ", " + "price =" + getPrice() +
                ", " + "serialNumber =" + getSerialNumber() + " resoslutionX =" + getResolutionX()
                + ", " + "reoslutionY =" + getResolutionY();
    }
}
