/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab10.exercise1;

/**
 *
 * @author Cata
 */
public class Aircraft  extends Thread{
    private String id;
   private int altitude;
    private ATC Atc1;

    public Aircraft(String id, int altitude) {
        this.id = id;
       this.altitude = altitude;
        System.out.println("Aircraft "+id+" is created. Ready to take off.");
    }
    
    
}
