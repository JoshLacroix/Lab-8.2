import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.aCards.add(new Card(Rank.ACE, Suit.HEARTS));
        deck.aCards.add(new Card(Rank.ACE, Suit.HEARTS));
        System.out.println(deck.aCards.get(0));

        System.out.println(deck.isEmpty());
        System.out.println(deck.draw());

        //        Card myCard = new Card();
        //        myCard.aSuit = Suit.HEARTS;
        //        myCard.aRank = Rank.QUEEN;

        //        System.out.println(myCard);
    }

    public static List<Card> drawCards(CardSource pDeck, int pNumber){
        List<Card> result = new ArrayList<Card>();

        for (int i = 0; i < pNumber && !pDeck.isEmpty(); i++){
            result.add(pDeck.draw());
        }
        return result;
    }
}