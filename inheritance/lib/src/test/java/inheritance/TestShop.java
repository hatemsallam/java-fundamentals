package inheritance;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestShop {
    Shop testShop;

    @BeforeEach
    public void init() {
        testShop = new Shop("test" , "test desc" , "$$$");
    }

    @Test
    public void testConstructor() {
        String expectedName = "test";
        String actualName = testShop.getName();
        String expectedDesc = "test desc";
        String actualDesc = testShop.getDescription();
        String expectedPrice = "$$$";
        String actualPrice = testShop.getPriceCategory();

        Assertions.assertEquals(expectedName , actualName , "Pass if constructer passed the name argument correctly ");
        Assertions.assertEquals(expectedDesc , actualDesc , "Pass if constructer passed the Description argument correctly ");
        Assertions.assertEquals(expectedPrice , actualPrice , "Pass if constructer passed the Price  category argument correctly ");
    }
}
