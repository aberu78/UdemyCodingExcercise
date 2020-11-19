public class Main {

    public static void main(String[] args) {

        System.out.println("\nPaint Job");
        System.out.println(PaintJob.getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(PaintJob.getBucketCount(3.4,2.1,1.5,2));
        System.out.println(PaintJob.getBucketCount(2.75,3.25,2.5,1));
        System.out.println(PaintJob.getBucketCount(-3.4,2.1,1.5));
        System.out.println(PaintJob.getBucketCount(3.4,2.1,1.5));
        System.out.println(PaintJob.getBucketCount(7.25,4.3,2.35));
        System.out.println(PaintJob.getBucketCount(3.14, 1.5));
        System.out.println(PaintJob.getBucketCount(6.26, 2.2));
        System.out.println(PaintJob.getBucketCount(3.26, .75));


        /*   System.out.println("\nInputCalculator");
        InputCalculator.inputThenPrintSumAndAverage();

        System.out.println("\nDiagonalStar");
        DiagonalStar.printSquareStar(5);
        DiagonalStar.printSquareStar(8);


        System.out.println("\n Largest Prime");
        System.out.println(LargestPrime.getLargestPrime(21));
        System.out.println(LargestPrime.getLargestPrime(217));
        System.out.println(LargestPrime.getLargestPrime(0));
        System.out.println(LargestPrime.getLargestPrime(45));
        System.out.println(LargestPrime.getLargestPrime(-1));

       System.out.println("\nFlour Pack Problem ");
        System.out.println("(1,0,4 - F)"+ FlourPacker.canPack(1,0,4));
        System.out.println("(1,0,5- T)"+FlourPacker.canPack(1,0,5));
        System.out.println("0,5,4 - T)"+FlourPacker.canPack(0,5,4));
        System.out.println("(2,2,11 - T)" + FlourPacker.canPack(2,2,11));
        System.out.println("(-3,2,12 - F)" + FlourPacker.canPack(-3, 2, 12));
        System.out.println("(2,2,12 - T)" + FlourPacker.canPack(2,2,12));
        System.out.println("(5,3,24 - F)" + FlourPacker.canPack(5,3,24));
        System.out.println("(22,10,18 - T)" + FlourPacker.canPack(2,10,18));

        System.out.println("\nNumber To words");
        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));
        System.out.println("==============================");
        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(1212));
        System.out.println(NumberToWords.reverse(1234));
        System.out.println(NumberToWords.reverse(1));
        System.out.println("==============================");
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
        NumberToWords.numberToWords(0);



        System.out.println("\nPerfect Number");
        System.out.println(PerfectNumber.isPerfectNumber(6));
        System.out.println(PerfectNumber.isPerfectNumber(28));
        System.out.println(PerfectNumber.isPerfectNumber(5));
        System.out.println(PerfectNumber.isPerfectNumber(-1));


        System.out.println("\nFactor Printer");
        FactorPrinter.printFactors(6);
        FactorPrinter.printFactors(32);
        FactorPrinter.printFactors(10);
        FactorPrinter.printFactors(-1);


        System.out.println("\nGreatest Common Divisor");
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25,15));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12,30));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9,18));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81,153));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12,30));


        System.out.println("\nLast Digit Checker");
        System.out.println("(42,22,71) :" + LastDigitChecker.hasSameLastDigit(41,22,71));
        System.out.println("(23,32,42) :" + LastDigitChecker.hasSameLastDigit(23,32,42));
        System.out.println("(9,99,999) :" + LastDigitChecker.hasSameLastDigit(9,99,999));
        System.out.println("(22,23,34) :" + LastDigitChecker.hasSameLastDigit(22,23,34));
        System.out.println("(11,22,31) :" + LastDigitChecker.hasSameLastDigit(11,22,31));
        System.out.println("==============================");
        System.out.println(LastDigitChecker.isValid(10));
        System.out.println(LastDigitChecker.isValid(468));
        System.out.println(LastDigitChecker.isValid(1051));

        System.out.println("\nShared Digit ");
        System.out.println(SharedDigit.hasSharedDigit(21,20));
        System.out.println(SharedDigit.hasSharedDigit(9,99));
        System.out.println(SharedDigit.hasSharedDigit(15,55));
        System.out.println(SharedDigit.hasSharedDigit(12,43));
        System.out.println(SharedDigit.hasSharedDigit(100,10));

        System.out.println("\nEven digit sum");
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println(EvenDigitSum.getEvenDigitSum(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(-22));


        System.out.println("\nFirst and Last Digit Sum");
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(252));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(257));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit (-10));

        System.out.println("\nPalindrome number");
        System.out.println(NumberPalindrome.isPalindrome(-1221));
        System.out.println(NumberPalindrome.isPalindrome(707));
        System.out.println(NumberPalindrome.isPalindrome(11212));

        System.out.println("\nsum of digits");
        System.out.println(DigitSumChallenge.sumDigits(125));
        System.out.println(DigitSumChallenge.sumDigits(-125));
        System.out.println(DigitSumChallenge.sumDigits(4));
        System.out.println(DigitSumChallenge.sumDigits(32123));

        System.out.println("\nSum Odd");
        System.out.println(SumOddRange.sumOdd(1, 100));
        System.out.println(SumOddRange.sumOdd(-1, 1000));
        System.out.println(SumOddRange.sumOdd(100, 100));
        System.out.println(SumOddRange.sumOdd(13, 13));
        System.out.println(SumOddRange.sumOdd(100, -100));
        System.out.println(SumOddRange.sumOdd(100, 1000));*/
    }
}
