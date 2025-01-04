package devansh.challenge;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double initialDeposit){
        this.name = name;
        this.transactions.add(initialDeposit);
    }

    public String getName(){
        return name;
    }

    public ArrayList<Double> getTransactions(){
        return transactions;
    }

    public void addTransaction(double transaction){
        transactions.add(transaction);
    }

}
