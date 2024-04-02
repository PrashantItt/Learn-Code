import java.util.Random;

public class CarAccidentSimulation {
    private static final Random rand = new Random();

    public static void main(String[] args) {
        try {
            driveCar();
        } catch (CarCrashException e) {
            System.out.println("Car crashed: " + e.getMessage());
            callEmergencyServices();
        } catch (CarMalfunctionException e) {
            System.out.println("Car malfunctioned: " + e.getMessage());
            repairCar();
        } catch (RecklessDrivingException e) {
            System.out.println("Reckless driving detected: " + e.getMessage());
            penalizeDriver();
        } catch (RoadConditionException e) {
            System.out.println("Poor road condition: " + e.getMessage());
            driveCarefully();
        } catch (DriverHealthIssueException e) {
            System.out.println("Driver health issue: " + e.getMessage());
            assistDriver();
        } finally {
            completeCarSimulation();
        }
    }

    public static double generateRandomNumber() {
        return rand.nextDouble() * 65.0;
    }

    public static void driveCar() throws CarCrashException, CarMalfunctionException, RecklessDrivingException, RoadConditionException, DriverHealthIssueException {
        double random = generateRandomNumber();

        if (random < 10.0) {
            throw new CarCrashException("Car crashed due to collision.");
        }

        if (random >= 10.0 && random < 30.0) {
            throw new CarMalfunctionException("Car malfunctioned.");
        }

        if (random >= 30.0 && random < 45.0) {
            throw new RecklessDrivingException("Reckless driving detected.");
        }

        if (random >= 45.0 && random < 60.0) {
            throw new RoadConditionException("Poor road condition detected.");
        }

        if (random >= 60.0 && random < 65.0) {
            throw new DriverHealthIssueException("Driver health issue detected.");
        }

        System.out.println("Car is being driven safely.");
    }

    public static void callEmergencyServices() {
        System.out.println("Emergency services called.");
    }

    public static void repairCar() {
        System.out.println("Car sent for repairs.");
    }

    public static void penalizeDriver() {
        System.out.println("Driver penalized for reckless driving.");
    }

    public static void driveCarefully() {
        System.out.println("Driver advised to drive carefully due to poor road condition.");
    }

    public static void assistDriver() {
        System.out.println("Driver provided assistance due to health issue.");
    }

    public static void logException(Exception e) {
        System.out.println("Exception logged: " + e.getMessage());
    }

    public static void completeCarSimulation() {
        System.out.println("Car simulation completed.");
    }
}

class CarCrashException extends Exception {
    public CarCrashException(String message) {
        super(message);
    }
}

class CarMalfunctionException extends Exception {
    public CarMalfunctionException(String message) {
        super(message);
    }
}

class RecklessDrivingException extends Exception {
    public RecklessDrivingException(String message) {
        super(message);
    }
}

class RoadConditionException extends Exception {
    public RoadConditionException(String message) {
        super(message);
    }
}

class DriverHealthIssueException extends Exception {
    public DriverHealthIssueException(String message) {
        super(message);
    }
}
