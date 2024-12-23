import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        String menu = """
                *******Menu*******
                \u2022 Comman Meal - a Hamburger, a small Coke, and fried.
                \u2022 Deluxe Burger Meal - a Deluxe Burger, choose your drink and side item, 5 toppings included.
                \u2020 Custom Meal:
                    \u2022 Burgers we have are:
                        \u2022 normal hamburger
                        \u2022 duluxe hamburger
                        \u2022 medium hamburger
                    \u2022 Drinks we have are:
                        \u2022 Coke
                        \u2022 Large Coke
                        \u2022 Lemon juice
                    \u2022 Side Items we have are:
                        \u2022 French Fries
                        \u2022 Croissant
                        \u2022 Ice Cream
                    \u2022 Toppings we have are:
                        \u2022 Onion
                        \u2022 Mayonnaise
                        \u2022 Cheese
                        \u2022 Tomato
                        \u2022 Pickle
                """;
        System.out.println(menu);
        Scanner scrn = new Scanner(System.in);

        System.out.println("Enter the Meal Name: ");
        String meal = scrn.nextLine();
        hamburgerMeal comman =new Comman(meal);
        System.out.println("Enter the number of toppings: ");
        int n = scrn.nextInt();String check="nothing";
        while(n!=0) {
            System.out.println("Enter Topping name: ");
            String topping = scrn.nextLine();
            if (topping.isEmpty()) {
                System.out.println("Topping cannot be empty:)");
                continue;
            }
            if(topping.equals(check)){
                System.out.println("This Topping is already added try another topping:)");
                n++;
                continue;
            }
            comman.addTopping(topping);
            check = topping;
            n--;
        }
        comman.printBill();
//        hamburgerMeal deluxe = new Deluxe("Large Coke","Croissant");
//        deluxe.addTopping("Onion");
//        deluxe.addTopping("Mayonnaise");
//        deluxe.addTopping("Cheese");
//        deluxe.addTopping("Tomato");
//        deluxe.addTopping("Pickle");
//        deluxe.printBill();


    }
}