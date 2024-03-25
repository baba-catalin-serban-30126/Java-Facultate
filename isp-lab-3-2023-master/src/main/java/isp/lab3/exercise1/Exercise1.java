package isp.lab3.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        
        Tree myTree = new Tree();
  
        myTree.grow(5);
       
        System.out.println("Tree height: " + myTree.toString());
      
        myTree.grow(2);
         System.out.println("Tree height: " + myTree.toString());
    }
}
