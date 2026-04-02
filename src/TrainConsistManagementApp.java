import java.util.regex.*;

// Utility class for validation
class ValidationUtil {

    // Train ID validation → TRN-1234
    public static boolean isValidTrainId(String trainId) {
        String regex = "TRN-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    // Cargo Code validation → PET-AB
    public static boolean isValidCargoCode(String cargoCode) {
        String regex = "PET-[A-Z]{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }
}

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        boolean trainValid = ValidationUtil.isValidTrainId(trainId);
        boolean cargoValid = ValidationUtil.isValidCargoCode(cargoCode);

        System.out.println("Train ID: " + trainId + " → " + (trainValid ? "Valid" : "Invalid"));
        System.out.println("Cargo Code: " + cargoCode + " → " + (cargoValid ? "Valid" : "Invalid"));
    }
}