package Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {
    Store store = new Store("Frankz");
    Manager manager = new Manager(store);
    Cashier cashier = new Cashier("Promise", store, 3200);
    Customer customer1 = new Customer("Deji", 95000, store);
    Customer customer2 = new Customer("Buhari", 90000, store);

  FileReader fileRead = new FileReader(store);
    @Test
    void checkOut() {
        fileRead.readFile();
        customer1.buyProduct(store.getListOfProduct().get(1),1);
        customer2.buyProduct(store.getListOfProduct().get(5),2);

        cashier.checkOut(customer1);
        cashier.checkOut(customer2);
       assertEquals(2, cashier.getNoOfSales());
    }


}