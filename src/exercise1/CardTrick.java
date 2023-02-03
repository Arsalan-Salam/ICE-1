package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */

import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        
        
        Card[] hand = new Card[7];
        
        int value = (int)Math.random()*13+1;
        int suit =(int)Math.random()*3; 

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(value);
            card.setSuit(Card.SUITS[suit]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        } 
 
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Please guess a card suit from 0-3");
        String suitInputUser = input.nextLine();
        System.out.print("Please enter a card value from 1-13");
        int cardValueInputUser = input.nextInt();
        
        boolean userInputValidity = false;
        for (int c=0;c<hand.length;c++){
            if(hand[c].getValue() == value && hand[c].getSuit().equals(Card.SUITS[suit])) {
                userInputValidity = true;
                break;
            }
        }
        
        if(userInputValidity){
            printInfo();
        }
        else{
            System.out.println("Sorry incorrect card guess, please try again");
        }
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Arsalan,I am a student at Sheridan College, Arsalan or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Playing video game");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Playing outdoor sports");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
       
    
    }

}
