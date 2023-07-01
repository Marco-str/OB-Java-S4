package com.MarcoRepoGithub;

public class SmartDevice {

    // Atributos

    String type;
    String modelo;
    String marca;
    boolean wifiConnect;
    boolean bluetoothConnect;
    boolean gpsConnect;
    int battery;
    double tamañoCm;
    boolean táctil;

// 2 Constructor

    public SmartDevice() {
    }

    public SmartDevice(String type, String modelo, String marca, boolean wifiConnect, boolean bluetoothConnect, boolean gpsConnect, int battery, double tamañoCm, boolean táctil) {
        this.type = type;
        this.modelo = modelo;
        this.marca = marca;
        this.wifiConnect = wifiConnect;
        this.bluetoothConnect = bluetoothConnect;
        this.gpsConnect = gpsConnect;
        this.battery = battery;
        this.tamañoCm = tamañoCm;
        this.táctil = táctil;
    }


}


