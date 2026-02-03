package basic_problems;

public class Practice {
    public static void main(String[] args) {
        Practice.isPalindrome(121);
    }

    // Time: O(log n), Space: O(1)
    public static void countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println("Number of digits in a number: " + count);
    }

    // Time: O(log n), Space: O(1)
    public static void reverse(int number) {
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse number is: " + reverse);
    }

    // Time: O(log n), Space: O(1)
    public static void isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number > 0) {
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }

        System.out.println("Is Palindrome: " + (original == reverse));
    }

    // Time: O(n), Space: O(1)
    public static int fibonacci(int n) {
        if (n <= 1) return n;

        int num1 = 0,
                num2 = 1,
                sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        return sum;
    }


}
