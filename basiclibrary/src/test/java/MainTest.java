
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MainTest {
    @Test
    @DisplayName("containsDuplicates should return true or false")
    public void containsDuplicatesMethod() {
        int[] trueArr = {1, 2, 1, 4};
        int[] falseArr = {1, 2, 3, 4};


        assertTrue(Main.containsDuplicates(trueArr), "containsDuplicates should return 'true'");
        assertFalse(Main.containsDuplicates(falseArr), "containsDuplicates should return 'false'");

    }

    @Test
    @DisplayName("average should return the average of array equal to 5")
    public void averageMethod() {
        int[] avgArr = {10, 3, 3, 4};
        assertEquals(5, Main.average(avgArr), "average should return the average of array equal to 5");
    }
    @Test
    @DisplayName("lowestAvg should return the lowest array in the parent array which is {55, 54, 60, 53, 59, 57, 61}")
    public void lowestAvgMethod() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] arrExpected = {55, 54, 60, 53, 59, 57, 61};

        assertArrayEquals(arrExpected, Main.lowAvg(weeklyMonthTemperatures), "lowestAvg should return the lowest array in the parent array which is {55, 54, 60, 53, 59, 57, 61}");

    }
    @Test
    @DisplayName("roll should return array of length 6")
    public void rollMethod(){
        assertEquals(6, Main.roll(6).length, "roll should return array of length 6");
    }
}
