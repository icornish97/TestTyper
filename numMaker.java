/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typetester;

import java.util.Random;

/**
 *
 * @author Ian Cornish
 */
public class numMaker {
    public numMaker(){
        double testNum = 0; 
    }
    
    //Generate a number with 1 number before the decimal place
    public int single(){
        Random rand = new Random();
        int one = rand.nextInt(9);
            int fullNum = one;
                return fullNum;
    }
    
    //Generate a number with 2 numbers before the decimal place
    public int ten(){
        Random rand = new Random();
        int one = rand.nextInt(9)*10;
        int two = rand.nextInt(9);
            int fullNum = one+two;
                return fullNum; 
    }
    
    //Generate a number with 3 numbers before the decimal place
    public int hundred(){
        Random rand = new Random();
        int one = rand.nextInt(9)*100;
        int two = rand.nextInt(9)*10;
        int three = rand.nextInt(9); 
            int fullNum = one+two+three;
                return fullNum; 
    }
    
    //Generate a number with 4 numbers before the decimal place
    public int thousand(){
        Random rand = new Random();
        int one = rand.nextInt(9)*1000;
        int two = rand.nextInt(9)*100;
        int three = rand.nextInt(9)*10;
        int four = rand.nextInt(9); 
            int fullNum = one+two+three+four;
                return fullNum;
    }
    
    //Generate a number with 5 numbers before the decimal place
    public int tenThousand(){
        Random rand = new Random(); 
        int one = rand.nextInt(9)*10000;
        int two = rand.nextInt(9)*1000;
        int three = rand.nextInt(9)*100;
        int four = rand.nextInt(9)*10; 
        int five = rand.nextInt(9);
            int fullNum = one+two+three+four+five;
            return fullNum;
    }
    
    //Generate a number with 6 numbers before the decimal place
    public int hundredThousand(){
        Random rand = new Random(); 
        int one = rand.nextInt(9)*100000;
        int two = rand.nextInt(9)*10000;
        int three = rand.nextInt(9)*1000;
        int four = rand.nextInt(9)*100; 
        int five = rand.nextInt(9)*10; 
        int six = rand.nextInt(9);
            int fullNum = one+two+three+four+five+six;
                return fullNum; 
    }
    
    //Generate a number with 7 numbers before the decimal place
    public int million(){
        Random rand = new Random();
        int one = rand.nextInt(9)*1000000;
        int two = rand.nextInt(9)*100000;
        int three = rand.nextInt(9)*10000;
        int four = rand.nextInt(9)*1000; 
        int five = rand.nextInt(9)*100; 
        int six = rand.nextInt(9)*10;
        int seven = rand.nextInt(9);
            int fullNum = one+two+three+four+five+six+seven;
                return fullNum;
    }
    
    //Generate two decimals 
    public double decimal (){ 
        Random rand = new Random(); 
        double bigOne = rand.nextInt(9);
        double decOne = bigOne / 10;
    //making sure the last number is not 0
        double bigTwo = rand.nextInt(8)+1; 
        double decTwo = bigTwo /100;
            double fullDec = decOne+decTwo;
                return fullDec;
    }
}
