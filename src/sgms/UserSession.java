/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgms;

/**
 *
 * @author VICTUS
 */
public class UserSession {
    private static UserSession instance;
    private String role;        // Store the role of the logged-in user
    private String username;    // Store the username of the logged-in user
    private String sportType;   // Store the sport type of the logged-in player

    // Private constructor to prevent instantiation
    private UserSession() {
    }

    // Singleton method to get the instance of UserSession
    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    // Method to get the user's role
    public String getRole() {
        return role;
    }

    // Method to set the user's role
    public void setRole(String role) {
        this.role = role;
    }

    // Method to get the username
    public String getUsername() {
        return username;
    }

    // Method to set the username
    public void setUsername(String username) {
        this.username = username;
    }

    // Method to get the player's sport type
    public String getSportType() {
        return sportType;
    }

    // Method to set the player's sport type
    public void setSportType(String sportType) {
        this.sportType = sportType;
    }
}
