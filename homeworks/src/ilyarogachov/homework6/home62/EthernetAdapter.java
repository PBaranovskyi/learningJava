package ilyarogachov.homework6.home62;

/**
 * Created by rogachev on 29.05.17.
 */
public class EthernetAdapter extends Device {
    int speed;
    String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }
}
