package Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Store store = new Store("Frankz");
    Customer customer1 = new Customer("Deji", 95000, store);
    Customer customer2 = new Customer("Tim", 95000, store);
    @Test
    void buyProduct() {
        FileReader FileReader = new FileReader(store);
        FileReader.readFile();
        customer1.buyProduct(store.getListOfProduct().get(0), 4 );
        customer1.buyProduct(store.getListOfProduct().get(2), 3);
        customer2.buyProduct(store.getListOfProduct().get(3), 5);

        assertEquals(2, customer1.getCart().size());
       assertTrue(customer1.getCart().contains(store.getListOfProduct().get(0)));
        assertTrue(customer2.getCart().contains(store.getListOfProduct().get(3)));
    }
}