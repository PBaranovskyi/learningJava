package andriiarzhanov.module8;

/**
 * Created by arzhanov on 24.05.17.
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
    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + (this.getResolutionX() != 0. ? this.getResolutionX() : 0);
        hash = 31 * hash + (this.getResolutionY() != 0. ? this.getResolutionY() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Monitor)) return false;
        if (obj == this) return true;
        if (((Monitor) obj).getResolutionX() == this.getResolutionX() &&
                ((Monitor) obj).getManufacturer() == this.getManufacturer() &&
                ((Monitor) obj).getPrice() == this.getPrice() &&
                ((Monitor) obj).getSerialNumber() == this.getSerialNumber()) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Monitor: manufacturer=" + getManufacturer() + ", price=" + getPrice() + ", serialNumber" + getSerialNumber() + ", resolutionX=" + resolutionX + ", resolurionY=" + resolutionY;
    }
}
