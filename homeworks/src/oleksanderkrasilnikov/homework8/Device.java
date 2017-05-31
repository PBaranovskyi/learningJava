package oleksanderkrasilnikov.homework8;

/**
 * Created by Krasilnikov on 31.05.2017.
 */
public class Device {
    private String manufacturer;
    private double price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Device: " + "mamanufacturer = " + manufacturer + ", price = " + price + ", serialNumber = " + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (Double.compare(device.price, price) != 0) return false;
        if (manufacturer != null ? !manufacturer.equals(device.manufacturer) : device.manufacturer != null)
            return false;
        return !(serialNumber != null ? !serialNumber.equals(device.serialNumber) : device.serialNumber != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = manufacturer != null ? manufacturer.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        return result;
    }
}
