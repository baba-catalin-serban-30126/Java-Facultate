package isp.lab2.Exercise1RandomArray;

import java.util.Random;


public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        

        int[] array = new int[n];
      Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100) + 1; // generate a random number between 1 and 100
        }
    
        //TODO: implement the logic to fill the array with random numbers
        return array;
    }

    public static int[] findMaxAndMin(int[] array) {
        int[] mm = new int[2];
        mm[0] = array[0]; // set min to the first element
        mm[1] = array[0]; // set max to the first element

        // find the min and max in the array
        for (int i = 1; i < array.length; i++) {
            if (array[i] < mm[0]) {
                mm[0] = array[i]; // update min
            }
            if (array[i] > mm[1]) {
                mm[1] = array[i]; // update max
            }
        }

        return mm;
    
    }

    public static void main(String[] args) {

        Random random = new Random();
        //genereaza numar random intre 10 si 100
        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMaxAndMin(a);
        System.out.println("Min is:"+mm[0]+" Max is:"+mm[1] );
    }
}
