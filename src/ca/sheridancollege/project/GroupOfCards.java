/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {

    // The group of cards, stored in an ArrayList
    private ArrayList<Card> Card;
    private int size;// the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
        Card = new ArrayList<>();
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * Shuffle the cards in the group.
     */
    public void shuffle() {
        Collections.shuffle(Card);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Add a card to the group.
     *
     * @param card the card to add
     */
    public void addCard(Card card) {
        if (Card.size() < size) {
            Card.add(card);
        } else {
            System.out.println("Cannot add more cards. Group is full.");
        }
    }

    /**
     * Create a standard deck of cards (52 cards).
     */
    public void createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                Card.add(new Card(suit, rank));
            }
        }
    }

    /**
     * Display all the cards in the group.
     */
    public void displayCards() {
        for (Card card : Card) {
            System.out.println(card);
        }
    }

}//end class
