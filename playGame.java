/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typetester;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ian Cornish
 */
public class playGame {
int correct = 0;
int incorrect = 0;
ArrayList<String> score = new ArrayList<String>();

//run the first loop of the game
    public int[] gameFirstLoop(){

    userInteraction ui = new userInteraction(); 
    int loops = ui.playTimes();
    playGame pg = new playGame();
    int beforeDecimal =ui.numUI();
    int afterDecimal = ui.decUI();

    
    int[] userPreferances = {beforeDecimal, afterDecimal};
    
    for(int i=1; i<loops;i++){
    pg.gameRun(userPreferances);
    }
    pg.gameLastLoop(userPreferances);
    return userPreferances;
    }

    //Run the game
    public int[] gameRun(int[] userPreferances){
        Scanner in = new Scanner(System.in);
        numMaker number = new numMaker();
        Random rand = new Random();
        userInteraction ui = new userInteraction();
        userType ut = new userType(); 
        playGame pg = new playGame();
        
        int beforeDecimal = userPreferances[0];
        int afterDecimal = userPreferances [1];
        
        double newNum = ui.wholeNums(beforeDecimal);
        double numToType=ui.youWantSomeDecimalsWithThat(afterDecimal);
        double userNum = ut.getUserNum();
        score = ut.checkNum(userNum, numToType, score);   
 
        pg.scoreTrack(score);
        return userPreferances;
    }
    
    //Run the final game of Type Tester
    public void gameLastLoop(int[] userPreferances){
        Scanner in = new Scanner(System.in);
        numMaker number = new numMaker();
        Random rand = new Random();
        userInteraction ui = new userInteraction();
        userType ut = new userType(); 
        playGame pg = new playGame();

        int beforeDecimal = userPreferances[0];
        int afterDecimal = userPreferances [1];        

        double newNum = ui.wholeNums(beforeDecimal);
        double numToType=ui.youWantSomeDecimalsWithThat(afterDecimal);
        double userNum = ut.getUserNum();
        score = ut.checkNum(userNum, numToType, score); 
        pg.scoreTrack(score);
        ui.playAgain();
    }
    
    
    //track how many correct and incorect numbers that the user has entered
    public void scoreTrack(ArrayList<String> score){
    int correct = Collections.frequency(score, "win");
    int incorrect =Collections.frequency(score,"lose");
    System.out.println("SCORE: "+correct+" correct "+incorrect+" incorrect"); 
    }}

    

