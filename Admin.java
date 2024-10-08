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

public class Admin extends User {
    private HotelRoom room1, room2, room3;

    public Admin(String username, HotelRoom room1, HotelRoom room2, HotelRoom room3) {
        super(username);
        this.room1 = room1;
        this.room2 = room2;
        this.room3 = room3;
    }

    @Override
    public void menu() {
        System.out.println("Admin Menu :");
        System.out.println("1. Tampilkan Ketersediaan Kamar");
        System.out.println("2. Ubah Status Kamar");
        System.out.println("3. Logout");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                displayAllRooms();
                break;
            case 2:
                changeRoomStatus();
                break;
            case 3:
                System.out.println("Logout...");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    private void displayAllRooms() {
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);
    }

    private void changeRoomStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor kamar untuk diubah statusnya: ");
        int roomNumber = scanner.nextInt();
        System.out.print("Masukkan status baru (1 = tersedia, 0 = tidak tersedia): ");
        int status = scanner.nextInt();

        if(room1.getRoomNumber() == roomNumber) {
            room1.setAvailability(status);
        } else if(room2.getRoomNumber() == roomNumber) {
            room2.setAvailability(status);
        } else if(room3.getRoomNumber() != roomNumber) {
            System.out.println("Kamar tidak ditemukan.");
        } else {
            room3.setAvailability(status);
        }
    }
}
    

