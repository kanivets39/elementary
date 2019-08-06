package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle testTriangle = new Triangle();

    @Test
    public void squareCalculationTest() {
        double side1 = 10;
        double side2 = 15;
        double side3 = 20;
        double result = Triangle.squareCalculation(side1,side2,side3);
        assertTrue("The calculations are correct ", result == 72.61843774138907);
    }


}