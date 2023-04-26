package Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
            Store store = new Store("Clemz");
            Manager manager = new Manager(store);


            Applicant applicant1 = new Applicant("Isah", 27);
            Applicant applicant2 = new Applicant("John", 27);
            Applicant applicant3 = new Applicant("Isaac", 15);

            Customer customer1 = new Customer("Mike", 50000, store);
            Customer customer2 = new Customer("Peace", 70000, store);
            Customer customer3 = new Customer("Ogadinma", 75000, store);



    @Test
    void hireEmployee() {
        manager.hireEmployee(applicant1);
        manager.hireEmployee(applicant2);
        manager.hireEmployee(applicant3);

        assertTrue(applicant1.isEmployed());
        assertTrue(applicant2.isEmployed());
        assertFalse(applicant3.isEmployed());
    }

    @Test
    void addNewCashier() {
        Cashier cashier1 = new Cashier(applicant1.getName(),store, 5300);
        Cashier cashier2 = new Cashier(applicant2.getName(),store, 5301);

        manager.addNewCashier(cashier1);
        manager.addNewCashier(cashier2);

        assertEquals(2, store.getListOfCashiers().size());
    }

    @Test
    void fireCashier() {
      FileReader reader = new FileReader(store);
      reader.readFile();
        customer1.buyProduct(store.getListOfProduct().get(4), 3);
        customer2.buyProduct(store.getListOfProduct().get(3), 5);
        customer3.buyProduct(store.getListOfProduct().get(5), 5);


        Cashier cashier1 = new Cashier(applicant1.getName(),store, 5300);
        Cashier cashier2 = new Cashier(applicant2.getName(),store, 5301);

        manager.addNewCashier(cashier1);
        manager.addNewCashier(cashier2);

        cashier1.checkOut(customer1);
        cashier1.checkOut(customer2);
        cashier1.checkOut(customer3);


        manager.fireCashier(cashier1);
        manager.fireCashier(cashier2);

        assertFalse(cashier1.isIsfired());
        assertTrue(cashier2.isIsfired());

    }

}