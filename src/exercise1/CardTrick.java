package exercise1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Vaibhav Sanghani May 23, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            Random random = new Random();
            card.setValue(random.nextInt(13) + 1); 
            
            
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
            //       Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card: ");
        int value = scanner.nextInt();
        System.out.print("Enter the suit of your card (0-Hearts, 1-Diamonds, 2-Clubs, 3-Spades): ");
        int suit = scanner.nextInt();

        boolean foundMatch = false;
        for (Card card : hand) {
            if (card.getValue() == value && card.getSuit().equalsIgnoreCase(Card.SUITS[suit])) {
                foundMatch = true;
                break;
            }
        }
        
        if (foundMatch) {
            printInfo(); //added printinfo
        }
    }
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo(){
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Vaibhav, but you can call me by name.");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- To Be successful in cyber security field.");
        System.out.println("-- buy toyota Supra");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Gaming");
        System.out.println("-- Cooking");
        System.out.println("-- Watching TV");
        System.out.println("-- travelling");

        System.out.println();
        
    
    }

}


    
