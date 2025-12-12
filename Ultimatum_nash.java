public class Ultimatum_nash implements Ultimatum {

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
        // only accept if 200
        return proposal == 0;
    }
}
