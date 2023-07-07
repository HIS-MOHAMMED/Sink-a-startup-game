package com.company;
import java.util.Random;
public class GuessGame {
    Player p1 = new Player() ;
    Player p2 = new Player();
    Player p3 = new Player();
    Random random = new Random();
    int correctNumber = random.nextInt(10);
    public void startGame(){
        while(true){
            System.out.println("Number to guess is " + correctNumber );
            int player1 = p1.guess();
            int player2 = p2.guess();
            int player3 = p3.guess();
            System.out.println("I'm guessing " + player1);
            System.out.println("I'm guessing " + player2);
            System.out.println("I'm guessing " + player3);
            if(player1 == correctNumber){
                winner(1);
                break;
            }
            else if(player2 == correctNumber) {
                winner(2);
                break;
            }
            else if (player3 == correctNumber ) {
                winner(3);
                break;
            }
            else {
                System.out.println("players will have to try again");
            }
        }
   }
   public void winner(int num){
       System.out.println("We have a winner.");
       for (int i = 1; i <= 3; i++) {
           if(i == num) {
               System.out.println("player " + i + " got it right?" + " true");
           }else System.out.println("player " + i + " got it right?" + " false");
       }
       System.out.println("Game is over.");
   }
}
