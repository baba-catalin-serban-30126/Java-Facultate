/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab7.safehome;
import java.util.HashMap;
/**
 *
 * @author Cata
 */
public class DoorLockControler implements ControllerInterface{
 private HashMap<AccesKey, Tenant>  validAccess =new HashMap<>();
 private Door door;

    public DoorLockControler(Door door) {
        this.door = door;
    }
 
    @Override
    public DoorStatus enterPin(String pin) throws Exception {
    AccesKey key = new AccesKey(pin);
    if(validAccess.containsKey(key)){
        if(door.getStatus()==DoorStatus.OPEN)
            door.lockDoor();
        else
            door.unlockDoor();
    }
    return door.getStatus();
    }

    @Override
    public void addTenant(String pin, String name) throws Exception {
    validAccess.put(new AccesKey(pin), new Tenant(name));
    }

    @Override
    public void removeTenant(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
