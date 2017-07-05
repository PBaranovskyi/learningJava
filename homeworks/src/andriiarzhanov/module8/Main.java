package andriiarzhanov.module8;

import java.util.Arrays;

/**
 * Created by arzhanov on 24.05.17.
 */
public class Main {
    public static void main(String[] args) {
        Device[] devices = new Device[4];
        devices[0] = new Monitor("Dell", 200, "DLL47372843", 1280, 1024);
        devices[1] = new Monitor("Phillips", 35, "PLS349049S", 1280, 1024);
        devices[2] = new EthernetAdapter("TP-Link", 20, "TPL3984KL", 1000, "fe:80:9a:dc:e0:58:e8:36");
        devices[3] = new EthernetAdapter("TP-Link", 20, "TPL3984KL", 1000, "fe:80:83:c1:ff:fe:92:e4");

        System.out.println(Arrays.toString(devices));

        for (int i = 0; i < devices.length; i++) {
            System.out.println(devices[i].toString() + "; hashCode: " + devices[i].hashCode());
        }
    }
}
