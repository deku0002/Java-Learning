package devansh.challenge;

public class Furniture extends ProductForSale{

    public Furniture(String type, String description, double price) {
        super(type, description, price);
    }

    @Override
    public void showDetails() {
        System.out.println("This "+type+" is a was manufactured in North Carolina");
        System.out.printf("The price of the piece is $%6.2f %n",price);
        System.out.println(description);
    }
}
