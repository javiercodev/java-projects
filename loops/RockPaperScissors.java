import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    // ANSI colors:
    private static final String RED = "\033[31m";
    private static final String BLUE = "\033[34m";
    private static final String WHITE = "\033[37m";
    private static final String NONCOLOR = "\033[30m";

    public static void main(String[] args) throws InterruptedException {

        // The current time in millisecond
        long start = System.currentTimeMillis();

        System.out.println(WHITE + "Welcome to Rock, Paper, Scissors");
        Thread.sleep(1000);

        Scanner s = new Scanner(System.in);
        String answerYesNo;
        boolean toPlay;
        do {
        // Ask the player if they want to play, adding a bit of drama.
        do {
            toPlay = false;
            System.out.println(NONCOLOR + "Are you ready to play?");
            System.out.print(RED + "yes" + NONCOLOR + " / " + BLUE + "no" + NONCOLOR + " : ");
            answerYesNo = s.nextLine();
            toPlay = answerYesNo.equals("yes");
            // If the player has entered the wrong input.
            if (!toPlay && !answerYesNo.equals("no")) {
                System.out.println(NONCOLOR + "failed reading that!");
                Thread.sleep(1000);
            }
            // If the player doesn't actually want to play.
            if (answerYesNo.equals("no")) {
                System.out.println(NONCOLOR + "goodbye, i see you're a scaredy-cat!");
                Thread.sleep(1000);
                return;
            } 
        } while (!toPlay);

        // A countdown.
        for (int i = 3; i >= 0; i--) {
            if (i > 0) {
                System.out.println(WHITE + i);
                Thread.sleep(1000);
            }
            if (i == 0) {
                System.out.println( RED + "Let the game begin! hahaha");
            }
        }

        Thread.sleep(1000);

            boolean win = false;
            int playerWins = 0;
            int machineWins = 0;
            boolean isPlayerWinner = false;
            while (!win) {
                String selectorPlayer;
                boolean isOption;
                // Ask the player for their choice, with validation.
                do {
                    isOption = false;
                    System.out.println();
                    System.out.print(NONCOLOR + "select: " + WHITE + "Rock / Paper / Scissors: ");
                    selectorPlayer = s.nextLine();
                    isOption = (selectorPlayer.equals("Rock")) || (selectorPlayer.equals("Paper")) || (selectorPlayer.equals("Scissors"));
                    if (!isOption) {
                        System.out.print(NONCOLOR + "lear to write, damn it! ");
                    }  
                } while(!isOption);

                // The machine will randomly choose an option.
                String[] machineOptions = new String[] {"Rock", "Paper", "Scissors"};
                Random r = new Random();
                int randomNumber = r.nextInt(3);
                String machineSelector = machineOptions[randomNumber];

                Thread.sleep(1000);
                System.out.println("Your opponent has chosen...");
                Thread.sleep(1000);
                System.out.println(RED + machineSelector);

                System.out.println();

                // Dertermine who wins or loses, depending on the case.
               switch (selectorPlayer) {
                case "Rock":
                    if (machineSelector.equals("Scissors")) {
                        System.out.println(WHITE + "You Win!");
                        playerWins++;
                        
                    }
                    if (machineSelector.equals("Paper")) {
                        System.out.println(WHITE + "You Lose!");
                        machineWins++;
                        
                    }
                    if (machineSelector.equals("Rock")) {
                        System.out.println(WHITE + "It's a draw!");
                    }
                    break;
                case "Paper":
                    if (machineSelector.equals("Rock")) {
                        System.out.println(WHITE + "You Win!");
                        playerWins++;
                        
                    }
                    if (machineSelector.equals("Scissors")) {
                        System.out.println(WHITE + "You Lose!");
                        machineWins++;
                        
                    }
                    if (machineSelector.equals("Paper")) {
                        System.out.println(WHITE + "It's a draw!");
                    }
                    break;
                case "Scissors":
                    if (machineSelector.equals("Paper")) {
                        System.out.println(WHITE + "You Win!");
                        playerWins++;
                        
                    }
                    if (machineSelector.equals("Rock")) {
                        System.out.println(WHITE + "You Lose!");
                        machineWins++;
                        
                    }
                    if (machineSelector.equals("Scissors")) {
                        System.out.println(WHITE + "It's a draw!");
                    }
                    break;
                default:
                    break;
               }

               // If the player or the machine wins, end the game and indicate the winner using the boolean isPlayerWinner.
               if (playerWins == 3) {
                win = true;
                isPlayerWinner = true;
               } else if (machineWins == 3) {
                win = true;
               }
            }

            System.out.println();

            if (isPlayerWinner) {
                System.out.println("Congratulations!");
            } else {
                System.out.println("You're a loser!");
            }

            // Ask the player if they want to play another round.
            toPlay = false;
            System.out.println(NONCOLOR + "Do you want to play again?");
            System.out.print(RED + "yes" + NONCOLOR + " / " + BLUE + "no" + NONCOLOR + " : ");
            answerYesNo = s.nextLine();
            toPlay = answerYesNo.equals("yes");
            // If the player has entered the wrong input.
            if (!toPlay && !answerYesNo.equals("no")) {
                System.out.println(NONCOLOR + "failed reading that!");
                Thread.sleep(1000);
            }
            // If the player doesn't actually want to play.
            if (answerYesNo.equals("no")) {
                Thread.sleep(1000);
                return;
            } 
        } while (toPlay);
    }
}