package com.company;
import java.util.Random;
public class Player {
    public int guess(){
        Random random = new Random();
        return random.nextInt(9 );
    }
}
