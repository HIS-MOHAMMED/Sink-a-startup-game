package com.company;
import java.util.ArrayList;
import java.util.Random;
public class Startup {
    private ArrayList<Integer> locationCells;
    public void setLocationCells( ArrayList<Integer>loc){
        locationCells = loc;
    }
    public String checkYourSelf(int userGuess){
        String state = "";
        for (int i = 0; i < locationCells.size(); i++) {
            if(userGuess >= 0) {
                locationCells.remove(i);
                if(locationCells.isEmpty()){
                    state = "kill";
                }
                else{
                    state = "hit";
                    break;
                }
            }else state = "miss";
        }
        System.out.println(state);
        return state;
    }
}
