package Entity;


public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
            Store store = new Store("MaxStore");
            FileReader fR = new FileReader(store);
            fR.readFile();


        Manager manager = new Manager(store);

        Applicant applicant1 = new Applicant("Favor", 24);
        Applicant applicant2 = new Applicant("Promise", 35);
        Applicant applicant3 = new Applicant("King", 25);
        Applicant applicant4 = new Applicant("Nneka", 25);


        manager.hireEmployee(applicant1);
        manager.hireEmployee(applicant2);
        manager.hireEmployee(applicant3);
        manager.hireEmployee(applicant4);
        Cashier cashier1 = new Cashier(applicant1.getName(), store, 1000);
        Cashier cashier3 = new Cashier(applicant3.getName(), store, 1001);
        Cashier cashier4 = new Cashier(applicant4.getName(), store, 1002);
        manager.addNewCashier(cashier1);
        manager.addNewCashier(cashier3);
        manager.addNewCashier(cashier4);





        Customer customer1 = new Customer("Chi", 7000000, store);
        Customer customer2 = new Customer("Chizoba", 90000, store);
        Customer customer3 = new Customer("Frank", 700000, store);
        Customer customer4 = new Customer("Cynthia", 170000, store);
        Customer customer5 = new Customer("Ola", 120000, store);

        customer1.buyProduct(store.getListOfProduct().get(5), 120);
        customer2.buyProduct(store.getListOfProduct().get(3), 3);
        customer3.buyProduct(store.getListOfProduct().get(7), 7);
        customer4.buyProduct(store.getListOfProduct().get(9), 10);
        customer2.buyProduct(store.getListOfProduct().get(3), 3);
       customer5.buyProduct(store.getListOfProduct().get(6), 5);

//        System.out.println(store.getListOfProduct());


        cashier1.checkOut(customer1);
        cashier1.checkOut(customer2);
        cashier1.checkOut(customer3);
        cashier3.checkOut(customer4);
        cashier3.checkOut(customer5);

        manager.fireCashier(cashier1);
        manager.fireCashier(cashier3);
        manager.fireCashier(cashier4);

    }
    }

