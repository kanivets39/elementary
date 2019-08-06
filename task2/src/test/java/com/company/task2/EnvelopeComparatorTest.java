package com.company.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnvelopeComparatorTest {

    EnvelopeComparator envelopeComparator = new EnvelopeComparator();

    @Test
    public void testEqual() {
        Envelope firstEnvelope = new Envelope();
        firstEnvelope.setA(5);
        firstEnvelope.setB(8);
        Envelope secondEnvelope = new Envelope();
        secondEnvelope.setA(8);
        secondEnvelope.setB(5);
        int result = envelopeComparator.compare(firstEnvelope, secondEnvelope);
        assertTrue("expected to be equal", result == 0);
    }

    @Test
    public void testLessThan() {
        Envelope firstEnvelope = new Envelope();
        firstEnvelope.setA(2);
        firstEnvelope.setB(4.4);
        Envelope secondEnvelope = new Envelope();
        secondEnvelope.setA(5);
        secondEnvelope.setB(3);
        int result = envelopeComparator.compare(firstEnvelope, secondEnvelope);
        assertTrue("expected to be less than", result > 0);
    }

    @Test
    public void testGreaterThan() {
        Envelope firstEnvelope = new Envelope();
        firstEnvelope.setA(10);
        firstEnvelope.setB(8);
        Envelope secondEnvelope = new Envelope();
        secondEnvelope.setA(2.6);
        secondEnvelope.setB(9.8);
        int result = envelopeComparator.compare(firstEnvelope, secondEnvelope);
        assertTrue("expected to be greater than", result < 0);
    }


}