// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class CalorieCounting {
   public CalorieCounting() {
   }
   
   public static void main(String[] var0) {
      Scanner scan = new Scanner(System.in);
      int totalCalories = 0;
      System.out.println("Welcome to Chip's Fast Food Emporium");
      System.out.println("Please enter a burger choice:");
      int burgerChoice = scan.nextInt();
      System.out.println("Please enter a side order choice:");
      int sideChoice = scan.nextInt();
      System.out.println("Please enter a drink choice:");
      int drinkChoice = scan.nextInt();
      System.out.println("Please enter a dessert choice:");
      int dessertChoice = scan.nextInt();
      if (burgerChoice == 1) {
         totalCalories += 461;
      } else if (burgerChoice == 2) {
         totalCalories += 431;
      } else if (burgerChoice == 3) {
         totalCalories += 420;
      } else if (burgerChoice == 4) {
         totalCalories += 0;
      } else {
         System.out.println("Sorry, that is not a menu item.");
      }

      if (sideChoice == 1) {
         totalCalories += 100;
      } else if (sideChoice == 2) {
         totalCalories += 57;
      } else if (sideChoice == 3) {
         totalCalories += 70;
      } else if (sideChoice == 4) {
         totalCalories += 0;
      } else {
         System.out.println("Sorry, that is not a menu item.");
      }

      if (drinkChoice == 1) {
         totalCalories += 130;
      } else if (drinkChoice == 2) {
         totalCalories += 160;
      } else if (drinkChoice == 3) {
         totalCalories += 118;
      } else if (drinkChoice == 4) {
         totalCalories += 0;
      } else {
         System.out.println("Sorry, that is not a menu item.");
      }

      if (dessertChoice == 1) {
         totalCalories += 167;
      } else if (dessertChoice == 2) {
         totalCalories += 266;
      } else if (dessertChoice == 3) {
         totalCalories += 75;
      } else if (dessertChoice == 4) {
         totalCalories += 0;
      } else {
         System.out.println("Sorry, that is not a menu item.");
      }

      System.out.println("Your total Calorie count is: " + totalCalories + " calories.");
   }
}
