package edu.cnm.deepdive;


/**
 * Instances of this class represent single cards in a deck of standard playing
 *cards. These instances are immutable: once initialized, the rank and suit of
 *  * a card can't be changed.
 *
 * @author Faycel Beji &amp; Deep Dive Coding Java + Android Bootcamp cohort 6
 *  * @version 1.0
 */

public class Card {

  private Rank rank;
  private Suit suit;


  /**
   * Initialized the <code>Card</code> instance with the specified {@link Suit}
   *  and {@link Rank}
   *
   *
   *
   * @param rank  cards's rank (A,2, &hellip;K).
   * @param suit card(Clubs, Diamonds, Hearts, Spades)
   */



  public Card(Rank rank, Suit suit) {

    this.rank = rank;
    this.suit = suit;

  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {

    return suit;
  }

  @Override
  public String toString() {
    return String.format("%s %s", rank, suit);
  }

}
