package isp.lab7.safehome;

public class SafeHome {

    public static void main(String[] args) {
 Door d = new Door();
 System.out.println(d);
 DoorLockControler controller = new DoorLockControler(d);
    }
}
