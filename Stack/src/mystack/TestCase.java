package mystack;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCase {

    @Test
    public void testCase1IsPerfect() {
        Algorithm algorithm = new Algorithm();
        boolean expectedResult = false;
        boolean actualResult = algorithm.isPerfect(4);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCase2Isperfect(){
        Algorithm algorithm = new Algorithm();
        boolean expectedResult = true;
        boolean actualResult = algorithm.isPerfect(6);
        assertEquals(expectedResult,actualResult);
    }
}