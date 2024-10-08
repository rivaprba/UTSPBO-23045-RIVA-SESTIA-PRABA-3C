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
public class MainHotel {
    public static void main(String[] args) {
        // Membuat kamar hotel
        HotelRoom room1 = new HotelRoom(101);
        HotelRoom room2 = new HotelRoom(102);
        HotelRoom room3 = new HotelRoom(103);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Login sebagai:");
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Masukkan username admin: ");
                String username = scanner.next();
                Admin admin = new Admin(username, room1, room2, room3);
                admin.menu();
            } else if (choice == 2) {
                System.out.print("Masukkan username customer: ");
                String username = scanner.next();
                Customer customer = new Customer(username, room1, room2, room3);
                customer.menu();
            } else if (choice == 3) {
                System.out.println("Keluar...");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

