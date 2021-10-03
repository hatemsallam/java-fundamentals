package inheritance;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RestaurantTest {
    Restaurant res;

    @BeforeEach
    public void init() {
        res = new Restaurant("res"  , "$$$");
    }

    @Test
    public void testConstructor() {
        String expectedName = "res";
        String expectedPrice = "$$$";
        int expectedRate = 0;
        assertEquals(expectedRate ,res.getRate());
        assertEquals(expectedName ,res.getName());
        assertEquals(expectedPrice ,res.getPriceCategory());
    }

    @Test
    public void testToString() {
        assertEquals("Restaurant{name='res', rate=0, priceCategory='$$$', reviews=[]}" , res.toString());
    }
}
