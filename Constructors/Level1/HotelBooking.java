package Bridgelabz.oops.Constructors;

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this("Rohit", "Standard", 5);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayBooking() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking hb1 = new HotelBooking();
        HotelBooking hb2 = new HotelBooking("Amit", "Deluxe", 3);
        hb1.displayBooking();
        hb2.displayBooking();

    }
}

