import java.util.Scanner;

public class Main {

    public static String filename = "";

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("###### WELCOME TO OUR VOTING PROGRAM ######\n");
        System.out.print("Please provide our choice (.txt file): ");
        String filePath = scnr.nextLine();
        filename += filePath + ".txt";

        scnr.close();
    }
}
