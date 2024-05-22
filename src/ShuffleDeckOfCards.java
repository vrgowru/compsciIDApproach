import java.util.Arrays;

/************************************************************************************
 * These are set of programs written for Computer Science: Programming with a Purpose
 * course on coursera linked below
 * @link - https://www.coursera.org/learn/cs-programming-java/home/welcome
 *
 * Exercise Link
 * @link - https://introcs.cs.princeton.edu/java/13flow/
 *
 * The programs contain examples, solutions to chapter exercises
 * programming assignments and are authored by
 *
 * @author Venkateshwara Gowru
 *
 * @implSpec - 
 *
 ************************************************************************************/
public class ShuffleDeckOfCards {
    private static final String[] SUITS = {"Hearts", "Clubs", "Spades", "Diamonds"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static String[] buildDeck() {
        String[] Deck = new String[SUITS.length * RANKS.length];
        int count = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                Deck[count] = rank + " Of " + suit;
                count++;
            }
        }
        System.out.println(Arrays.asList(Deck));
        return Deck;
    }

    public static String[] shuffleDeck(String[] deck){
        for(int i =0; i < deck.length; i++){
            String temp = deck[i];
            int randomIndex = i + (int) ((deck.length - i ) * Math.random());
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
        for(int j =0; j < 5; j++){
            System.out.print(deck[j] + ",");
        }
        return deck;
    }

    public static void main(String[] args) {
        String[] deck = buildDeck();
        for(int i = 0; i<5; i++){
            shuffleDeck(deck);
            System.out.println();
        }
    }
}
