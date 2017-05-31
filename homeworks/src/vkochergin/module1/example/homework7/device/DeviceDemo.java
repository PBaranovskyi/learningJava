package vkochergin.module1.example.homework7.device;

/**
 * Created by Volodymyr Kochergin on 30.05.2017.
 */
public class DeviceDemo {

    public static void main(String[] args) {
        Device[] devices = new Device[5];

        Device monitorDell = new Monitor(1200, 750);
        monitorDell.setManufacturer("Dell");
        monitorDell.setPrice(355);
        monitorDell.setSerialNumber("123456789");

        Device monitorSamsung = new Monitor(1500, 1200);
        monitorSamsung.setManufacturer("Samsung");
        monitorSamsung.setPrice(400);
        monitorSamsung.setSerialNumber("01110001");

        Device nonameAdapter = new EthernetAdapter(100, "qwe123123123");
        nonameAdapter.setManufacturer("NoName");
        nonameAdapter.setPrice(25);
        nonameAdapter.setSerialNumber("12332112312313");

        Device tpLinkAdapter = new EthernetAdapter(120, "ISO0200220");
        tpLinkAdapter.setManufacturer("TP Link");
        tpLinkAdapter.setPrice(30);
        tpLinkAdapter.setSerialNumber("0987654321");

        Device keyboard = new Device("Dell", 15, "0112332212312");

        devices[0] = monitorDell;
        devices[1] = monitorSamsung;
        devices[2] = nonameAdapter;
        devices[3] = tpLinkAdapter;
        devices[4] = keyboard;

        for (Device device : devices) {
            System.out.println(device.toString());
        }

        for (Device device : devices) {
            System.out.println(device.hashCode());
        }
    }
}
