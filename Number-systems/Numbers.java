import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        //call isPrimeOrNot
        // isPrimeOrNot();
        // productAndSum(234);
        // countSetBits(24);
        binaryConversion(132);
    }

    static void isPrimeOrNot() {
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num < 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Number is a prime number");
        } else {
            System.out.println("Number is not a prime number");
        }
    }

    static int productAndSum(int n) {
        // find the difference between product and sum of its digits
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int remainder = n % 10;

            product *= remainder;
            sum += remainder;
            n /= 10;
        }

        int result = product - sum;

        System.out.println(result);

        return result;
    }

    static int countSetBits(int n) {
        // count the number of set bits in a number
        int counter = 0;

        while (n != 0) {
            n = n & (n - 1);
            counter++;
        }

        System.out.println(counter);

        return counter;
    }

    static StringBuilder binaryConversion(int n) {

        if (n == 0) {
            return new StringBuilder("0");
        }
        
        StringBuilder binary = new StringBuilder();

        while (n != 0) {
            int remainder = n % 2;
            binary.append(remainder);
            n = n / 2;
        }

        binary = binary.reverse();
        System.out.println(binary);

        return binary;
    }


}



// Difference between product and sum of a number

