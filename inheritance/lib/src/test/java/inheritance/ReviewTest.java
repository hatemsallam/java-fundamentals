package inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ReviewTest {
    Review rev;


    @Test
    public void testConstructor () {
        String expectedAuth = "user";
        String expectedBody = "good";
        int expectedStars = 2;
        assertEquals(expectedStars , 2);
        assertEquals(expectedAuth , "user");
        assertEquals(expectedBody , "good");
    }


}