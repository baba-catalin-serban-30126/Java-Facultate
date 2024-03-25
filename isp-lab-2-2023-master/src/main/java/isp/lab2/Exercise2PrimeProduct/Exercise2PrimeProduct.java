package isp.lab2.Exercise2PrimeProduct;

import java.util.Scanner;

public class Exercise2PrimeProduct {

    /**
     * This method should return the product of the first n prime numbers
     * @param n
     * @param m
     * @return
     */
    public static long getPrimeProduct(int n, int m) {
        int count = 0;
        long product = 1;
        for (int i = n; count < m; i++) {
            if (isPrime(i)) {
                product = i*i;
                count++;
            }
        }
        return product;
       
    }

    /**
     * This method should read from the console a number
     * @return the number read from the console
     */
    public static int readfromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args) {
        System.out.println("The product of the first 10 prime numbers is: " + getPrimeProduct(1, 10));
        System.out.println("The product of prime numbers between m and n: " + getPrimeProduct(readfromConsoleInt(), readfromConsoleInt()));
    }

  public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

}
