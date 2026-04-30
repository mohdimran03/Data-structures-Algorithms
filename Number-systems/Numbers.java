import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        //call isPrimeOrNot
        // isPrimeOrNot();
        // productAndSum(234);
        // countSetBits(24);
        // decimalToBinary(132);
        // binaryToDecimal("01001100");
        // reverseIntegers(-999034999);
        // integerCompliment(24);
        // boolean ans = powerOfTwo(16);
        // System.out.println(ans);
    }

    static boolean powerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    static int integerCompliment(int n) {
                int m = n;

        int mask = 0;

        while (m != 0) {
            mask = (mask<<1 ) | 1;
            m = m >> 1;
        }

        int ans = (~n) & mask;

        return ans;
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

    static StringBuilder decimalToBinary(int n) {

        // while (n > 0) {
        //     binary.append(n & 1); // get last bit
        //     n = n >> 1;           // shift right
        // }

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

    static int binaryToDecimal(String str) {

        int result = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            result = result * 2 + (str.charAt(i) - '0');
        }

        System.out.println(result);

        return result;
    }

    static int reverseIntegers(int x) {

        // int reverse = 0;

        // while (x != 0) {

        //     if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
        //         return 0;
        //     }

        //     int digit = x % 10;
        //     reverse = reverse * 10 + digit;
        //     x /= 10;
        // }

        // System.out.println(reverse);

        // return reverse;

        boolean isNegative = x < 0;

        String digits = Integer.toString(Math.abs(x));

        String reverse = new StringBuilder(digits).reverse().toString();

        int result = Integer.parseInt(reverse);

        System.out.println(result);

        return isNegative ? -result : result;
    }
}


// Difference between product and sum of a number

