package Selenium.FinalAssignment;

public class OEP {
    public static String play(int number) {
        if (number % 2 == 0) {
            return "EVEN";
        } else if (isPrime(number)) {
            return "PRIME";
        } else {
            return "ODD";
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
