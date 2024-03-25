/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab7.safehome;

/**
 *
 * @author Cata
 */
public class Door {
    private DoorStatus status;
    public void lockDoor(){
        status = DoorStatus.CLOSE;
        System.out.println("Door Closed!");
        
    }
    public void unlockDoor(){
        status = DoorStatus.OPEN;
        System.out.println("Door Unlock!");
    }
    public DoorStatus getStatus()
    {
        return status;
    }
}
