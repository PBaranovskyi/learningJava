package andriiarzhanov.module8;

/**
 * Created by arzhanov on 24.05.17.
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
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (this.getManufacturer() != null ? this.getManufacturer().hashCode() : 0);
        hash = 31 * hash + (int) (this.getPrice() != 0. ? this.getPrice() : 0);
        hash = 31 * hash + (this.getSerialNumber() != null ? this.getSerialNumber().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Device)) return false;
        if (obj == this) return true;
        if (((Device) obj).getManufacturer() == this.getManufacturer() &&
                ((Device) obj).getPrice() == this.getPrice() &&
                ((Device) obj).getSerialNumber() == this.getSerialNumber()) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Device: manufacturer=" + manufacturer + ", price=" + price + ", serialNumber" + serialNumber;
    }
}
