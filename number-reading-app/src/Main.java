import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");

        int num = scanner.nextInt();
        if (num >= 0 && num < 10) {
            switch (num) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

        } else if (num >= 10 && num < 20) {
            num = num - 10;
            switch (num) {
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (num >= 20 && num < 100) {
            int lastDigit = num % 10;
            int threshold = num - lastDigit;
            String dozens = "", digit ="";

            switch (threshold){
                case 20:
                    dozens = "Twenty";
                    break;
                case 30:
                    dozens = "Thirty";
                    break;
                case 40:
                    dozens = "Forty";
                    break;
                case 50:
                    dozens = "Fifty";
                    break;
                case 60:
                    dozens = "Sixty";
                    break;
                case 70:
                    dozens = "Seventy";
                    break;
                case 80:
                    dozens = "Eighty";
                    break;
                case 90:
                    dozens = "Ninety";
                    break;
                default:
                    System.out.println("Có lỗi xẩy ra");
                    break;
            }

            switch (lastDigit) {
                case 1:
                    digit = "one";
                    break;
                case 2:
                    digit = "two";
                    break;
                case 3:
                    digit = "three";
                    break;
                case 4:
                    digit = "four";
                    break;
                case 5:
                    digit = "five";
                    break;
                case 6:
                    digit = "six";
                    break;
                case 7:
                    digit = "seven";
                    break;
                case 8:
                    digit = "eight";
                    break;
                case 9:
                    digit = "nine";
                    break;
            }
            System.out.println(dozens +"-" + digit);
        } else if (num >= 100 & num <= 999) {
            int lastTwoDigits = num % 100;
            int hundreds = num - lastTwoDigits;
            int lastDigits = lastTwoDigits % 10;
            int tens = lastTwoDigits - lastDigits;
            String tensUnit = "", hundredsUnit = "", ones="";

            switch (hundreds){
                case 100:
                    hundredsUnit = "One-hundred";
                    break;
                case 200:
                    hundredsUnit = "Two-hundred";
                    break;
                case 300:
                    hundredsUnit = "Three-hundred";
                    break;
                case 400:
                    hundredsUnit = "Four-hundred";
                    break;
                case 500:
                    hundredsUnit = "Five-hundred";
                    break;
                case 600:
                    hundredsUnit = "Six-hundred";
                    break;
                case 700:
                    hundredsUnit = "Seven-hundred";
                    break;
                case 800:
                    hundredsUnit = "Eight-hundred";
                    break;
                case 900:
                    hundredsUnit = "Nine-hundred";
                    break;
            }if (lastTwoDigits < 10) {
                switch (lastTwoDigits) {
                    case 1:
                        tensUnit = "one";
                        break;
                    case 2:
                        tensUnit = "two";
                        break;
                    case 3:
                        tensUnit = "three";
                        break;
                    case 4:
                        tensUnit = "four";
                        break;
                    case 5:
                        tensUnit = "five";
                        break;
                    case 6:
                        tensUnit = "six";
                        break;
                    case 7:
                        tensUnit = "seven";
                        break;
                    case 8:
                        tensUnit = "eight";
                        break;
                    case 9:
                        tensUnit = "nine";
                        break;
                }

            } else if (lastTwoDigits >= 10 && lastTwoDigits < 20) {
                int lastDigitForTens = lastTwoDigits - 10;
                switch (lastDigitForTens) {
                    case 1:
                        tensUnit = "eleven";
                        break;
                    case 2:
                        tensUnit = "twelve";
                        break;
                    case 3:
                        tensUnit = "thirteen";
                        break;
                    case 4:
                        tensUnit = "fourteen";
                        break;
                    case 5:
                        tensUnit = "fifteen";
                        break;
                    case 6:
                        tensUnit = "sixteen";
                        break;
                    case 7:
                        tensUnit = "seventeen";
                        break;
                    case 8:
                        tensUnit = "eighteen";
                        break;
                    case 9:
                        tensUnit = "nineteen";
                        break;
                }

            } else if (tens >= 20){
                switch(tens){
                    case 20:
                        tensUnit = "twenty";
                        break;
                    case 30:
                        tensUnit = "thirty";
                        break;
                    case 40:
                        tensUnit = "forty";
                        break;
                    case 50:
                        tensUnit = "fifty";
                        break;
                    case 60:
                        tensUnit = "sixty";
                        break;
                    case 70:
                        tensUnit = "seventy";
                        break;
                    case 80:
                        tensUnit = "eighty";
                        break;
                    case 90:
                        tensUnit = "ninety";
                        break;
                }
                switch (lastDigits){
                    case 1:
                        ones = "and-one";
                        break;
                    case 2:
                        ones = "two";
                        break;
                    case 3:
                        ones = "three";
                        break;
                    case 4:
                        ones = "four";
                        break;
                    case 5:
                        ones = "five";
                        break;
                    case 6:
                        ones = "six";
                        break;
                    case 7:
                        ones = "seven";
                        break;
                    case 8:
                        ones = "eight";
                        break;
                    case 9:
                        ones = "nine";
                        break;
                }
            }
            System.out.println(hundredsUnit + " and " + tensUnit + " " + ones);
        }
    }
}