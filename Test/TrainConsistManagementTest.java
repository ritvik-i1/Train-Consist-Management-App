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

    // 1️⃣ Greater than threshold
    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> result =
                TrainConsistManagementApp.filterBogiesByCapacity(createBogies(), 70);

        assertEquals(2, result.size());
    }

    // 2️⃣ Equal to threshold (excluded)
    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<Bogie> result =
                TrainConsistManagementApp.filterBogiesByCapacity(createBogies(), 60);

        assertFalse(result.stream().anyMatch(b -> b.getCapacity() == 60));
    }

    // 3️⃣ Less than threshold (excluded)
    @Test
    void testFilter_CapacityLessThanThreshold() {
        List<Bogie> result =
                TrainConsistManagementApp.filterBogiesByCapacity(createBogies(), 70);

        assertFalse(result.stream().anyMatch(b -> b.getCapacity() == 50));
    }

    // 4️⃣ Multiple matches
    @Test
    void testFilter_MultipleBogiesMatching() {
        List<Bogie> result =
                TrainConsistManagementApp.filterBogiesByCapacity(createBogies(), 60);

        assertEquals(2, result.size());
    }

    // 5️⃣ No matches
    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> result =
                TrainConsistManagementApp.filterBogiesByCapacity(createBogies(), 200);

        assertTrue(result.isEmpty());
    }

    // 6️⃣ All match
    @Test
    void testFilter_AllBogiesMatching() {
        List<Bogie> bogies = createBogies();

        List<Bogie> result =
                TrainConsistManagementApp.filterBogiesByCapacity(bogies, 40);

        assertEquals(bogies.size(), result.size());
    }

    // 7️⃣ Empty list
    @Test
    void testFilter_EmptyBogieList() {
        List<Bogie> result =
                TrainConsistManagementApp.filterBogiesByCapacity(new ArrayList<>(), 60);

        assertTrue(result.isEmpty());
    }

    // 8️⃣ Original list unchanged
    @Test
    void testFilter_OriginalListUnchanged() {
        List<Bogie> bogies = createBogies();
        int originalSize = bogies.size();

        TrainConsistManagementApp.filterBogiesByCapacity(bogies, 60);

        assertEquals(originalSize, bogies.size());
    }
}