import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mateusz on 08.04.2017.
 */
public class ClientTest extends BasketTest{

    @org.junit.Test
    public void remainingCapacity() throws Exception {
        assertTrue(1 == c1.remainingCapacity());
    }

    @Test
    public void showRemainingCapacity() throws Exception {
        assertEquals("Pozostało: 1.0", c1.showRemainingCapacity());
    }

}