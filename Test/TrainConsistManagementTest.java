import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementTest {

    @Test
    void testException_ValidCapacityCreation() throws InvalidCapacityException {
        PassengerBogie bogie = new PassengerBogie("Sleeper", 80);
        assertNotNull(bogie);
    }

    @Test
    void testException_NegativeCapacityThrowsException() {
        assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("Sleeper", -10);
        });
    }

    @Test
    void testException_ZeroCapacityThrowsException() {
        assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("Sleeper", 0);
        });
    }

    @Test
    void testException_ExceptionMessageValidation() {
        Exception ex = assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("Sleeper", -5);
        });

        assertEquals("Capacity must be greater than zero", ex.getMessage());
    }

    @Test
    void testException_ObjectIntegrityAfterCreation() throws InvalidCapacityException {
        PassengerBogie bogie = new PassengerBogie("AC Chair", 60);

        assertEquals("AC Chair", bogie.getType());
        assertEquals(60, bogie.getCapacity());
    }

    @Test
    void testException_MultipleValidBogiesCreation() throws InvalidCapacityException {
        PassengerBogie b1 = new PassengerBogie("Sleeper", 80);
        PassengerBogie b2 = new PassengerBogie("First Class", 100);

        assertNotNull(b1);
        assertNotNull(b2);
    }
}