import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementTest {

    // 1️⃣ Valid Train ID
    @Test
    void testRegex_ValidTrainID() {
        assertTrue(ValidationUtil.isValidTrainId("TRN-1234"));
    }

    // 2️⃣ Invalid Train ID formats
    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(ValidationUtil.isValidTrainId("TRAIN12"));
        assertFalse(ValidationUtil.isValidTrainId("TRN12A"));
        assertFalse(ValidationUtil.isValidTrainId("1234-TRN"));
    }

    // 3️⃣ Valid Cargo Code
    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(ValidationUtil.isValidCargoCode("PET-AB"));
    }

    // 4️⃣ Invalid Cargo Code
    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(ValidationUtil.isValidCargoCode("PET-ab"));
        assertFalse(ValidationUtil.isValidCargoCode("PET123"));
        assertFalse(ValidationUtil.isValidCargoCode("AB-PET"));
    }

    // 5️⃣ Train ID digit length
    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(ValidationUtil.isValidTrainId("TRN-123"));
        assertFalse(ValidationUtil.isValidTrainId("TRN-12345"));
    }

    // 6️⃣ Cargo uppercase validation
    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(ValidationUtil.isValidCargoCode("PET-Ab"));
    }

    // 7️⃣ Empty input
    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(ValidationUtil.isValidTrainId(""));
        assertFalse(ValidationUtil.isValidCargoCode(""));
    }

    // 8️⃣ Exact match validation
    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(ValidationUtil.isValidTrainId("TRN-1234XYZ"));
        assertFalse(ValidationUtil.isValidCargoCode("PET-ABCD"));
    }
}