public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverseNum = 0;
        int remainNum = 0;
        int numTest = number;
        while (number != 0) {
            remainNum = number % 10;
            reverseNum = reverseNum * 10 + remainNum;
            number /= 10;
        }
        return numTest == reverseNum;
    }
}
