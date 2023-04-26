package Entity;

import Interfaces.ICustomer;

import java.util.ArrayList;

public class Customer extends Person implements ICustomer {
   private String name;
   private double walletBalance;
   private Store store;

   private ArrayList<Product> cart;
   private double amount = 0;

    Customer(String name, double walletBalance, Store store){
        super(name);
        this.walletBalance = walletBalance;
        this.store = store;
        this.cart = new ArrayList<>();
    }
    @Override
            public void buyProduct(Product product, int quantity) {
               Product newProd = new Product(product.getProductName(), product.getCategory(), product.getPricePerUnit(), quantity);
                for (int i = 0; i < store.getListOfProduct().size(); i++) {
                    Product prod = store.getListOfProduct().get(i);
                    if(prod.getProductName().equals(newProd.getProductName())){
                        if(prod.getQuantity() > quantity) {
                            cart.add(newProd);
                            System.out.println(newProd.getProductName()+" added to cart.");

                        }else {
                            System.out.println("Out of Stock");
                        }
                        break;
            }

    }
}

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount += amount;
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double amount) {
        this.walletBalance -= amount;
    }
}
