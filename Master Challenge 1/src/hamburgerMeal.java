public class hamburgerMeal {

    private float amount;
    private String mealTitle;

    public hamburgerMeal(String mealTitle) {
        this.mealTitle = mealTitle;
    }

    public void showMeal() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(mealTitle + " is a " + instanceType + " Meal");
    }

    public static hamburgerMeal getMeal(String mealTitle) {
        return switch (mealTitle.toUpperCase().charAt(0)) {
            case 'C' -> new Comman(mealTitle);
//            case 'D' -> new Deluxe();
            default -> new hamburgerMeal(mealTitle);
        };
    }

    public void addTopping(String Topping){
        System.out.println("Add "+Topping+" To your Burger:)");
    }

    public void printBill(){
        System.out.println("Printing the total Bill amount: ");
    }
}

