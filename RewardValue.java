public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    
    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public int getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        // Example usage:
        RewardValue reward1 = new RewardValue(100.0); // Create RewardValue with $100 cash
        System.out.println("Cash Value: $" + reward1.getCashValue());
        System.out.println("Miles Value: " + reward1.getMilesValue() + " miles");

        RewardValue reward2 = new RewardValue(500); // Create RewardValue with 500 miles
        System.out.println("Cash Value: $" + reward2.getCashValue());
        System.out.println("Miles Value: " + reward2.getMilesValue() + " miles");
    }
}
