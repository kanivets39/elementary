package com.company;

public class Triangle {
    double square;
    private String name;
    private double side1;
    private double side2;
    private double side3;
    private String description;

    Triangle() {
        this.name = "Empty triangle";
    }

    Triangle(String name, double side1, double side2, double side3) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (!isTriangle(side1, side2, side3)) {
            this.description = "It isn`t triangle";
        } else {
            this.description = " ";
        }
        this.square = squareCalculation(side1, side2, side3);
    }

    private static boolean isTriangle(double side1, double side2, double side3) {
        return ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1));
    }

    protected static double squareCalculation(double side1, double side2, double side3) {
        double sP = semiPerimeter(side1, side2, side3);
        return Math.sqrt(sP * (sP - side1) * (sP - side2) * (sP - side3));
    }

    private static double semiPerimeter(double side1, double side2, double side3) {
        return (side1 + side2 + side3) / 2;
    }

    @Override
    public String toString() {
        return "Triangle " + "name= " + name +
                " side1= " + side1 + " ,side2= " + side2 +
                " ,side3= " + side3 + " ,square= " + square + "|" + description;
    }
}
