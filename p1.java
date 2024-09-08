import java.util.Scanner;

public class p1 {
    
    public static Scanner scnr = new Scanner(System.in);
    
    public static void main(String[] args) {
        String[] candidates = {"apple","banana","grapes"};
        number_voting(candidates, 5);
    }


    public static void number_voting(String[] candidates , int numberOfVoters){
        // first we have to create a parallel array for the count of the votes that each candidate is getting.
        int[] count_vote = new int[candidates.length];  
        System.out.println(count_vote.length);
       
        for(int i = 1 ; i <= numberOfVoters;i++){
            int choice = print_the_promt(candidates,i); 
            vote_counter(count_vote, choice);
        }

       System.out.println(winner_candidate(candidates, count_vote));

        // for(int i = 0 ; i<candidates.length;i++){
        //     System.out.println(count_vote[i]);
        // }

    
    }

    


    // this function will print the promt for the user and the take ther user input and then return the user input as a choice in the main function.

    public static int print_the_promt(String[] candidates,int count){
        for(int i = 1 ; i<=candidates.length;i++){
            System.out.println(i+">"+candidates[i-1]);
            System.out.println(" ");
        }
        System.out.print("Enter your choice Voter "+count +" : " );
        int choice = scnr.nextInt();
        if(choice<0||choice>candidates.length){
            System.out.println("print give proper vote madarchod.\n\n");
            print_the_promt(candidates, count);
        }
        return choice;
        
    }   
     // now we have to create a function which will go over the user input and then check for the input. and see if the input is correct or not if not then ask the user to give the right input.
    public static void vote_counter(int[] count_vote,int choice){
        count_vote[choice-1]++;
    }

    // now we have to create a winning function 
    // we have to make sure that there is only one winner in the election so we have to check if there is two max function then we have to declare that there is two max function and due to same number of votes to candidate we have to the election and it is upto the user if he / she chooses to use the same election way or not.

    public static String winner_candidate(String[] candidate,int[] count_vote){
        int max = 0;
        int secondMax = 0;
        int position = 0 ;
        String winner = "";

        for(int i = 0 ; i < count_vote.length;i++ ){
            if(count_vote[i]>max){
                max = count_vote[i];
                position = i;
            }
            else if(count_vote[i]==max){
                secondMax = max;
            }
            
        }

        if(secondMax == max){
            System.out.println("There is no winner in this election if you want to redo the election press the following key.");
        }
        else{
            winner = candidate[position];
        }
        return winner;
    }


    }


