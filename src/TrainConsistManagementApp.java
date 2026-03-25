import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 🔹 Adding bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after adding
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // 🔹 Removing a bogie
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // 🔹 Check existence
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nIs 'Sleeper' present? " + exists);

        // Final state
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);
    }
}