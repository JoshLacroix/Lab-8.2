public class Card {
    private final Rank aRank;
    private final Suit aSuit;

    public Card (Rank pRank, Suit pSuit){
        this.aRank = pRank;
        this.aSuit = pSuit;
    }

    public Rank getRank(){
        return aRank;
    }
    public Suit getSuit(){
        return aSuit;
    }

    @Override
    public String toString(){
        return aRank + " of " + aSuit;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Card)) {
            return false;
        }
        Card otherCard = (Card) obj;
        return this.aSuit == otherCard.getSuit() && this.aRank == otherCard.getRank();
//        if (this.aSuit == otherCard.getSuit() && this.aRank == otherCard.getRank()){
//            return true;
//        }
//        else return false;
    }
}
