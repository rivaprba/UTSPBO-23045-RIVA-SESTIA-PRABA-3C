/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23045_riva.sestia.praba_utspbo;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */

public class Customer extends User {
    private HotelRoom room1, room2, room3;
    private Reservation reservation;

    public Customer(String username, HotelRoom room1, HotelRoom room2, HotelRoom room3) {
        super(username);
        this.room1 = room1;
        this.room2 = room2;
        this.room3 = room3;
    }

    @Override
    public void menu() {
        System.out.println("Customer Menu :");
        System.out.println("1. Cek Ketersediaan Kamar");
        System.out.println("2. Pesan Kamar");
        System.out.println("3. Lihat Detail Pesanan");
        System.out.println("4. Logout");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                checkAvailability();
                break;
            case 2:
                makeReservation();
                break;
            case 3:
                viewReservation();
                break;
            case 4:
                System.out.println("Logout...");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    private void checkAvailability() {
        if (room1.getAvailability() == 1) {
            System.out.println(room1);
        }
        if (room2.getAvailability() == 1) {
            System.out.println(room2);
        }
        if (room3.getAvailability() == 1) {
            System.out.println(room3);
        }
    }

    private void makeReservation() {
        if (reservation != null) {
            System.out.println("Anda sudah memiliki pesanan.");
            return;
        }
    }
}
