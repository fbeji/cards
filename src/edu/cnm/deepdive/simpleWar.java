package edu.cnm.deepdive;

import java.security.SecureRandom;
import java.util.Comparator;
import java.util.Random;

public class simpleWar {

  private Deck deck;
  private Random rng;
  private int tally1;
  private int tally2;
  private Referree referree;

  public simpleWar(Random rng){

    this.rng = rng;
    deck = new Deck();
    deck.shuffle(rng);
    referree = new Referree();
  }

  public void play() {

   boolean tied;

   int pairsDealt = 0;
   do{
     Card card1 = deck.deal();
     Card card2 = deck.deal();

     System.out.printf("%s : %s", card1, card2);
     pairsDealt++;

     int comparison = referree.compare(card1, card2);
     if (comparison == 0) {
       tied = true;
       System.out.println(" push");
       for (int i = 0; i < 3; i++) {
         deck.deal();
         deck.deal();
         pairsDealt++;
       }
     } else if (comparison > 0) {
       tied = false;
       tally1 += 2 * pairsDealt;
       System.out.println(" player1");
     } else {
       tied = false;
       tally2 += 2 * pairsDealt;
       System.out.println(" player2");
     }

   }while (tied);

  }

  public Deck getDeck() {
    return deck;
  }

  public void setDeck(Deck deck) {
    this.deck = deck;
  }

  public Random getRng() {
    return rng;
  }

  public void setRng(Random rng) {
    this.rng = rng;
  }

  public int getTally1() {
    return tally1;
  }

  public void setTally1(int tally1) {
    this.tally1 = tally1;
  }

  public int getTally2() {
    return tally2;
  }

  public void setTally2(int tally2) {
    this.tally2 = tally2;
  }

  public Referree getReferree() {
    return referree;
  }

  public void setReferree(Referree referree) {
    this.referree = referree;
  }

  public static void main(String[] args) {

    simpleWar war = new simpleWar(new SecureRandom());
    try {
      while(true) {
        war.play();
      }
    } catch (Deck.DeckEmptyException e) {
      // Do nothing
    } finally {
      System.out.printf("Player 1: %d. Player 2: %d.%n",war.tally1,war.tally2);
      if(war.tally1>war.tally2) {

        System.out.println("player 1 wins");
      }else if (war.tally1 < war.tally2) {
        System.out.println("player 1 wins");
      }else {
          System.out.println("tie!");
        }

      }
    }


  private static class Referree implements Comparator<Card>{


    @Override
    public int compare(Card card1, Card card2) {

      if (card1.getRank() != Rank.ACE && card2.getRank() != Rank.ACE) {

        return card1.getRank().compareTo(card2.getRank());

      } else if( card1.getRank() != Rank.ACE) {

        return -1;
      }else if (card1.getRank() != Rank.ACE){

        return 1;

      }
      return 0;
    }
  }

}

