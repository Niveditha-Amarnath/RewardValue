import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RewardValueTests {

    private static final double DELTA = 0.001; // Define a small delta for floating-point comparisons

    @Test
    public void testCashToMilesConversion() {
        // Create a RewardValue with $200 cash
        RewardValue reward = new RewardValue(200.0);

        // Verify that the conversion from cash to miles is accurate
        assertEquals(57142.857, reward.getMilesValue(), DELTA);
    }

    @Test
    public void testMilesToCashConversion() {
        // Create a RewardValue with 500 miles
        RewardValue reward = new RewardValue(500);

        // Verify that the conversion from miles to cash is accurate
        assertEquals(1.75, reward.getCashValue(), DELTA);
    }

    // Existing tests
    @Test
    public void testGetCashValue() {
        RewardValue reward = new RewardValue(100.0);
        assertEquals(100.0, reward.getCashValue(), DELTA);
    }

    @Test
    public void testGetMilesValue() {
        RewardValue reward = new RewardValue(500);
        assertEquals(500, reward.getMilesValue());
    }
}
