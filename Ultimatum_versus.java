// Modified for COS360 research by Angela Cai

public class Ultimatum_versus implements Ultimatum {

    public void setup(
            int opponentSawAliceSaid,
            boolean opponentAsBobAccepted,
            int opponentAsAliceSaid,
            boolean f,
            int g,
            int h) {
    }

    // Alice strategy
    public int propose() {
        // always propose 99
        return 99;
    }

    public boolean accept(int proposal) {
        // only accept if payoff is higher than opponent
        // (remember that my payoff is 200-2x)
        return proposal < 67;
    }
}

