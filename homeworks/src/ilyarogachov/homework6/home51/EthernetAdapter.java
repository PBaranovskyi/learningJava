package ilyarogachov.homework6.home51;

/**
 * Created by rogachev on 29.05.17.
 */
public class EthernetAdapter {
    int speed;
    String mac;

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
