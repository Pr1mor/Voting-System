import java.util.Scanner;;
/*
 * first past the post voting system.
 */


public class  FPP implements VotingSystem{
    

    
    private String[] candidates; // stores the name of the candidates.
    private int voters; // gives the total number of voters .
    private static int[] votesToCandidates; // store the votes recieved to a candidates.


    public  FPP (String[] candidates,int voters){
        this.candidates  = candidates;
        this.voters = voters;
        FPP.votesToCandidates = new int[candidates.length] ;
    }

    public String toString(){
        return "We have "+candidates.length+" number of candidates in the election.";
    }


    public String getCandidates(){
        String formattedString = "";
        for(int i = 0 ; i < candidates.length;i++){
            formattedString += i + ">" + candidates[i]+"\n";
        }
        return formattedString;
    }

    public String getVoters(){
        return "The total number of voters are " + voters;

    }

    public void winner(){
        // use the helper method to get the winner.
        votingCycle();
    }


    // this method will start the voting cycle
    // in this method we have start the voting cycle using the number of votes.
    public void votingCycle(){
        int choice = 0;
        for(int i = 1;i<=voters;i++){
            // now we are using the helper method which will print the prompt for the voting for the user.
            printThePromt();
            choice = voterChoice(i);
            putTheVoterChoice(choice);
        }
        checkwinner();
    }  
    
    // this method will print the prompt and return the choice of the user.

    public void printThePromt(){
        int choice = 0 ;
        for(int i = 1 ; i<=candidates.length;i++){
            System.out.println(i+">"+candidates[i-1]+"\n");
            // now we will use a method which will take the user input and return it to the print the promt  and then print the promt method will return that to different method.
         
        }
       
    }


    // this method will take the voters choice and check if the voter has given a right choice or not and then based on the input it 
    // will return the valid choice.
    public int voterChoice(int voterNumber){
        Scanner scnr = new Scanner(System.in);
        boolean validInput = false;
        int realChoice = 0;
        do {
            validInput = false;
            System.out.print("Enter Your choice Voter "+voterNumber+":" );
            String userInput = scnr.nextLine();
            userInput = userInput.trim();
            boolean isNumber = true;
            if(userInput.length()==0){
                isNumber = false;
            }
            for(int i = 0 ; i < userInput.length()&&isNumber;i++){
                if(!Character.isDigit(userInput.charAt(i))){
                    isNumber = false;
                }
            }
            if(isNumber){
                if(Integer.parseInt(userInput)>0&&Integer.parseInt(userInput)<candidates.length){
                    validInput = true;
                    realChoice = Integer.parseInt(userInput);
                }

                
            }

            
        } while (!validInput);

        return realChoice;


    }
    

    // this method will allocate the right vote to right candidate.
    public void putTheVoterChoice(int choice){
        votesToCandidates[choice-1]++;
    }

    // this method will check for the winner by traversing through the array and giving the deserving candidate the crown.
    public void checkwinner(){
        int max = 0 ; 
        int secondMax = 0 ; 
        int position = 0;
        for(int i = 0 ; i<votesToCandidates.length;i++){
            System.out.println(votesToCandidates[i]);
        }
        for(int i = 0 ; i < votesToCandidates.length;i++){
            if(votesToCandidates[i]>max){
                max = votesToCandidates[i];
                position = i;
            }
            else if(max == votesToCandidates[i]){
                secondMax = max;
            }
        }
        if(secondMax != max){
            System.out.println("!!!!! AND THE WINNER IS \" "+candidates[position]+" \" !!!!!");
        }
        else{
            System.out.println("!! THERE IS NO WINNER AT ALL !!");
        }
         
    }


    
        
    
}
