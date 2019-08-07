package Task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleSquareComparatorTest {

    private TriangleSquareComparator comparator = new TriangleSquareComparator();


    @Test
    public void testEqual() {
        Triangle firstFigure = new Triangle("first", 10, 15,20);
        Triangle secondFigure = new Triangle("second", 10, 15,20);
        int result = comparator.compare(firstFigure, secondFigure);
        assertTrue("expected to be equal", result == 0);
    }

    @Test
    public void testLessThan() {
        Triangle firstFigure = new Triangle("first", 7, 10,5);
        Triangle secondFigure = new Triangle("second", 10, 15,20);
        int result = comparator.compare(firstFigure, secondFigure);
        assertTrue("expected to be greater than", result > 0);
    }

    @Test
    public void testGreaterThan() {
        Triangle firstFigure = new Triangle("first", 20, 18,22);
        Triangle secondFigure = new Triangle("second", 10, 15,20);
        int result = comparator.compare(firstFigure, secondFigure);
        assertTrue("expected to be less than", result < 0);
    }

}