// Modified for COS360 research by Angela Cai

public class Ultimatum_copier implements Ultimatum {

    private int pastReceived;
    private boolean pastAccepted;
    private int pastProposal;

    public void setup(
            int opponentSawAliceSaid,
            boolean opponentAsBobAccepted,
            int opponentAsAliceSaid,
            boolean f,
            int g,
            int h) {
        pastReceived = opponentSawAliceSaid;
        pastAccepted = opponentAsBobAccepted;
        pastProposal = opponentAsAliceSaid;
    }

    // Alice strategy
    public int propose() {
        // first round: propose 0
        if (pastProposal == -1) {
            return 0;
        }

        // otherwise, propose what opponent proposed
        return pastProposal;
    }

    public boolean accept(int proposal) {
        // only accept if less than or equal to past opponent's accept
        if (!pastAccepted) {
            return proposal == 0;
        }
        return proposal <= pastReceived;
    }
}
