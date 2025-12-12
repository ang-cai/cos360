public class Ultimatum_faker implements Ultimatum {

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
        // only propose 91 to look like colluder
        return 91;
    }

    public boolean accept(int proposal) {
        // only accept if 200
        return proposal == 0;
    }
}
