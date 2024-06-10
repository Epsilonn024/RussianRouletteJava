import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 2 players
        // player vs AI(BOT)
        // 5 blank round; 1 live round
        // both players do not know which is the live rounde
        // TO-DO list - BOT turns, fix switch/if statements

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Russian Roulette Game!");

        System.out.println("Press P to Play the Game:");
        System.out.println("Press E to Exit the Game:");
        System.out.print("Select an Option:");
        String decisionMenu = scan.next();

        if (decisionMenu.equals("P") || decisionMenu.equals("p")) {
            System.out.println("You have started the Game");
            Start();
        } else if (decisionMenu.equals("E") || decisionMenu.equals("e")) {
            System.out.println("You have Quit the Game. Thank you for Playing!");
            System.exit(0);
        }


    }

    static void Start(){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int liveBullet = rand.nextInt(6)+1;


        for (int i = 1; i<=liveBullet; i++){
            System.out.println("=================================== ");
            System.out.println("TURN " + i);
            System.out.println("Please Select who to shoot");
            System.out.println("Press 0 to Shoot Yourself");
            System.out.println("Press 1 to Shoot the Opponent");
            int turn = scan.nextInt();
            System.out.println("=================================== ");

            int enemyTurn;

            switch (turn)   {
                case 0: if (i<liveBullet){
                    System.out.println("Bullet " + i + " is blank");
                    System.out.println("=================================== ");

                } else {
                    System.out.println("You are dead!");
                    System.out.println("The live round is " + liveBullet);
                    System.out.println("=================================== ");

                }
                break;
                case 1: if (i<liveBullet){
                    System.out.println("Bullet " + i + " is blank");
                    System.out.println("=================================== ");

                } else {
                    System.out.println("You defeated the Opponent!");
                    System.out.println("The live round is " + liveBullet);
                    System.out.println("=================================== ");

                }
                break;

                default:
                    System.out.println("Please select the correct option");
                break;
            }
        }
    }
    /*
    static void enemyTurn(){


    }
     */
}