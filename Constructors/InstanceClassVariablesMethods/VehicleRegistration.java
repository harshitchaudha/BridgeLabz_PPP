package Constructors.InstanceClassVariablesMethods;
public class VehicleRegistration {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000.0;

    public VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Fee: " + registrationFee);
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    public static void main(String[] args) {
        VehicleRegistration v1 = new VehicleRegistration("Pranav", "Car");
        v1.displayVehicleDetails();
        VehicleRegistration.updateRegistrationFee(7000.0);
        VehicleRegistration v2 = new VehicleRegistration("Asha", "Bike");
        v2.displayVehicleDetails();
    }
}
