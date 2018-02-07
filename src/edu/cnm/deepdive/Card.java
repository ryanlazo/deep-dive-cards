package edu.cnm.deepdive;

public class Card implements Comparable<Card>{

  private Rank rank;
  private Suit suit;

  public Card(Rank rank, Suit suit){
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
    return String.format("%2s%s", rank, suit);
  }


  @Override
  public int compareTo(Card otherCard) {
  int suitCompare = suit.compareTo(otherCard.suit);
  if (suitCompare == 0) {
    return rank.compareTo(otherCard.rank);
    }else {
    return suitCompare;
  }

  }
}
