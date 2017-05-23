package ua.kstt.justymenko.module08;

/**
 * Created by n1kropol on 5/23/17.
 */
public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
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
        return "Monitor: manufacturer = " + getManufacturer() +
                ", price = " + getPrice() +
                ", serialNumber = " + getSerialNumber() +
                ", X = " + resolutionX +
                ", Y = " + resolutionY;
    }

    public static void main(String[] args) {
        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280,1024);
        System.out.println(monitor.toString());
    }
}
