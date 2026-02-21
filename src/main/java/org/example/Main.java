package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int originalNumber = number;
        int reverseNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number = number / 10;
        }
        return originalNumber == reverseNumber;
    }
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        return sum == number;
    }
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        if (number == 0) {
            return "Zero";
        }
        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);
        String result = "";
        int tempNum = reversedNumber;
        while (tempNum > 0) {
            int lastDigit = tempNum % 10;
            switch (lastDigit) {
                case 0: result += "Zero "; break;
                case 1: result += "One "; break;
                case 2: result += "Two "; break;
                case 3: result += "Three "; break;
                case 4: result += "Four "; break;
                case 5: result += "Five "; break;
                case 6: result += "Six "; break;
                case 7: result += "Seven "; break;
                case 8: result += "Eight "; break;
                case 9: result += "Nine "; break;
            }
            tempNum = tempNum / 10;
        }
        for (int i = 0; i < originalDigitCount - reversedDigitCount; i++) {
            result += "Zero ";
        }
        return result.trim();
    }
    public static int reverse(int number) {
        number = Math.abs(number);
        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        return reverse;
    }
    public static int getDigitCount(int number) {
        if (number < 0) {
            number = Math.abs(number);
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
}

