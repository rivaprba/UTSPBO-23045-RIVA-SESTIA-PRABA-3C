/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23045_riva.sestia.praba_utspbo;

/**
 *
 * @author ASUS
 */

public class HotelRoom {
    private int roomNumber;
    private int availability; // 1 = tersedia, 0 = tidak tersedia

    public HotelRoom(int roomNumber) {
        this.roomNumber = roomNumber;
        this.availability = 1; // Kamar awalnya tersedia
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String toString() {
        String availableText = (availability == 1) ? "Available" : "Not Available";
        return "Room Number: " + roomNumber + ", Availability: " + availableText;
    }
}

