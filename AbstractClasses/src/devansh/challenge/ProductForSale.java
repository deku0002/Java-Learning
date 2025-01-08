package devansh.challenge;

public abstract class ProductForSale {

    protected String type,description;
    protected double price;

    public ProductForSale(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public double getSalesPrice(int quantity){
        return (quantity*price);
    }

    public void printPricesItems(int quantity){
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n",quantity, price, type, description);
    }

    public abstract void showDetails();  //represents what might be displayed on product page
                                                     //product type, description and so on.
}
