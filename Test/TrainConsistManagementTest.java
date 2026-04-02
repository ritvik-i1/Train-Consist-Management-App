import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementTest {

    private List<Bogie> createBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 60),
                new Bogie("First Class", 100),
                new Bogie("General", 50)
        );
    }

    // 1️⃣ Total calculation
    @Test
    void testReduce_TotalSeatCalculation() {
        int result =
                TrainConsistManagementApp.calculateTotalSeats(createBogies());

        assertEquals(290, result);
    }

    // 2️⃣ Multiple bogies
    @Test
    void testReduce_MultipleBogiesAggregation() {
        int result =
                TrainConsistManagementApp.calculateTotalSeats(createBogies());

        assertTrue(result > 0);
    }

    // 3️⃣ Single bogie
    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80)
        );

        int result =
                TrainConsistManagementApp.calculateTotalSeats(bogies);

        assertEquals(80, result);
    }

    // 4️⃣ Empty list
    @Test
    void testReduce_EmptyBogieList() {
        int result =
                TrainConsistManagementApp.calculateTotalSeats(new ArrayList<>());

        assertEquals(0, result);
    }

    // 5️⃣ Correct capacity extraction
    @Test
    void testReduce_CorrectCapacityExtraction() {
        List<Bogie> bogies = createBogies();

        int result =
                TrainConsistManagementApp.calculateTotalSeats(bogies);

        assertEquals(80 + 60 + 100 + 50, result);
    }

    // 6️⃣ All bogies included
    @Test
    void testReduce_AllBogiesIncluded() {
        int result =
                TrainConsistManagementApp.calculateTotalSeats(createBogies());

        assertEquals(290, result);
    }

    // 7️⃣ Original list unchanged
    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> bogies = createBogies();
        int originalSize = bogies.size();

        TrainConsistManagementApp.calculateTotalSeats(bogies);

        assertEquals(originalSize, bogies.size());
    }
}