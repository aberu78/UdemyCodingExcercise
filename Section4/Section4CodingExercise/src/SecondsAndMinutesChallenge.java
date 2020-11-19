public class SecondsAndMinutesChallenge {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(long min, long sec) {

        if (min < 0 || sec < 0 || sec > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = min / 60;
        long remainingMin = min % 60;

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minString = remainingMin + "m";
        if (remainingMin < 10) {
            minString = "0" + minString;
        }

        String secString = sec + "s";
        if (sec < 10) {
            secString = "0" + secString;
        }
        return hoursString + " " + minString + " " + secString;

    }

    public static String getDurationString(long sec) {
        if (sec < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long min = sec / 60;
        long remainingSeconds = sec % 60;
        return getDurationString(min, remainingSeconds);
    }

}
