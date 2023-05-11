import java.util.ArrayList;

public class Multithreading {
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        // First thread reads numbers between 50 and 80
        Thread thread1 = new Thread(() -> {
            for (int i = 50; i <= 80; i++) {
                // If the number is prime, add it to the list
                if (isPrime(i)) {
                    primes.add(i);
                }
            }
        });

        // Second thread prints the square of each prime number
        Thread thread2 = new Thread(() -> {
            for (int prime : primes) {
                System.out.println("Square of " + prime + " is " + prime * prime);
            }
        });

        // Third thread displays all numbers
        Thread thread3 = new Thread(() -> {
            for (int i = 50; i <= 80; i++) {
                System.out.println(i);
            }
        });

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
    }

    // Utility method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
