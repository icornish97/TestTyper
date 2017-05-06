/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typetester;

/**
 *
 * @author Ian Cornish
 */
import java.util.Scanner; 
import java.util.InputMismatchException;
public class userInteraction {
    static double outNum;
    public userInteraction(){
     
}
    //This will check how many whole decimal places the user would like 
    //returns numWhole
    public int numUI(){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Single (1), Tens (2), Hundreds (3), Thousands (4), Ten Thousands (5), Hundred Thousands (6), Millions (7): ");
            int numWhole = in.nextInt(); 
            
        while (numWhole!= 1||numWhole!=2|| numWhole!=3||numWhole!=4||numWhole!=5||numWhole!=6||numWhole!=7){
            
            if (numWhole==1) {
                    return numWhole;}
            else if (numWhole==2) {               
                    return numWhole;}
            else if (numWhole ==3) {
                    return numWhole;}
            else if (numWhole ==4) {
                    return numWhole;}
            else if (numWhole ==5) {
                    return numWhole;}
            else if (numWhole ==6) {
                    return numWhole;}
            else if (numWhole ==7) {
                    return numWhole;}
   
            else{
                System.out.println("Please enther a valid option!");
                
                System.out.print("Single (1), Tens (2), Hundreds (3), Thousands (4), Ten Thousands (5), Hundred Thousands (6), Millions (7): ");
                numWhole = in.nextInt(); 
            }
            }           
        return 1;
    }    
    //accepts int numWhole
    //returns outNum
        public double wholeNums(int numWhole){
        
        Scanner in = new Scanner(System.in);
        numMaker number = new numMaker();
        
            if (numWhole==1) {
                outNum = number.single();
                    return outNum;}
            else if (numWhole==2) {                
                outNum = number.ten();
                    return outNum;}
            else if (numWhole ==3) {
                outNum = number.hundred(); 
                    return outNum;}
            else if (numWhole ==4) {
                outNum = number.thousand();
                    return outNum;}
            else if (numWhole ==5) {
                outNum = number.tenThousand();
                    return outNum;}
            else if (numWhole ==6) {
                outNum = number.hundredThousand();
                    return outNum;}
            else if (numWhole ==7) {
                outNum = number.million();
                    return outNum;}
            else{
            }
                       
        return 1;
    }    
    //this will check if the user wants decimals at the end of their number 
    public double youWantSomeDecimalsWithThat(int decimals){
        
        Scanner in = new Scanner(System.in); 
        numMaker number = new numMaker();  
            if(decimals==1){
                outNum = outNum + number.decimal();
                System.out.println(outNum);
                return outNum;
            }
            else if(decimals==0){
                outNum = outNum;
                System.out.println(outNum);
                return outNum;
            }else{}
        
    return 1;}
    
    //this will check if the user wants decimals at the end of their number 
    public int decUI(){
        
        Scanner in = new Scanner(System.in); 
        numMaker number = new numMaker();
        
        System.out.print("Decimals? (y/n)");
            String twoPoints = in.next();
            int decimals; 
        while (twoPoints != "y"|| twoPoints!="n"){           
            if(twoPoints.equals("y")){
                decimals = 1;
                return decimals;
            }
            else if(twoPoints.equals("n")){
                decimals = 0; 
                return decimals;
            }
            else{
                System.out.println("Please enter y or n (be sure to use lowercase and that there are no spaces before or after your input!)");
                
                System.out.print("Decimals? (y/n)");
                twoPoints = in.next();
            }
            
        }
    return 8;
    }
    
    //Ask if the user would like to play again 
    public void playAgain(){
        Scanner in = new Scanner(System.in);
        playGame i = new playGame();
        
        System.out.print("Would you like to play again? (y/n)");
            String keepGoing = in.next();
        while (keepGoing!="y"|| keepGoing!="n"){
            if(keepGoing.equals("y")){
            i.gameFirstLoop();
            }
            else if(keepGoing.equals("n")){
            System.exit(0);
            }
            else{
                System.out.println("Please enter y or n (be sure to use lowercase and that there are no spaces before or after your input!)");
                
                System.out.print("Would you like to play again? (y/n)");
                keepGoing = in.next();
            }
        }
            
    }
    //gets the number of rounds that the user would like to play
    public int playTimes(){
        
        boolean i = true; 
        while(i=true){ 
            try{ 
                Scanner in = new Scanner(System.in);
                System.out.print("How many round would you like to play?: ");
                int rounds = in.nextInt();
                if (rounds<0){
                while(rounds<0){
                    
                    System.out.println("please enter a positive number!");
                    System.out.print("How many round would you like to play?: ");
                    rounds = in.nextInt();
                    }
                    i = false;
                    return rounds;
                }
                else{
                    i = false;
                    return rounds;
                }
            } 
            catch(InputMismatchException e){
                System.out.println("please enter a numerical value!");
            }
        
    }
    return 1; }
}
