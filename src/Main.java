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
                boolean playAgain = false;
                String continueChoice = "Y";

               do {
                do
                {
                    System.out.print("What is your choice Player A, please type your choice in the form of a letter I.E R = Rock: ");
                    playerA = in.nextLine();
                    if(playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("S")||playerA.equalsIgnoreCase("P"))
                    {
                        done = true;
                    }
                    else
                    {
                        trash = playerA;
                        System.out.println("You said your choice was: " + trash);
                        System.out.println("Please input a valid choice, Player A");
                        done = false;
                    }
                }while(!done);
                do
                {
                    System.out.print("What is your choice Player B, please type your choice in the form of a letter I.E R = Rock: ");
                    playerB = in.nextLine();
                     if(playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("S")||playerB.equalsIgnoreCase("P"))
                     {
                        done = true;
                         if (playerA.equalsIgnoreCase("R"))
                         {
                             if (playerB.equalsIgnoreCase("R"))
                                 System.out.println("It’s a tie! No one wins.");

                             else if (playerB.equalsIgnoreCase("P"))
                                 System.out.println("Paper covers Rock! B wins.");
                             else if (playerB.equalsIgnoreCase("S"))
                                 System.out.println("Rock breaks Scissors! A wins.");
                         }
                         if (playerA.equalsIgnoreCase("P"))
                         {
                             if (playerB.equalsIgnoreCase("R"))
                                 System.out.println("Paper covers rock! A wins.");

                             else if (playerB.equalsIgnoreCase("P"))
                                 System.out.println("It’s a tie! No one wins.");
                             else if (playerB.equalsIgnoreCase("S"))
                                 System.out.println("Scissors Cut Paper! B wins");
                         }
                         if (playerA.equalsIgnoreCase("S"))
                         {
                             if (playerB.equalsIgnoreCase("R"))
                                 System.out.println("Rocks Breaks Scissors! B wins.");

                             else if (playerB.equalsIgnoreCase("P"))
                                 System.out.println("Scissors Cut Paper! A wins.");
                             else if (playerB.equalsIgnoreCase("S"))
                                 System.out.println("It’s a tie! No one wins.");
                         }

                     }
                     else
                    {
                        trash = playerB;
                        System.out.println("You said your choice was: " + trash);
                        System.out.println("Please input a valid choice, Player B");
                        done = false;
                     }
                }while(!done);
                do {


                   System.out.println("Do you want to play again? (Y/N)");
                   continueChoice = in.nextLine();
                   if (continueChoice.equalsIgnoreCase("Y")||continueChoice.equalsIgnoreCase("N"))
                   {
                     if (continueChoice.equalsIgnoreCase("Y"))
                     {
                         playAgain = true;
                         done = true;
                     }
                     else
                     {
                         playAgain = false;
                         done = true;
                     }

                   }
                   else
                   {
                       trash = continueChoice;
                       System.out.println("You said you wanted to: " + trash);
                       System.out.println("Please input either a Y or an N");
                       done = false;
                   }
                }while(!done);
               }while (playAgain);

    }
}