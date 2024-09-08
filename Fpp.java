import java.util.Scanner;

/**
 * First Past the Post Voting System
 */
public class Fpp implements VotingSystem {

    private String[] candidates; // list of all candidates
    private int numVoters; // number of total voters
    private int[] votesToCandidates; // stores number of votes each candidate gets

    // Constructor
    Fpp(String[] candidates, int numVoters) {
        this.candidates = candidates;
        this.numVoters = numVoters;
        votesToCandidates = new int[this.candidates.length];
    }

    // toString for Fpp
    public String toString() {
        return getCandidates() + "\n" + getVoters();
    }

    // gives you a formatted string representing the data on how many votes each
    // candidate got
    /*
     * candidate 1: 10
     * candidate 2: 2 ...
     */
    public String getVotesToCandidates() {
        String formattedString = "";

        for (int i = 0; i < votesToCandidates.length; i++) {
            formattedString += candidates[i] + ": " + votesToCandidates[i] + "\n";

        }

        return formattedString;
    }

    // Interface method 1
    public String getCandidates() {
        String formattedString = "List of Candidates\n";

        for (String i : candidates) {
            formattedString += i + "\n";
        }

        return formattedString;
    }

    // Interface method 2
    public String getVoters() {
        return "Number of Voters: " + numVoters;
    }

    // Interface method 3
    public void winner() {

    }

    public void votingCycle() {
        Scanner scnr = new Scanner(System.in);

        for (int i = 0; i < numVoters; i++) {
            System.out.print(getCandidates());
            System.out.print("Voter " + (i + 1) + "'s choice: ");
            // right now assuming input is correct
            int userChoice = scnr.nextInt();
            votesToCandidates[userChoice - 1]++;

            System.out.println("\n\n");

        }

        scnr.close();
    }

}