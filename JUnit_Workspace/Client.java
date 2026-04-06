public class Client {

    private int creditScore;

    public Client(int creditScore) {
        this.creditScore = creditScore;
    }

    public boolean isEligibleForLoan() {
        return creditScore >= 600;
    }
}
