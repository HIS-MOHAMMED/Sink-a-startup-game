package com.company;
import java.util.Scanner;
public class GameHelper {
    public int getInputFromUser(String prompt){
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}