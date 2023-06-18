/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guesgame;

/**
 *
 * @author HP
 */

import java.util.Scanner;
import java.util.Random;

public class GuesGame {

    public static void main(String[] args) {
       System.out.println("Hello Welcome to the GuesGame");
       System.out.println("Please Enter your Name: ");
       Scanner scanner = new Scanner(System.in);
       String Name=scanner.next();
       System.out.println("Hello "+Name );
      
      System.out.println("Should we start the game?" );
      System.out.println("\t1.Yes");
      System.out.println("\t2.No");
      
      int beginAnswer=scanner.nextInt();
      
      while (beginAnswer!=1){
            System.out.println("Should we start the game?" );
            System.out.println("\t1.Yes");
            System.out.println("\t2.No");
            beginAnswer=scanner.nextInt();
      }
        Random random=new Random();
        int x = random.nextInt(20)+1;
        System.out.println("Please Enter a Number: ");
        int number=scanner.nextInt();
        
        int timesTried=0;
        int maxTrials=5;
        boolean hasWon= false;
        boolean shouldFinish= false;
        
        while(!shouldFinish && timesTried<4)
        {
            timesTried++;
            if(number==x){
                hasWon=true;
                shouldFinish=true;
            }
            else if(number<x){
                int remainingAttempts=maxTrials-timesTried;
                System.out.println("You Have "+remainingAttempts+" Remaining attempts Guess higher");
                     number=scanner.nextInt();
            }
            else if(number>x){
                int remainingAttempts=maxTrials-timesTried;
                System.out.println("You Have "+remainingAttempts+" Remaining attempts Guess Lower");
                     number=scanner.nextInt();
                
            }   
            else{
                shouldFinish=true;
               }
        }
            
        if (hasWon){
            
             System.out.println("Congratulations! You have guessed in your "+timesTried+" guess");
        }
        else{
             System.out.println("Game over You have exhausted your 5 Guesses");
              System.out.println("The Number is: "+x);
        }    
 
    }
}
    
