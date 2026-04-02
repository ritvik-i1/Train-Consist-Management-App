class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 80);
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);

            System.out.println(b1.getType() + " - " + b1.getCapacity());
            System.out.println(b2.getType() + " - " + b2.getCapacity());

        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}