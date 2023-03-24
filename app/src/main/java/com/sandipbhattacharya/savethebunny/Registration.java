package com.sandipbhattacharya.savethebunny;
import java.util.Scanner;
public class Registration{

    public String username;
    public String email;
    public int age;
    public String password;

    Scanner cin = new Scanner(System.in);

    public void setUsername(){
        System.out.println("Enter username: ");
        String username = cin.nextLine();
    }

    public void setEmail(){
        System.out.println("Enter email: ");
        String email = cin.nextLine();
    }

    public void setPassword(){
        System.out.println("Enter password: ");
        String password = cin.nextLine();
    }

    public void setAge(){
        System.out.println("Enter age: ");
        int age = cin.nextInt();
        if (age<7){
            System.out.println("You're too young to play this game.");
        }
        else{
            System.out.println("You have successfully created an account. Enjoy the game.");
        }
    }

    // store information in database

}
