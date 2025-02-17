import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    System.out.print("What is your first name?: ");
    fname = keyboard.nextLine();

    System.out.print("What is your last name?: ");
    lname = keyboard.nextLine();

    System.out.print("What is your Favorite animal?: ");
    favoriteAnimal = keyboard.nextLine();

    System.out.print("What is your favorite food?: ");
    favoriteFood = keyboard.nextLine();

    System.out.print("What is your favorite song?: ");
    favoriteSong = keyboard.nextLine();

    System.out.println("My name is " + fname + " " + lname);
    System.out.println("My favorite animal is " + favoriteAnimal);
    System.out.println("My favorite food is " + favoriteFood);
    System.out.println("My Favorite song is " + favoriteSong);

    keyboard.close();
  }
}
