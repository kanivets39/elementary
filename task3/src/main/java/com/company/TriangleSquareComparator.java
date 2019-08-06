package com.company;

import java.util.Comparator;

 public class TriangleSquareComparator implements Comparator<Triangle> {

    @Override
    public int compare(Triangle o1, Triangle o2) {

        int i;
        if (o1.square > o2.square) i = -1;
        else i = o1.square == o2.square ? 0 : 1;
        return i;
    }
    }

