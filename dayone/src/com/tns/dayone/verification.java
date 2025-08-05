package com.tns.dayone;
import java.util.Scanner;
import java.util.Scanner;
public class verification {

    public static void main(String []args){
    String userID ="dhammaratna";

    String password ="admin";

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter username");

    String username = sc.nextLine();

    System.out.println("Enter your Password:");

    String password1=sc.nextLine();



    if(userID .equals(username)){
        if(password .equals(password1)){
        System.out.println("Login Successfull");
        }

    }else{
        System.out.println("Invalid User id or Password");
    } 


    }



}
