package motivation;

public class motivation {

    public static void main(String[] args) {
        System.out.println(mittelwert(6.548, 6.222, 17.845, 0));
        System.out.println(mittelwert(5));
        System.out.println(mittelwert(22,0));
        System.out.println(potenz(2, 2));
        System.out.println(potenz(4, 2));
        System.out.println(potenz(6, 2));
        System.out.println(potenz(8, 2));
        System.out.println(potenz(1, 2));
        System.out.println(potenz(0, 2));
        System.out.println(potenz(0, 0));
        System.out.println(potenz(2, 0));
        System.out.println(potenz(2, 1));
        System.out.println(potenz(2, 8));
    }

    private static long potenz(int basis, int exponent) {
        if (exponent == 0)
            return 1;

        int ergebnis = basis;
        for (int i = 1; i < exponent; i++)
            ergebnis *= basis;

        return ergebnis;
    }

    private static double mittelwert(double... args) {
        double mw = 0;
        for (int i = 0; i < args.length; i++) {
            mw += args[i];
        }
        return mw / args.length;
    }
}
