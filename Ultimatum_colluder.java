// Modified for COS360 research by Angela Cai

public class Ultimatum_colluder implements Ultimatum {

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

        // otherwise, propose 0 if colluder and 91 otherwise
        if ((pastProposal == 0 || pastProposal == 91) &&
                ((pastReceived != 0 && !pastAccepted) || (pastReceived == 0 && pastAccepted)
                || pastReceived == -1)) {
            return 0;
        }
        else {
            return 91;
        }
    }

    public boolean accept(int proposal) {
        // only accept if 200
        return proposal == 0;
    }
}
