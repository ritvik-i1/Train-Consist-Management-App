import java.util.*;
import java.util.stream.Collectors;

// Bogie Class
class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " - Capacity: " + capacity;
    }
}

// Main Class
public class TrainConsistManagementApp {

    // UC8: Filter using Stream API
    public static List<Bogie> filterBogiesByCapacity(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)   // ✅ core logic
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        // Step 1: Create bogie list (reuse UC7)
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 60),
                new Bogie("First Class", 100),
                new Bogie("General", 50)
        );

        // Step 2: Apply filter
        int threshold = 60;
        List<Bogie> filtered = filterBogiesByCapacity(bogies, threshold);

        // Step 3: Display result
        System.out.println("Filtered Bogies (Capacity > " + threshold + "):");
        filtered.forEach(System.out::println);
    }
}