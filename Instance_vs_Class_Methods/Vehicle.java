package Bridgelabz.oops.Instance_vs_Class_Methods;

class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 5000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Amit", "Car");
        Vehicle v2 = new Vehicle("Rohit", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        System.out.println("Update Registration Fee:");
        Vehicle.updateRegistrationFee(7000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

