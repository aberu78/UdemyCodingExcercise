public class NumberToWords {


    public static int getDigitCount(int number) {
        int count = 1;
        if (number < 0) {
            return -1;
        }
        for (int i = number; i > 0; i /= 10) {
            if (i / 10 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int reverse(int number) {

        int reverseNum = 0;
        while (number != 0) {
            int remainNum = number % 10;
            reverseNum = reverseNum * 10 + remainNum;
            number /= 10;
        }
        return reverseNum;
    }

    public static void numberToWords(int number) {
        int num = reverse(number);
        int reverseDigit = getDigitCount(num);
        int originalDigit = getDigitCount(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            for (int i = num; i > 0; i /= 10) {
                if (i % 10 == 0)
                    System.out.println("Zero");
                else if (i % 10 == 1)
                    System.out.println("One");
                else if (i % 10 == 2)
                    System.out.println("Two");
                else if (i % 10 == 3)
                    System.out.println("Three");
                else if (i % 10 == 4)
                    System.out.println("Four");
                else if (i % 10 == 5)
                    System.out.println("Five");
                else if (i % 10 == 6)
                    System.out.println("Six");
                else if (i % 10 == 7)
                    System.out.println("Seven");
                else if (i % 10 == 8)
                    System.out.println("Eight");
                else
                    System.out.println("Nine");
            }
            int diff = originalDigit - reverseDigit;
            while (diff != 0) {
                System.out.println("Zero");
                diff--;
            }

        }
    }

}
