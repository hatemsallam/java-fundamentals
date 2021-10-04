package inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTheater {
    Theater testTh;
    @BeforeEach
    public void init() {
        testTh = new Theater("test");
    }

    @Test
    public void testConstructor() {
        Assertions.assertEquals("test" , testTh.getName());
    }

    @Test
    public void testAddAndRemove() {
        /**
         * Test addMovie method
         */
        System.out.println(testTh.getMovies().size());
        testTh.addMovie("New Movie");
        Assertions.assertTrue(testTh.getMovies().size() == 1 , "Returns true if a movie succesfully added");

        /**
         * Test remove existing movie
         */
        System.out.println(testTh.getMovies().size());
        testTh.removeMovie("New Movie");
        Assertions.assertTrue(testTh.getMovies().size() == 0 , "will be true if empty (successful deletion done)");
        /**
         * Test romving non-existing movie
         */
        testTh.addMovie("test");
        testTh.removeMovie("t");
        Assertions.assertFalse(testTh.getMovies().size() == 0 ,"Will return false if the value is not deleted");
    }


    @Test
    public void testReview () {
        Review myTestReview = new Review("test body" , "test author" , 1);
        testTh.addMovie("test movie");
        /**
         * Add a review with existing movie
         */
        testTh.addReview(myTestReview , "test movie");


        Assertions.assertTrue(testTh.getReviews().size() == 1 , "return true if the review successfully added ");
        /**
         * Add a review with none existing movie
         */
        testTh.addReview(myTestReview , "hello world");


        Assertions.assertTrue(testTh.getReviews().size() == 1 , "Nothing will be added the size stays the same return true if succeeded");
        /**
         * Add a review without supplying movie name
         */
        testTh.addReview(myTestReview);
        Assertions.assertTrue(testTh.getReviews().size() == 2 , "Size equals size + 1 a review added successfully ");

    }
}
