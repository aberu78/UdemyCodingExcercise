public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal <= 0 || ((bigCount * 5 + smallCount) < goal)) {
            return false;
        }
        if (smallCount == 0) {
            return (bigCount * 5 % goal) == 0;
        }
        if (bigCount == 0)
            return smallCount >= goal;
        if ((bigCount * 5) > goal)
            return (goal % 5) <= smallCount;
        int restKilo = goal - (bigCount * 5);
        return restKilo <= smallCount;

    }
}
