import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //class rpsPlayer
    //main()
    //String playerA
    //String playerB
    //String continueChoice = “Y”
    //do
    //		output “What is your choice Player A, please type your choice in the form of a capital letter I.E R = Rock”
    //		input playerA
    //		output “What is your choice Player B, please type your choice in the form of a capital letter I.E R = Rock”
    //		input playerB
    //  	 if playerA == “R” then
    //		if playerB == “R”
    //			output “It’s a tie! No one wins.”
    //		else if playerB == “P”
    //			output “Paper covers Rock! B wins.”
    //		else if playerB == “S”
    //			output “Rock breaks Scissors! A wins.”
    //		end If
    //  	 else if playerA == “P” then
    //		if playerB == “R”
    //			output “Paper covers rock! A wins.”
    //		else if playerB == “P”
    //			output “It’s a tie! No one wins.”
    //		else if playerB == “S”
    //			output “Scissors Cut Paper! B wins”
    //		end if
    // 	  else if playerA == “S” then
    //		if playerB == “R”
    //			output “Rocks Breaks Scissors! B wins.”
    //		else if playerB == “P”
    //			output “Scissors Cut Paper! A wins.”
    //		else if playerB == “S”
    //			output “It’s a tie! No one wins.”
    //		end if
    //  	 else
    //		output “Error, the letter you entered isn’t a valid option, please type Y to try again.”
    // 	 end if
    //		output “Would you like to continue, type Y if yes, and N if no”
    //		input continueChoice
    //while continueChoice == “Y”
    //		output “Thank you for playing!”
    //return
    //end class
    public static void main(String[] args) {



                Scanner in = new Scanner(System.in);
                String playerA = "";
                String playerB = "";
                String trash = "";

                boolean done = false;
                do
                {
                    System.out.print("What is your choice Player A, please type your choice in the form of a capital letter I.E R = Rock: ");
                    if(in.hasNextLine())
                    {
                        playerA = in.nextLine();
                        done = true;
                    }
                    else
                    {

                        trash = in.nextLine();
                        System.out.println("" + trash);
                        System.out.println("");
                        done = false;
                    }
                }while(!done);
                do
                {
                    System.out.print("What is your choice Player B, please type your choice in the form of a capital letter I.E R = Rock: ");
                    if(in.hasNextLine())
                    {
                        playerB = in.nextLine();
                        done = true;
                    }
                    else
                    {

                    trash = in.nextLine();
                    System.out.println("" + trash);
                    System.out.println("");
                    done = false;
                    }
                }while(!done);
              System.out.println(playerA);
              System.out.println(playerB);
    }
}