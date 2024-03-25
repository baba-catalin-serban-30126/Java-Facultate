package isp.lab3.exercise4;

public class Exercise4 {
    public static void main( String[] args)
    {
        MyPoint A =new MyPoint(2,5,6);
        MyPoint B =new MyPoint(5,2,7);
        int var;
        var=(int) A.distance(B);
        System.out.println(var);
       
    }
}
