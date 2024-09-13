public class test1 {

    final static String[] CANDIDATES = { "apple", "banana", "mango" };
    final static int NUM_VOTERS = 3;

    public static void main(String[] args) {

        testWinner();
    }

    public static void testToString() {

        // Fpp testToString
        Fpp f1 = new Fpp(CANDIDATES, NUM_VOTERS);
        System.out.println(f1);
    }

    public static void testWinner() {
        Fpp f1 = new Fpp(CANDIDATES, NUM_VOTERS);
        f1.winner();
    }
}
