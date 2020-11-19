import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("\n103.Reverse Array Challenge");
        int[] arr = new int[]{1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[]{50, 40, 30, 20, 10, 1};
        reverse(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("\n102.Minimum element Challenge");
        System.out.println("Enter a number to read");
        int num = scanner.nextInt();
        scanner.nextLine();
        arr = readIntegers(num);
        int minValue = findMin(arr);
        System.out.println("Min.Value is " + minValue);

        System.out.println("\n99Array challenge");
        System.out.println("Enter a number to sort");
        num = scanner.nextInt();
        scanner.nextLine();
        int[] inputInt = getInteger(num);
        int[] sortedInt = sortIntegers(inputInt);
        printArray(sortedInt);

        scanner.close();
    }

    //_________  103.Reverse Array
    private static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
    }

    //------------102.Minimum Element Challenge-----------
    private static int[] readIntegers(int count) {
        int[] arr = new int[count];
        System.out.println("Enter numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }


    //------------99 Array Challenge---------------
    private static int[] getInteger(int number) {

        int[] inputInt = new int[number];
        System.out.println("Enter number");

        for (int i = 0; i < inputInt.length; i++) {
            inputInt[i] = scanner.nextInt();
        }
        return inputInt;
    }

    public static void printArray(int[] sorted) {

        System.out.println("Sorted array");
        for (int j : sorted) {
            System.out.println(j);
        }
    }

    public static int[] sortIntegers(int[] num) {

        int[] sorted = Arrays.copyOf(num, num.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sorted.length - 1; i++) {
                if (sorted[i] < sorted[i + 1]) {
                    temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sorted;
    }
}
