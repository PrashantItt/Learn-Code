class EmailCounts {
    private int inboxCount;
    private int spamCount;
    private int sentCount;
    private double inboxCarbonCalculation;
    private double spamCarbonCalculation;
    private double sentCarbonCalculation;

    public EmailCounts(int inboxCount, int spamCount, int sentCount) {
        this.inboxCount = inboxCount;
        this.spamCount = spamCount;
        this.sentCount = sentCount;
    }

    public int getInboxCount() {
        return inboxCount;
    }

    public int getSpamCount() {
        return spamCount;
    }

    public int getSentCount() {
        return sentCount;
    }

    public double getInboxCarbonCalculation() {
        return inboxCarbonCalculation;
    }

    public void setInboxCarbonCalculation(double inboxCarbonCalculation) {
        this.inboxCarbonCalculation = inboxCarbonCalculation;
    }

    public double getSpamCarbonCalculation() {
        return spamCarbonCalculation;
    }

    public void setSpamCarbonCalculation(double spamCarbonCalculation) {
        this.spamCarbonCalculation = spamCarbonCalculation;
    }

    public double getSentCarbonCalculation() {
        return sentCarbonCalculation;
    }

    public void setSentCarbonCalculation(double sentCarbonCalculation) {
        this.sentCarbonCalculation = sentCarbonCalculation;
    }
}
