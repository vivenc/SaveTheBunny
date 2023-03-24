package com.sandipbhattacharya.savethebunny;
import java.util.Scanner;
public class Player {
    public String username;

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Do you have an account? (Yes/No) ");
        String ans = cin.nextLine();
        if (ans == "Yes" || ans == "yes") {
            System.out.println("Enter username: ");
            String username = cin.nextLine();
            Login login = new Login();
            login.checkUsername(username);

        } else {
            Registration registration = new Registration();
            registration.setUsername();
            registration.setEmail();
            registration.setPassword();
            registration.setAge();
        }
    }
}