/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3.exercise3;

/**
 *
 * @author Cata
 */
public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private String fueltype;

    public Vehicle(String model, String type, int speed, String fueltype) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fueltype = fueltype;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }
            }