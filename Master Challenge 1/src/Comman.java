public class Comman extends hamburgerMeal{
    private float amount;

    public Comman(String mealTitle) {
        super(mealTitle);
    }

    @Override
    public void addTopping(String Topping){
        super.addTopping(Topping);
        System.out.println("Added topping: " + Topping);
        switch(Topping.toUpperCase().charAt(0)){
            case 'O'-> amount += 10;
            case 'M'-> amount += 20;
            case 'C'-> amount += 30;
            case 'T'-> amount += 15;
            case 'P'-> amount += 5;
        };
    }

    @Override
    public void printBill(){
        super.printBill();
        System.out.printf("The burger cost = %.2f%nThe toppings cost: %.2f%nThe drink cost: %.2f%n",300.00,amount,50.00);
        amount += 300 + 50;
        System.out.println("The total Bill = $"+amount);
    }
}
