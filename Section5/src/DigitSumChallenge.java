public class DigitSumChallenge {

    public static int sumDigits(int num) {

        if (num < 10) {
            return -1;
        }
        int sum = 0;

        //125 -> 125 /10 = 12 *10 = 120 ->125 -120 = 5
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;

        }
        return sum;

    }


}
