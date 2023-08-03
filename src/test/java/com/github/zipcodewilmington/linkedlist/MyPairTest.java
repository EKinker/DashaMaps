package com.github.zipcodewilmington.linkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPairTest {

    @Test
    void getKey() {
        MyPair mp = new MyPair("a",1);
        Assert.assertEquals("a", mp.getKey());
    }

    @Test
    void setKey() {
        MyPair mp = new MyPair("a", 1);
        String expected = "b";

    }

    @Test
    void getValue() {
    }

    @Test
    void setValue() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testToString() {
    }
}