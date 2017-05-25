package kpobozhny.homework.labwork_2_7.labwork_2_7_1_to_2_7_5;

/**
 * Created by Kostiantyn Pobozhni on 25.05.2017.
 */
public class Main {

    public static void main(String[] args) {
        Device[] devices = {new Monitor("Samsung", 200.00f, "GH120056875", 1920, 1080),
                            new EthernetAdapter("Sony", 150.35f, "XD243424", 1000, "323c3fd3n42mf8"),
                            new Monitor("Dell", 300.00f, "DF03456755", 1920, 1080)};

        printDevices(devices);
    }

    public static void printDevices(Device[] dev){
        for (int i = 0; i < dev.length; i++) {
            System.out.println(dev[i]);
        }
    }
}
