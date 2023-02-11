package com.example.java;
import java.util.Scanner;
public class SwitchStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:\n");
        String input = sc.nextLine();
        switch (input){
            case "Jan":
                System.out.println("The month is 1");
                break;
            case "Feb":
                System.out.println("The month is 2");
                break;
            case "Mar":
                System.out.println("The month is 3");
                break;
            default:
                System.out.println("Other cases are not included ! Type within 3 months!");
        }
    }
}
