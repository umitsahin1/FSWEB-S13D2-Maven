package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        String stringNumber = Integer.toString(number);
        String reverseNumber = new StringBuilder(stringNumber).reverse().toString();

        return stringNumber.equals(reverseNumber);
    }

    public static boolean isPerfectNumber(int number) {
        if(number < 0) {
            return false;
        }
        int bolenToplam = 0;

        for(int i = 1; i <= number / 2 ; i++) {
            if(number % i == 0) {
                bolenToplam += i;
            }
        }
        return number == bolenToplam;
    }

    public static String numberToWords(int number){
        if(number < 0){
            return "Invalid Value";
        }
        String[] numberWords = {
                "Zero", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine"
        };

        String numberString = Integer.toString(number);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberString.length(); i++) {
            char digit = numberString.charAt(i);

            result.append(numberWords[digit - '0']);
            if (i < numberString.length() - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}

