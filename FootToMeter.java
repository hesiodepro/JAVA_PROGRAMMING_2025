/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.java_chapter1_and_2_codes;

import java.util.Scanner;

public class FootToMeter {
     public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number in feet: ");
        double feet = input.nextDouble();
        
        double meter = feet * 0.305;
        
        System.out.println(feet +  " Ft " + " is " + meter + " in meters ");
     }
}
