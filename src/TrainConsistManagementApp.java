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

    public String getType() {
        return type;
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

    // ✅ UC9 Method: Group bogies by type
    public static Map<String, List<Bogie>> groupBogiesByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));
    }

    public static void main(String[] args) {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 60),
                new Bogie("Sleeper", 75),
                new Bogie("First Class", 100),
                new Bogie("AC Chair", 65)
        );

        Map<String, List<Bogie>> grouped = groupBogiesByType(bogies);

        System.out.println("Grouped Bogies:");
        grouped.forEach((type, list) -> {
            System.out.println(type + " -> " + list);
        });
    }
}