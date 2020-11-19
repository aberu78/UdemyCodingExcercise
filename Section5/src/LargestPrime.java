public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number <= 1)
            return -1;
        int prime;
        for (prime = 2; prime < number; prime++) {
            if (number % prime == 0) {
                number /= prime;
                prime--; //reduce one for for loop prime ++;

            }
        }
        return prime;
    }
}
