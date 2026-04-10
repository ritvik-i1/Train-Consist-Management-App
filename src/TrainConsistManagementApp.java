import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // UC17: Sort Bogie Names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting:");
        display(bogieNames);

        sortBogieNames(bogieNames);

        System.out.println("After Sorting:");
        display(bogieNames);
    }

    // ✅ Use Case Method
    public static void sortBogieNames(String[] arr) {
        Arrays.sort(arr);
    }

    // ✅ Display Method
    public static void display(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}