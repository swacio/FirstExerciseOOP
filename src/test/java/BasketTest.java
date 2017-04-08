import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mateusz on 08.04.2017.
 */
public class BasketTest {

    Basket b1 = new Basket();
    Client c1 = new Client("Marcin", 17, 1, 1200, b1);

    Product p1 = new Product("Samsung", 1000, 0.1f, false);
    Product p2 = new Product("Whisky", 80, 0f, true);


    @org.junit.Test (timeout = 500)
    public void addProduct() throws Exception {
        assertEquals("Dodano produkt!", b1.addProduct(p1, c1));
        assertEquals("Ograniczenia wiekowe!", b1.addProduct(p2, c1));
    }

    @Test
    public void showWeightBasket() throws Exception {
        assertFalse(b1.weightBasket() == 11);
        assertTrue(b1.weightBasket() == 0.0);
    }

}