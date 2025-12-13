// Modified for COS360 research by Angela Cai

public class Ultimatum_gambler implements Ultimatum {

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
        return 91;
    }

    public boolean accept(int proposal) {
        // accept like colluder 90% of time
        if (Math.random() < .9) {
            return proposal == 0;
        }
        // gamble 10% of time
        else {
            return true;
        }
    }
}
