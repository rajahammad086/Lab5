//Raja Hammad Mehmood
// This program runs the Pig game.
import java.util.Scanner;


public class Pig {

    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter how many players you want to play with");

        int players= scanner.nextInt();// number of players
        while(players <2) { // checking in valid number
            System.out.println("enter at least 2 players");
            players= scanner.nextInt();

        }
        scanner.nextLine();
        int[] noofplayers = new int[players];// array for the number of players
        int[] sum = new int[players];// array for sum of scores
        int roll;
        boolean flag =false;
        boolean condition=true;
        String opinion;
        for (int x=0;; x++) { //runs for every player (x is the loop controlling variable)
            condition=true;
            if (x==(players)) { // goes back to the first player if the final player has done the turn
                x=0;
            }
            while (condition=true) {



                System.out.println("player "+(x+1)+" do you want to roll?");

                opinion=scanner.nextLine();//saves if user wants to roll again or not

                if (opinion.equalsIgnoreCase("yes")) {


                    roll=(int)(Math.random()*6)+1;
                    System.out.println("player "+(x+1)+" your roll is "+roll);
                    if (roll==1) {
                        System.out.println("end of turn as you rolled 1");
                        break;



                    } else {
                        sum[x]=sum[x]+roll;

                        if (sum[x]>=100) {
                            System.out.println("player "+ (x+1) + " wins with "+ sum[x] + " points !");
                            flag=true;
                            break;

                        }

                    }

                    System.out.println("Current scores:");
                    for (int i=0; i<noofplayers.length ; i++) {
                        System.out.println("player "+ (i+1)+" :" + sum[i]);

                    }

                }

                else {
                    System.out.println("end of turn");
                    break;
                }


            }
            if (flag==true) {
                break;
            }

        }

    }

}





