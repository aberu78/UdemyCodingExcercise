public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double decimal1, double decimal2) {
        if (decimal1 == 0 && decimal2 == 0)
            return true;
        decimal1 = Math.round(decimal1 * 10000) / 10.0;
        decimal2 = Math.round(decimal2 * 10000) / 10.0;
        return decimal1 / decimal2 > 0 && (int) decimal1 % (int) decimal2 == 0;
    }
}



