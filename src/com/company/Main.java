package com.company;
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        boolean isALive = true;
        int numOfGuess = 0;
        String result = "";
        Random random = new Random();
        GameHelper helper = new GameHelper();
        Startup startup  = new Startup();
        int num = random.nextInt(7);
        ArrayList<Integer> arr = new ArrayList<>(3);
        for(int i = 0 ; i < 3;i++){
            arr.add(num + i);
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        startup.setLocationCells(arr);
        while (isALive){
            int userGuess = helper.getInputFromUser("Enter your guess");
            numOfGuess++;
            result = startup.checkYourSelf(userGuess);
            if(result.equals("kill"))   isALive = false;
        }
        System.out.println("You Took " + numOfGuess + " Guesses.");
    }
}
