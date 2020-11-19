public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {

        if ((num1 < 10 || num1 >= 100) || (num2 < 10 || num2 >= 100))
            return false;
        int numTest = num2;
        while (num1 > 0) {
            int number1 = num1 % 10;
            while (numTest > 0) {
                int number2 = numTest % 10;
                if (number1 == number2) {
                    return true;
                }
                numTest /= 10;
            }
            numTest = num2;
            num1 /= 10;
        }
        return false;
    }
}