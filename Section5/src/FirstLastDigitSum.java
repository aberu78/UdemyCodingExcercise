public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;
        int num1 = number;
        int num2 = number;

        while (num1 >= 10) {
            num1 /= 10;
        }
        num2 = num2 % 10;
        return num1 + num2;
    }
}
