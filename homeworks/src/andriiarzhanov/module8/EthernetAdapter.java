package andriiarzhanov.module8;

/**
 * Created by arzhanov on 24.05.17.
 */
public class EthernetAdapter extends Device {
    private int speed;
    private String MAC;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String MAC) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.MAC = MAC;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + (this.getSpeed() != 0. ? this.getSpeed() : 0);
        hash = 31 * hash + this.getMAC().hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof EthernetAdapter)) return false;
        if (obj == this) return true;
        if (((EthernetAdapter) obj).getSpeed() == this.getSpeed() &&
                ((EthernetAdapter) obj).getMAC() == this.getMAC() &&
                ((EthernetAdapter) obj).getManufacturer() == this.getManufacturer() &&
                ((EthernetAdapter) obj).getPrice() == this.getPrice() &&
                ((EthernetAdapter) obj).getSerialNumber() == this.getSerialNumber()) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Monitor: manufacturer=" + getManufacturer() + ", price=" + getPrice() + ", serialNumber" + getSerialNumber() + ", speed=" + speed + ", MAC=" + MAC;
    }
}
