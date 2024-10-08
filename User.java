/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23045_riva.sestia.praba_utspbo;

/**
 *
 * @author ASUS
 */
public abstract class User {
    protected String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public abstract void menu();
}
