package vkochergin.module1.example.homework7.device;

/**
 * Created by Volodymyr Kochergin on 30.05.2017.
 */
public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device() {

    }

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
        return "manufacturer =" + getManufacturer() + ", " + "price =" + getPrice() +
                ", " + "serialNumber =" + getSerialNumber();

    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof Device)) return false;
        if (obj == this) return true;

        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 33212;
    }
}
