package com.example.java;
import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        int monthNumber=0;
        Scanner mnth=new Scanner(System.in);
        System.out.println("Enter the Month name :\n");
        monthNumber=mnth.nextInt();
        if(monthNumber>=1&&monthNumber<=3){
            System.out.println("You are in Quarter");}
        else if (monthNumber>=4&&monthNumber<=6){
            System.out.println("You are in Half");
        } else if (monthNumber>=7&&monthNumber<=9){
            System.out.println("You are in Quarter 3");
        } else if (monthNumber>=10&&monthNumber<=12){
            System.out.println("You are in Final");
        }
        else {
            System.out.println("Unknown month");
        }
    }
}
