package com.company.task2;


import java.util.Comparator;

class EnvelopeComparator implements Comparator<Envelope> {

    @Override
    public int compare(Envelope o1, Envelope o2) {

        boolean first_AtoA_BtoB = ((o1.getA() < o2.getA()) && (o1.getB() < o2.getB()));
        boolean first_BtoA_BtoB = ((o1.getA() < o2.getB()) && (o1.getB() < o2.getA()));
        boolean second_AtoA_BtoB = ((o2.getA() < o1.getA()) && (o2.getB() < o1.getB()));
        boolean second_BtoA_BtoB = ((o2.getA() < o1.getB()) && (o2.getB() < o1.getA()));

        if (first_AtoA_BtoB || first_BtoA_BtoB) {
            System.out.println("You can put first envelope into second");
            return 1;
        }
        if (second_AtoA_BtoB || second_BtoA_BtoB) {
            System.out.println("You can put second envelope into first");
            return -1;
        } else {
            System.out.println("These envelopes are not compatible ");
            return 0;
        }
    }

}
