/**
 * First Past the Post Voting System
 */
public class Fpp implements VotingSystem {

    private String[] candidates; // list of all candidates
    private int numVoters; // number of total voters

    // Constructor
    Fpp(String[] candidates, int numVoters) {
        this.candidates = candidates;
        this.numVoters = numVoters;
    }

    public String toString() {
        return getCandidates() + "\n" + getVoters();
    }

    public String getCandidates() {
        String formattedString = "List of Candidates\n";

        for (String i : candidates) {
            formattedString += i + "\n";
        }

        return formattedString;
    }

    public String getVoters() {
        return "Number of Voters: " + numVoters;
    }

}