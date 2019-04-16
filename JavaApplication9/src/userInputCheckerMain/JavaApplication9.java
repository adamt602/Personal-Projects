/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInputCheckerMain;

import java.util.*;

/**
 *
 * @author Bioni
 */
public class JavaApplication9 {

    /**
     * This program uses a loop and a hasNextInt to check the users input
     * to make sure it is a valid input
     * 
     *  
     */
    public static void main(String[] args) {
        
         Scanner keyBoard = new Scanner(System.in);
      int randomNumber = 0;
      
      boolean loop = true;
     
    while(loop){
        System.out.println("Enter a random number XD");
            if(keyBoard.hasNextInt()){
      randomNumber = keyBoard.nextInt();
      loop = false;
     }
     
        else{
                keyBoard.next();
            System.out.println("Please type a valide input.");
     }
    }
    }
        
        
        
    }
    
    

