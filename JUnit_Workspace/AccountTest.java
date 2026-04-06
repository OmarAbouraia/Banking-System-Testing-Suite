import static org.junit.Assert.*;
import org.junit.Test;

public class AccountTest {

    // ===== White-Box Tests =====

    @Test
    public void testDepositClosed() {
        Account acc = new Account(100, "Closed");
        assertFalse(acc.deposit(50));
    }

    @Test
    public void testDepositZero() {
        Account acc = new Account(100, "Verified");
        assertFalse(acc.deposit(0));
    }

    @Test
    public void testDepositNegative() {
        Account acc = new Account(100, "Verified");
        assertFalse(acc.deposit(-10));
    }

    @Test
    public void testDepositValid() {
        Account acc = new Account(100, "Verified");
        assertTrue(acc.deposit(50));
        assertEquals(150, acc.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawSuspended() {
        Account acc = new Account(100, "Suspended");
        assertFalse(acc.withdraw(50));
    }

    @Test
    public void testWithdrawClosed() {
        Account acc = new Account(100, "Closed");
        assertFalse(acc.withdraw(50));
    }

    @Test
    public void testWithdrawOverdraft() {
        Account acc = new Account(100, "Verified");
        assertFalse(acc.withdraw(200));
    }

    @Test
    public void testWithdrawValid() {
        Account acc = new Account(200, "Verified");
        assertTrue(acc.withdraw(100));
        assertEquals(100, acc.getBalance(), 0.01);
    }

    @Test
    public void testCreditScoreEligibility() {
        CreditScoreService service = new CreditScoreService();

        assertFalse(service.isEligible(400)); // should be false
        assertFalse(service.isEligible(599)); // below threshold

        assertTrue(service.isEligible(600));  // boundary
        assertTrue(service.isEligible(700));  // above threshold
    }
}