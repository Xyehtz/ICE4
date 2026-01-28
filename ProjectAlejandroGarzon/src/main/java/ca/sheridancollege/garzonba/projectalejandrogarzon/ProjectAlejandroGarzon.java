/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ca.sheridancollege.garzonba.projectalejandrogarzon;

import java.util.Scanner;

/**
 *
 * @author aleji
 */
public class ProjectAlejandroGarzon {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the simple calculator app, please check the options below");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Substraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        
        Integer userSelection = scanner.nextInt();
        
        System.out.println("Enter the first number");
        Double firstNumber = scanner.nextDouble();
        
        System.out.println("Enter the second number");
        Double secondNumber = scanner.nextDouble();
        
        switch (userSelection) {
            case 1:
                addition(firstNumber, secondNumber);
                break;
            case 2:
                substraction(firstNumber, secondNumber);
                
            default:
                System.out.println("ERROR");
        }
    }
        
        
    public static Double addition(Double num1, Double num2) {
        return num1 + num2;
    }
    
    public static Double substraction(Double num1, Double num2) {
        return num1 - num2;
    }
}
