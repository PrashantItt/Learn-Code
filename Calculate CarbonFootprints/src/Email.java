public class Email {
    private String email;
    private EmailCounts emailCounts;
    private CarbonCalculator carbonCalculator;

    public Email(String email, int inboxCount, int spamCount, int sentCount) {
        this.email = email;
        this.emailCounts = new EmailCounts(inboxCount, spamCount, sentCount);
        this.carbonCalculator = new CarbonCalculator();
    }

    public void calculateTotalCarbonFootprints() {
        double inboxCarbonCalculation = carbonCalculator.calculateInboxCarbon(emailCounts.getInboxCount());
        double spamCarbonCalculation = carbonCalculator.calculateSpamCarbon(emailCounts.getSpamCount());
        double sentCarbonCalculation = carbonCalculator.calculateSentCarbon(emailCounts.getSentCount());

        emailCounts.setInboxCarbonCalculation(inboxCarbonCalculation);
        emailCounts.setSpamCarbonCalculation(spamCarbonCalculation);
        emailCounts.setSentCarbonCalculation(sentCarbonCalculation);
    }

    public void displayTotalCarbonFootprints() {
        System.out.println("Email: " + email);
        System.out.println("Total Carbon Footprint:");
        System.out.println("Inbox Carbon Footprint: " + emailCounts.getInboxCarbonCalculation() + " grams");
        System.out.println("Spam Carbon Footprint: " + emailCounts.getSpamCarbonCalculation() + " grams");
        System.out.println("Sent Carbon Footprint: " + emailCounts.getSentCarbonCalculation() + " grams");
    }
}