public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int largetsPrimeNumber = 0;
        boolean isPrime = true;
        for (int i = 2; i <= number; i++) {
            if ((number % i) == 0) {
                for (int j = 2; j <= (long) Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    largetsPrimeNumber = i;
                }
            }
        }
        return largetsPrimeNumber;
    }


    public static boolean isPrimeNumber(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
//            System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
//        System.out.println(isPrimeNumber(7));
//        System.out.println(isPrimeNumber(8));
//        System.out.println(isPrimeNumber(13));
    }
}
