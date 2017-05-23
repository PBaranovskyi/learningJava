package ua.kstt.justymenko.module08;

/**
 * Created by n1kropol on 5/23/17.
 */
public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: manufacturer = " + manufacturer + ", price = " + price + ", serialNumber = " + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        return  (manufacturer.equals(device.manufacturer));
    }

    public static void main(String[] args) {
        Device device1 = new Device("Samsung", 120, "AB1234567CD");
        System.out.println(device1.toString());
        Device device2 = new Device("Samsung", 120, "AB12");
        Device device3 = new Device("Samsung", 122, "AB12");
        System.out.println(device1.equals(device2));
        System.out.println(device1.equals(device3));
        System.out.println(device2.equals(device3));
    }
}
