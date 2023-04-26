package Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fileReaderTest {
Store store = new Store("Frank");
//Store store2 = new Store("IB");
@Test
    public void readFile() {

        FileReader fileReader = new FileReader(store);
        fileReader.readFile();
       // System.out.println(store.getListOfProduct().get(0));
        assertTrue(store.getListOfProduct().contains(store.getListOfProduct().get(0)));
    assertNotNull(store.getListOfProduct());
    }

}