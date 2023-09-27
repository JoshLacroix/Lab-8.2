public interface CardSource {
    /**
     * returns a card from the source
     * @return The next available card
     * @pre !isEmpty()
     */
    Card draw();

    /**
     *
     * @return true if no card is in the source
     */
    boolean isEmpty();
}
