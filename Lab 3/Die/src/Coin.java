public class Coin {
    private String aSideUp;

    public Coin() {
        this.aSideUp = "Heads";
    }

    public void toss() {
        if (Math.random() < 0.5) {
            aSideUp = "Heads";
        } else {
            aSideUp = "Tails";
        }
    }

    public String getSideUp() {
        return aSideUp;
    }
}
