/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23045_riva.sestia.praba_utspbo;

/**
 *
 * @author ASUS
 */
public class Reservation {
    private HotelRoom room;
    private String customerName;

    public Reservation(HotelRoom room, String customerName) {
        this.room = room;
        this.customerName = customerName;
        room.setAvailability(0); // Tandai kamar tidak tersedia
    }

    public HotelRoom getRoom() {
        return room;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String toString() {
        return "Customer : " + customerName + ", Room Number : " + room.getRoomNumber();
    }
}
