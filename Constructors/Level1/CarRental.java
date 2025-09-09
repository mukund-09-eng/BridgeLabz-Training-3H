package Bridgelabz.oops.Constructors;

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateCost();
    }

    private double calculateCost() {
        int rate = 1000;
        return rentalDays * rate;
    }

    public void displayDetails() {
        System.out.println(customerName + " rented " + carModel + " for " + rentalDays + " days. Total: ₹" + totalCost);
    }

    public static void main(String[] args) {
        CarRental cr1 = new CarRental("Mukund", "Hyundai i20", 5);
        CarRental cr2 = new CarRental("Tarun", "Honda City", 3);
        cr1.displayDetails();
        cr2.displayDetails();
    }
}

