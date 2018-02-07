package edu.cnm.deepdive;

public class DeckTest {

  public static void main (String[] args) {
    Deck deck = new Deck();
    deck.shuffle();
    for (Card card : deck.getCards()) {
      System.out.println(card);
    }
    System.out.println("---Sorted---");
    deck.sort();
    for (Card card : deck.getCards()) {
      System.out.println(card);
    }
  }
}
