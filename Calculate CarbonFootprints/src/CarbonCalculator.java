class CarbonCalculator {
    private double spamEmail = 0.3;
    private double sentEmail = 50.0;
    private double inboxEmail = 4.0;

    public double calculateInboxCarbon(int inboxCount) {
        return inboxCount * inboxEmail;
    }

    public double calculateSpamCarbon(int spamCount) {
        return spamCount * spamEmail;
    }

    public double calculateSentCarbon(int sentCount) {
        return sentCount * sentEmail;
    }
}