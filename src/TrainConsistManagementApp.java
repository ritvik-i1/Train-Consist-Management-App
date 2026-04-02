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

    // ✅ UC10 Method: Total seat calculation
    public static int calculateTotalSeats(List<Bogie> bogies) {
        return bogies.stream()
                .map(Bogie::getCapacity)      // extract capacity
                .reduce(0, Integer::sum);     // sum all values
    }

    public static void main(String[] args) {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 60),
                new Bogie("First Class", 100),
                new Bogie("General", 50)
        );

        int totalSeats = calculateTotalSeats(bogies);

        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}