public class Ultimatum_feeder implements Ultimatum {

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
        // always propose 0
        return 0;
    }

    public boolean accept(int proposal) {
        // always accept
        return true;
    }
}
