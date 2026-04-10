public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // UC20: Search with validation
        String[] bogieIds = {"BG101","BG205","BG309"};

        String searchKey = "BG205";

        try {
            boolean found = searchBogie(bogieIds, searchKey);

            if (found) {
                System.out.println("Bogie ID " + searchKey + " found.");
            } else {
                System.out.println("Bogie ID " + searchKey + " not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // ✅ Search with fail-fast validation
    public static boolean searchBogie(String[] arr, String key) {

        // 🔴 Fail-fast check
        if (arr.length == 0) {
            throw new IllegalStateException("No bogies available to search.");
        }

        // Linear search (can also reuse UC18/UC19 logic)
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(key)) {
                return true;
            }
        }

        return false;
    }
}