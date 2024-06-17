import java.util.*;

public class Hand implements Comparable<Hand>{
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card){
        hand.add(card);
    }

    public void print(){
        Iterator<Card> iterator = hand.iterator();

        while (iterator.hasNext()) {
            Card nextInLine = iterator.next();
            System.out.println(nextInLine);

        }

    }

    public void sort() {
        //sort cards in hand
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                        .thenComparing((Card::getSuit));

                Collections.sort(hand, comparator);

    }

    public void sortBySuit(){
        hand.sort(new BySuitInValueOrder());
    }
    public int total(){
        int sum = 0;
        for(Card piece : hand){
            sum += piece.getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand otherHand){
        return this.total() - otherHand.total();

    }



}
