public class Ultimatum_safe implements Ultimatum {

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
        // first round propose 1, or if opponent didn't accept, propose 1
        if (pastProposal == -1 || !pastAccepted) {
            return 1;
        }

        // otherwise, propose what the opponent last accepted
        else {
            return pastReceived;
        }
    }

    public boolean accept(int proposal) {
        // accept everything
        return true;
    }
}
