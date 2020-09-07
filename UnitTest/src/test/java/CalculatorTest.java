import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {

        assertEquals(5, Calculator.add(2,4));

    }

    @Test
    void testCase1() {
        System.out.println("Test Case 1 executed...");

        assertEquals(20, 20);

    }

    @Test
    void testCase2() {
        System.out.println("Test Case 2 executed...");
        boolean result = Calculator.add(2,3) == 5;
        assertTrue(result);

        assertTrue(Calculator.operator.equals("add"));

    }

    @Test
    void testCase3() {
        System.out.println("Test Case 3 executed...");
        //test will pass
        assertArrayEquals(new int []{1, 2, 3}, new int[]{1, 2, 3});

        //test will fail
        //assertArrayEquals(new int []{1, 2, 3}, new int[]{1, 3, 3});

        //test will fail
        assertArrayEquals(new int []{1, 2, 3, 4}, new int[]{1, 2, 3});


    }


    @Test
    void testCase4() {
        System.out.println("Test Case 4 executed...");
        String nullString = null;
        String notNullString = "Cybertek";

        //Test will pass
        assertNotNull(notNullString);

        //Test will fail
        assertNotNull(nullString);

        //Test will pass
        assertNull(notNullString);



    }

    @Test
    void testCase5() {
        System.out.println("Test Case 5 executed...");
        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();

        //Test will pass
        assertNotSame(c1, c3);

        //Test will fail
        assertNotSame(c1, c2);

        //Test will fail
        assertSame(c1, c2);

    }


    @BeforeEach
    void setUpEach(){
    System.out.println("@BeforeEach is running");
}
}