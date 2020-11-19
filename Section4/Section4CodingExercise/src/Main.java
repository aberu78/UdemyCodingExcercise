public class Main {

    public static void main(String[] args) {

        System.out.println("\n Playing Cat");
        System.out.println(PlayingCat.isCatPlaying(true,10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
        System.out.println(PlayingCat.isCatPlaying(false,35));

        System.out.println("\n Equality Printer");
        IntEqualityPrinter.printEqual(1,1,1);
        IntEqualityPrinter.printEqual(1,1,2);
        IntEqualityPrinter.printEqual(-1,-1,-1);
        IntEqualityPrinter.printEqual(1,2,3);

        System.out.println("\nMinutes to years and Days Calculator");
        MinutesToYearDaysCalculator.printYearsAndDays(525600);
        MinutesToYearDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearDaysCalculator.printYearsAndDays(561600);

        System.out.println("\nArea Calculator coding exercise 8");
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5.0,4.0));
        System.out.println(AreaCalculator.area(-1.0,4.0));


        System.out.println("\nseconds and min Challenge - 54");
        System.out.println(SecondsAndMinutesChallenge.getDurationString(65,45));
        System.out.println(SecondsAndMinutesChallenge.getDurationString(3945L));
        System.out.println(SecondsAndMinutesChallenge.getDurationString(-45));
        System.out.println(SecondsAndMinutesChallenge.getDurationString(65,9));

        System.out.println("\nMegabyte and KiloBytes");
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        System.out.println("\nBarking Dog");
        System.out.println(BarkingDog.shouldWakeup(true, 1));
        System.out.println(BarkingDog.shouldWakeup(false, 2));
        System.out.println(BarkingDog.shouldWakeup(true, 8));
        System.out.println(BarkingDog.shouldWakeup(true, -1));

        System.out.println("\n Leap Year");
        System.out.println(LeapYear.isLeapYear(-1600));
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2017));
        System.out.println(LeapYear.isLeapYear(2000));

        System.out.println("\nDecimal Comparator");
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123,3.123));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(0.00,0.00));

        System.out.println("\nEqualSumChecker");
        System.out.println(EqualSumChecker.hasEqualSum(1,1,1));
        System.out.println(EqualSumChecker.hasEqualSum(1,1,2));
        System.out.println(EqualSumChecker.hasEqualSum(1,-1,0));

        System.out.println("\nTeen Number Checker");
        System.out.println(TeenNumberChecker.hasTeen(9,99,19));
        System.out.println(TeenNumberChecker.hasTeen(23,15,42));
        System.out.println(TeenNumberChecker.hasTeen(22,23,34));
        System.out.println(TeenNumberChecker.isTeen(9));
        System.out.println(TeenNumberChecker.isTeen(13));
    }

}