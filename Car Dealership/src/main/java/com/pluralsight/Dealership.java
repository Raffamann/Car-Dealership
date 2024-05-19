package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    ArrayList<Vehicle> inventory ; // declaring variables

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        inventory = new ArrayList<>(); // initiate the ArrayList vehicle object
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        
    }
    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
        }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByColor(String color ) {
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }

}
