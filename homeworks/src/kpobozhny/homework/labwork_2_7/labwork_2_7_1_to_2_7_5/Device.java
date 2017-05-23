package kpobozhny.homework.labwork_2_7.labwork_2_7_1_to_2_7_5;

/**
 * Created by kostya on 5/23/17.
 */

/*Task (2.7.1):
        Create classes:
        1) Base class Device (manufacturer(String), price(float), serialNumber(String));
        2) Subclasses Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter(speed (int), mac (String));
        Add getters/setters and constructor to each class

  Task (2.7.2):
        Override toString() method in each class.
        In toString() method provide code which prints class name and fields values.
        Example:
        Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
        Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024

  Task (2.7.3):
        Override equals()  method in each class

  Task (2.7.4):
        Override hashCode() method in each class

        */

public class Device {

    protected String manufacturer;
    protected float price;
    protected String serialNumber;

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

    //2.7.2
    @Override
    public String toString() {
        return "Device: " +
                "manufacturer=" + manufacturer +
                ", price=" + price +
                ", serialNumber=" + serialNumber;
    }

    //2.7.3
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        if (manufacturer != null ? !manufacturer.equals(device.manufacturer) : device.manufacturer != null)
            return false;
        return serialNumber != null ? serialNumber.equals(device.serialNumber) : device.serialNumber == null;

    }

    //2.7.4
    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        return result;
    }
}
