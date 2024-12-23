public class Main{
    public static void main(String[] args) {
//        Item coke = new Item("Drink","Coke",1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avacado = new Item("Topping","Avacado",1.50);
//        avacado.printItem();

//        Burger burger = new Burger("regular",4.00);
//        burger.addTopping("BACON","CHEESE","MAYO");
//        burger.printItem();

//        MealOrder regularmeal = new MealOrder();
//        regularmeal.addBurgerToppings("MAYO","BACON","CHEESE");
//        regularmeal.setDrinkSize("LARGE");
//        regularmeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("Deluxe","7-UP","chili");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("DELUXE","7-UP","CHILI");
        deluxeMeal.addBurgerToppings("AVOCADO","BACON","LETTUCE","CHEESE","MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
    }
}