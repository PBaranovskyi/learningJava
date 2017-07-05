package oleksanderkrasilnikov.homework8;

/**
 * Created by Krasilnikov on 31.05.2017.
 */
public class LabWork275 {
    public static void main(String[] args) {
        Device[] arr = new Device[2];
        Device monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        Device ethernetAdapter = new EthernetAdapter("D-Link", 25, "AB1234567CD", 256, "a4:db:30:76:4e:1a");
        arr[0] = monitor;
        arr[1] = ethernetAdapter;

        for (Device device : arr) {
            System.out.println(device.toString());
        }
    }
}
