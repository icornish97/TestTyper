/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typetester;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
/**
 *
 * @author Ian Cornish
 */
    
public class userType {
    //this method will get an input from the user
    public double getUserNum(){
    boolean i = true; 
    while(i=true){ 
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Number: ");
        
                double userNum = in.nextDouble(); 
                i = false;
                return userNum; }
        catch(InputMismatchException e){
        System.out.println("Please enter a numerical value!");
        }
            }
    return 1;
    }
    
    //This method will check and see if the numeber that the user has input is correct and inputs win or loss in arraylist score
    public ArrayList<String> checkNum(double userNum, double newNum, ArrayList<String> score ){

        if (userNum==newNum){
            System.out.println("Congragulations!");
            score.add("win");
        }else{
            System.out.println("Better luck next time:(");
            score.add("lose");

        }  
    return score;
    }
}
