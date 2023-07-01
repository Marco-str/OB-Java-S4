package com.MarcoRepoGithub;

public class Main {
    public static void main(String[] args) {

        SmartDevice device = new SmartDevice("Phone", "S8", "Samsung", true, true, true, 1500, 23, true);
        System.out.println(device.type);
        System.out.println(device.modelo);
        System.out.println(device.marca);
        System.out.println(device.wifiConnect);
        System.out.println(device.bluetoothConnect);
        System.out.println(device.gpsConnect);
        System.out.println(device.battery);
        System.out.println(device.tamañoCm);
        System.out.println(device.táctil);


        SmartDevice device2 = new SmartDevice("Watch", "K5", "Apple", true, true, true, 600, 6, true);
        System.out.println(device2);
        System.out.println(device2.type);
        System.out.println(device2.modelo);
        System.out.println(device2.marca);
        System.out.println(device2.wifiConnect);
        System.out.println(device2.bluetoothConnect);
        System.out.println(device2.gpsConnect);
        System.out.println(device2.battery);
        System.out.println(device2.tamañoCm);
        System.out.println(device2.táctil);

    }
}
