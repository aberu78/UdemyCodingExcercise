import java.util.Scanner;

public class InputCalculator {


    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = false;
        double sum = 0;
        int count = 0;
        while (!hasNextInt) {
            String numStr = scanner.nextLine();
            if (numStr.matches("^-?\\d+$")) {
                int numInt = Integer.parseInt(numStr);
                sum += numInt;
                count++;
            } else
                hasNextInt = true;

        }
        if (count < 1)
            System.out.println("SUM = " + (int) sum + " AVG = 0");
        else
            System.out.println("SUM = " + (int) sum + " AVG = " + (long) Math.round(sum / count));

        scanner.close();
    }
}