package Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int choice, starter, mainCourse, deserts, drinks;
        char ans;
        double totalPrice = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Our Restaurant :)");

        do {
            System.out.println("1: Starters\n2: Main Course\n3: Desserts\n4: Drinks");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Starters");
                    totalPrice += handleFoodChoice("1: Spring Roll (₹50)\n2: French Fries (₹40)\n3: Paneer Tikka (₹100)\n4: Popcorn Chicken (₹120)", sc);
                    break;

                case 2:
                    System.out.println("Main Courses");
                    totalPrice += handleFoodChoice("1: Biryani (₹150)\n2: Chicken Curry (₹180)\n3: Shahi Paneer (₹200)\n4: Chole Bhature (₹120)", sc);
                    break;

                case 3:
                    System.out.println("Desserts");
                    totalPrice += handleFoodChoice("1: Gulab Jamun (₹50)\n2: Rasgulla (₹40)\n3: Barfi (₹60)\n4: Halwa (₹70)", sc);
                    break;

                case 4:
                    System.out.println("Drinks");
                    totalPrice += handleFoodChoice("1: Kokum Juice (₹30)\n2: Chaas (₹20)\n3: Lassi (₹50)\n4: Cold Drink (₹40)", sc);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }

            System.out.println("Do you want to add any other item? (Y/N)");
            ans = sc.next().charAt(0);

        } while (ans == 'Y' || ans == 'y');

        System.out.println("Thank you for visiting! Your total bill is: ₹" + totalPrice);
    }

    // Method to handle food selection and return the price
    private static double handleFoodChoice(String menu, Scanner sc) {
        int choice = 0;
        double price = 0;

        System.out.println(menu);
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Item selected: ₹" + getPrice(choice));
                price = getPrice(choice);
                break;
            case 2:
                System.out.println("Item selected: ₹" + getPrice(choice));
                price = getPrice(choice);
                break;
            case 3:
                System.out.println("Item selected: ₹" + getPrice(choice));
                price = getPrice(choice);
                break;
            case 4:
                System.out.println("Item selected: ₹" + getPrice(choice));
                price = getPrice(choice);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        return price;
    }

    // Method to return the price based on the item selected
    private static double getPrice(int choice) {
        switch (choice) {
            case 1:
                return 50;
            case 2:
                return 40;
            case 3:
                return 100;
            case 4:
                return 120;
            default:
                return 0;
        }
    }
}
