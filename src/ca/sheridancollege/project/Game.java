/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Game {

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game

    public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();
       public static class BlackjackGame extends Game {
        private final GroupOfCards deck;
        private final Players players;
        private final Scanner scanner;

        public BlackjackGame(String name) {
            super(name);
            deck = new GroupOfCards();
            players = new Players();
            scanner = new Scanner(System.in);
        }

        @Override
        public void play() {
            // Initialize deck and players
            deck.createDeck();
            deck.shuffle();
            players.createPlayers();

            // Game logic here
            // Implement Blackjack game rules
        }

        @Override
        public void declareWinner() {
            // Implement logic to declare and display the winning player in Blackjack
        }
    }
}

class GroupOfCards {
    // Implementation for GroupOfCards class
}

class Player {
    // Implementation for Player class
}

class Players {
    // Implementation for Players class
}

class Card {
    // Implementation for Card class
}

//end class
