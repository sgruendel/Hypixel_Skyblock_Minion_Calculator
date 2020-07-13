public class MinionCalculator {
    private final static int GENERATING_CYCLE = 2;
    private final static int ONE_HOUR_IN_SECS = 60 * 60;
    private final static int ONE_DAY_IN_SECS = 24 * ONE_HOUR_IN_SECS;

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
        itemsPerHour = ONE_HOUR_IN_SECS / timeForItem * minionsWorking;
        profitPerHour = itemsPerHour * pricePerItem;

        return profitPerHour;
    }

    public double calculateProfitPerDay() {
        double profitPerDay;
        double itemsPerDay;
        double timeForItem;

        timeForItem = timeBetweenActions * GENERATING_CYCLE;
        itemsPerDay = ONE_DAY_IN_SECS / timeForItem * minionsWorking;
        profitPerDay = itemsPerDay * pricePerItem;

        return profitPerDay;
    }
}
