import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // UC19: Binary Search for Bogie ID
        String[] bogieIds = {"BG309","BG101","BG550","BG205","BG412"};

        String searchKey = "BG205";

        boolean found = binarySearchBogie(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }
    }

    // ✅ Binary Search Method
    public static boolean binarySearchBogie(String[] arr, String key) {

        // Step 1: Handle empty array
        if (arr.length == 0) return false;

        // Step 2: Sort array (important precondition)
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = key.compareTo(arr[mid]);

            if (cmp == 0) {
                return true; // found
            } else if (cmp < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1; // search right
            }
        }

        return false; // not found
    }
}