package devansh.challenge;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branch){
        if (findBranch(branch)==null){
            branches.add(new Branch(branch));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName,String customerName,double initialDeposit){
        Branch branch = findBranch(branchName);
        if (branch!=null){
            return branch.newCustomer(customerName,initialDeposit);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if (branch!=null){
            return branch.addCustomerTransaction(customerName,transaction);
        }
        return false;
    }

    private Branch findBranch(String branch){
        for (var element : branches){
            if (element.getName().equalsIgnoreCase(branch)){
                return element;
            }
        }
        return null;
    }

    public boolean listCustomers(String branch,boolean printTransaction){
        Branch bra = findBranch(branch);
        if (bra!=null){
            System.out.println("Customer details for branch "+bra.getName());
            ArrayList<Customer> branchCustomers = bra.getCustomers();
            for (int i=0;i<branchCustomers.size();i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: "+branchCustomer.getName()+"["+(i+1)+"]");
                if (printTransaction) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

}
