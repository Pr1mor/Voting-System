public class test1 {

    final static String[] CANDIDATES = { "apple", "banana", "mango" };
    final static int NUM_VOTERS = 3;

    public static void main(String[] args) {

        Fpp f2 = new Fpp(CANDIDATES, NUM_VOTERS);
        f2.votingCycle();
        System.out.println(f2.getVotesToCandidates());
    }

    public static void testToString() {

        // Fpp testToString
        Fpp f1 = new Fpp(CANDIDATES, NUM_VOTERS);
        System.out.println(f1);
    }
}
