import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementTest {

    private List<Bogie> createBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 60),
                new Bogie("Sleeper", 75),
                new Bogie("First Class", 100),
                new Bogie("AC Chair", 65)
        );
    }

    // 1️⃣ Grouping basic
    @Test
    void testGrouping_BogiesGroupedByType() {
        Map<String, List<Bogie>> result =
                TrainConsistManagementApp.groupBogiesByType(createBogies());

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
    }

    // 2️⃣ Multiple in same group
    @Test
    void testGrouping_MultipleBogiesInSameGroup() {
        Map<String, List<Bogie>> result =
                TrainConsistManagementApp.groupBogiesByType(createBogies());

        assertEquals(2, result.get("Sleeper").size());
    }

    // 3️⃣ Different types → different groups
    @Test
    void testGrouping_DifferentBogieTypes() {
        Map<String, List<Bogie>> result =
                TrainConsistManagementApp.groupBogiesByType(createBogies());

        assertEquals(3, result.keySet().size());
    }

    // 4️⃣ Empty list
    @Test
    void testGrouping_EmptyBogieList() {
        Map<String, List<Bogie>> result =
                TrainConsistManagementApp.groupBogiesByType(new ArrayList<>());

        assertTrue(result.isEmpty());
    }

    // 5️⃣ Single category
    @Test
    void testGrouping_SingleBogieCategory() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("Sleeper", 90)
        );

        Map<String, List<Bogie>> result =
                TrainConsistManagementApp.groupBogiesByType(bogies);

        assertEquals(1, result.size());
    }

    // 6️⃣ Check keys
    @Test
    void testGrouping_MapContainsCorrectKeys() {
        Map<String, List<Bogie>> result =
                TrainConsistManagementApp.groupBogiesByType(createBogies());

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
        assertTrue(result.containsKey("First Class"));
    }

    // 7️⃣ Group size validation
    @Test
    void testGrouping_GroupSizeValidation() {
        Map<String, List<Bogie>> result =
                TrainConsistManagementApp.groupBogiesByType(createBogies());

        assertEquals(2, result.get("AC Chair").size());
    }

    // 8️⃣ Original list unchanged
    @Test
    void testGrouping_OriginalListUnchanged() {
        List<Bogie> bogies = createBogies();
        int originalSize = bogies.size();

        TrainConsistManagementApp.groupBogiesByType(bogies);

        assertEquals(originalSize, bogies.size());
    }
}