package ua.kstt.justymenko.module08;

/**
 * Created by n1kropol on 5/23/17.
 */
public class Main {

    public static void main(String[] args) {
        Device[] devicesArray = new Device[2];
        Device monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280,1024);
        Device ethernetAdapter = new EthernetAdapter("D-Link", 25, "AB1234567CD", 256, "a4:db:30:76:4e:1a");
        devicesArray[0] = monitor;
        devicesArray[1] = ethernetAdapter;

        for (Device device : devicesArray) {
            System.out.println(device.toString());
        }
    }
}
