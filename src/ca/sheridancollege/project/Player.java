/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.Random;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * Extend and implement this class for your specific game.
 *
 * @author Prabhjot Kaur
 * @author Prabhjot Kaur Feb 2024
 */
public abstract class Player {

    private String name; // The unique name for this player
    private int score; // The score of the player

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
        this.score = 0; // Initialize the score to 0
    }

    /**
     * Get the player's name
     *
     * @return the player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the player's name
     *
     * @param name the player's name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the player's score
     *
     * @return the player's score
     */
    public int getScore() {
        return score;
    }

    /**
     * Set the player's score
     *
     * @param score the player's score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Increase the player's score by a specified amount
     *
     * @param points the points to add to the player's score
     */
    public void addPoints(int points) {
        this.score += points;
    }

    /**
     * Decrease the player's score by a specified amount
     *
     * @param points the points to subtract from the player's score
     */
    public void subtractPoints(int points) {
        this.score -= points;
    }

    /**
     * Reset the player's score to zero
     */
    public void resetScore() {
        this.score = 0;
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();

    /**
     * Method to roll a dice.
     *
     * @return the result of the dice roll
     */
    protected int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Rolls a 6-sided dice
    }
}
