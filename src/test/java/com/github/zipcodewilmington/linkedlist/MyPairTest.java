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
        mp.setKey(expected);

        Assert.assertEquals(expected, mp.getKey());
    }

    @Test
    void getValue() {
        MyPair mp = new MyPair("a",1);
        Assert.assertEquals((Integer) 1, mp.getValue());
    }

    @Test
    void setValue() {
        MyPair mp = new MyPair("a", 1);
        int expected = 2;
        mp.setValue(expected);

        Assert.assertEquals((Integer)expected, mp.getValue());

    }

    @Test
    void testEquals() {
        MyPair mp = new MyPair("a", 1);
        MyPair mp2 = new MyPair("a", 1);

        Assert.assertTrue(mp.equals(mp2));
    }

    @Test
    void testToString() {
        MyPair mp = new MyPair("a",1);
        String expected = "MyPair{key='a', value=1}";
        String actual = mp.toString();

        Assert.assertEquals(expected, actual);
    }
}