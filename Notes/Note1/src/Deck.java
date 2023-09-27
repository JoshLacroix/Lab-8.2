import java.util.ArrayList;
import java.util.List;

public class Deck implements CardSource{
    List<Card> aCards = new ArrayList<Card>();

    public void shuffle(){

    }
    public Card draw(){
        return new Card(Rank.ACE, Suit.CLOVER);
    }
    public boolean isEmpty(){
        return this.aCards.isEmpty();
    }
}
