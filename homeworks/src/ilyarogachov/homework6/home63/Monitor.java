package ilyarogachov.homework6.home63;

/**
 * Created by rogachev on 29.05.17.
 */
public class Monitor extends Device {

    int resolutionX;
    int getResolutionY;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        return getResolutionY == monitor.getResolutionY;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + getResolutionY;
        return result;
    }

    public Monitor(String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public void setGetResolutionY(int getResolutionY) {
        this.getResolutionY = getResolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getGetResolutionY() {
        return getResolutionY;
    }
}
