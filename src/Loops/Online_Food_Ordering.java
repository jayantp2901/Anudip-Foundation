package Loops;

import java.util.Scanner;

public class Online_Food_Ordering {
    public static void main(String[] args) {
        int starter = 0, mainCourse = 0, deserts = 0, drinks = 0, totalBill = 0;  
        char ans;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Our Restaurant :)");

        do {
            System.out.println("1: Starters\n2: Main Course\n3: Deserts\n4: Drinks");
            int SelectChoice = sc.nextInt();

            switch(SelectChoice) {
                case 1:
                    System.out.println("Starters");
                    System.out.println("1: Spring Roll  (50₹)\n2: French Fries (40₹)\n3: Paneer Tikka (45₹)\n4: Popcorn Chicken (60₹)");
                    int selectStarter = sc.nextInt();

                    switch(selectStarter) {
                        case 1:
                            System.out.println("Spring Roll (50₹)");
                            starter += 50;
                            break;
                        case 2:
                            System.out.println("French Fries (40₹)");
                            starter += 40;
                            break;
                        case 3:
                            System.out.println("Paneer Tikka (45₹)");
                            starter += 45;
                            break;
                        case 4:
                            System.out.println("Popcorn Chicken (60₹)");
                            starter += 60;
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Main Courses");
                    System.out.println("1: Biryani (350₹)\n2: Chicken Curry (250₹)\n3: Shahi Paneer (320₹)\n4: Chole Bhature (150₹)");
                    int SelectMainCourse = sc.nextInt();

                    switch(SelectMainCourse) {
                        case 1:
                            System.out.println("Biryani (350₹)");
                            mainCourse += 350;
                            break;
                        case 2:
                            System.out.println("Chicken Curry (250₹)");
                            mainCourse += 250;
                            break;
                        case 3:
                            System.out.println("Shahi Paneer (320₹)");
                            mainCourse += 320;
                            break;
                        case 4:
                            System.out.println("Chole Bhature (150₹)");
                            mainCourse += 150;
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Deserts");
                    System.out.println("1: Gulab Jamun (20₹)\n2: Rasgulla (20₹)\n3: Barfi (25₹)\n4: Halwa (30₹)");
                    int selectDeserts = sc.nextInt();

                    switch(selectDeserts) {
                        case 1:
                            System.out.println("Gulab Jamun (20₹)");
                            deserts += 20;
                            break;
                        case 2:
                            System.out.println("Rasgulla (20₹)");
                            deserts += 20;
                            break;
                        case 3:
                            System.out.println("Barfi (25₹)");
                            deserts += 25;
                            break;
                        case 4:
                            System.out.println("Halwa (30₹)");
                            deserts += 30;
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Drinks");
                    System.out.println("1: Kokum Juice (30₹)\n2: Chaas (35₹)\n3: Lassi (40₹)\n4: Cold Drink (20₹)");
                    int selectDrinks = sc.nextInt();

                    switch(selectDrinks) {
                        case 1:
                            System.out.println("Kokum Juice (30₹)");
                            drinks += 30;
                            break;
                        case 2:
                            System.out.println("Chaas (35₹)");
                            drinks += 35;
                            break;
                        case 3:
                            System.out.println("Lassi (40₹)");
                            drinks += 40;
                            break;
                        case 4:
                            System.out.println("Cold Drink (20₹)");
                            drinks += 20;
                            break;
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("Do you want to add any other item? (Y/N)");
            ans = sc.next().charAt(0);

        } while (ans == 'Y' || ans == 'y');
        
        
        totalBill = starter + mainCourse + deserts + drinks;
        System.out.println("Your Total Bill is: ₹" + totalBill);
        System.out.println("Thank you for visiting!");
    }
}
