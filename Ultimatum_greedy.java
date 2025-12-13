// Modified for COS360 research by Angela Cai

public class Ultimatum_greedy implements Ultimatum {

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
        // only accept 0
        return proposal == 0;
    }
}
