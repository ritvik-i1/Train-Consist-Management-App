// TrainConsistManagementApp.java

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment (handled safely)
        b2.assignCargo("Petroleum");

        // Program continues
        System.out.println("Program continues after handling exception...");
    }
}

// ✅ Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// ✅ Goods Bogie Class
class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public String getCargo() {
        return cargo;
    }

    public void assignCargo(String cargo) {

        try {
            // ❌ Unsafe condition
            if (cargo.equalsIgnoreCase("Petroleum") &&
                    type.equalsIgnoreCase("Rectangular")) {

                throw new CargoSafetyException(
                        "Unsafe: Cannot load Petroleum in Rectangular bogie");
            }

            // ✅ Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo '" + cargo + "' assigned to " + type + " bogie");

        } catch (CargoSafetyException e) {
            // ✅ Exception handled
            System.out.println("Error: " + e.getMessage());

        } finally {
            // ✅ Always executes
            System.out.println("Cargo assignment attempt completed for " + type + " bogie");
        }
    }
}