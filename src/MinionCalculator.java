public class MinionCalculator {
    private final static int GENERATING_CYCLE = 2;

    private double timeBetweenActions;
    private int minionsWorking;
    private double pricePerItem;

    public double getTimeBetweenActions() {
        return timeBetweenActions;
    }

    public void setTimeBetweenActions(double timeBetweenActions) {
        this.timeBetweenActions = timeBetweenActions;
    }

    public int getMinionsWorking() {
        return minionsWorking;
    }

    public void setMinionsWorking(int minionsWorking) {
        this.minionsWorking = minionsWorking;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double calculateProfitPerHour() {
        double profitPerHour;
        double itemsPerHour;
        double timeForItem;

        timeForItem = timeBetweenActions * GENERATING_CYCLE;
        itemsPerHour = 3600 / timeForItem * minionsWorking;
        profitPerHour = itemsPerHour * pricePerItem;

        return profitPerHour;
    }
    public double calculateProfitPerDay() {
        double profitPerDay;
        double itemsPerDay;
        double timeForItem;

        timeForItem = timeBetweenActions * GENERATING_CYCLE;
        itemsPerDay = 86400 / timeForItem * minionsWorking;
        profitPerDay = itemsPerDay * pricePerItem;

        return profitPerDay;
    }
}
