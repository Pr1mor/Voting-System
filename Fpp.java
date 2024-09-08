/**
 * First Past the Post Voting System
 */
public class Fpp {

    private String[] candidates; // list of all candidates
    private int numVoters; // number of total voters

    // Constructor
    Fpp(String[] candidates, int numVoters) {
        this.candidates = candidates;
        this.numVoters = numVoters;
    }

    public String toString() {
        String formattedString = "List of Candidates\n";

        for (String i : candidates) {
            formattedString += i + "\n";
        }

        formattedString += "\nNumber of Voters: " + numVoters + "\n";

        return formattedString;
    }

}