public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // UC18: Linear Search for Bogie ID
        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        String searchKey = "BG309";

        boolean found = searchBogie(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }
    }

    // ✅ Linear Search Method
    public static boolean searchBogie(String[] arr, String key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(key)) {
                return true; // stop immediately when found
            }
        }

        return false; // not found
    }
}