package isp.lab3.exercise3;

public class Exercise3 {
    public static void main(String[] args)
    {
        Vehicle car1= new Vehicle("Dacia","Logan",150,"B");
        Vehicle car2= new Vehicle("Volkswagen","Passat",160,"D");
        System.out.println("masina1 nume"+car1.getModel());
        System.out.println("masina1 type"+car1.getType());
        System.out.println("masina1 speed"+car1.getSpeed());
        System.out.println("masina1 fueltype"+car1.getFueltype());
        System.out.println("masina2 nume"+car2.getModel());
        System.out.println("masina2 type"+car2.getType());
        System.out.println("masina2 speed"+car2.getSpeed());
        System.out.println("masina2 fueltype"+car2.getFueltype());
        
    }
}
