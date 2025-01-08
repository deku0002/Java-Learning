package devansh.challenge;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product){}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

//        storeProducts.add(new Grocery("Protein","Protein Powder is good for muscles",1281));
//        storeProducts.add(new Grocery("Chocolate","Sweet but high in calorie",1281));

        storeProducts.add(new ArtObject("Oil Painting", "Impressionistic work by ABF painted in 2010",1350));
        storeProducts.add(new ArtObject("Sculpture", "Bronze work by JKF, produced in 1950",2000));

        storeProducts.add(new ArtObject("Oil Painting","Impressionistic work by ABF Painted in 2010",1350));
        storeProducts.add(new ArtObject("Desk", "Mahogany Desk",500));
        storeProducts.add(new ArtObject("Lamp","Tiffany Lamp with Hummingbirds",500));
        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemOrder(order1, 1,2);
        addItemOrder(order1,0,1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemOrder(order2, 3,5);
        addItemOrder(order2,2,1);
        addItemOrder(order2,4,7);
        printOrder(order2);
    }

    public static void listProducts(){
        for (var item : storeProducts){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double totalSales = 0;
        for (var item : order){
             item.product().printPricesItems(item.qty());
             totalSales += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n",totalSales);
    }
}
