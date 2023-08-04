package com.github.zipcodewilmington.linkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNodeTest {


    @Test
    void setNext() {
        MyNode node = new MyNode("a", 1);
        MyNode node2 = new MyNode("b", 2);

        node.setNext(node2);

        Assert.assertEquals(node2, node.getNext());
    }

    @Test
    void testEquals() {
        MyNode node1 = new MyNode("a",1);
        MyNode node2 = new MyNode("a",1);

        Assert.assertTrue(node1.equals(node2));
    }

    @Test
    void testToString() {
        MyNode node = new MyNode("Zaphod", 42);
        String expected = "{Zaphod, 42}";

        String actual = node.toString();
        Assert.assertEquals(expected, actual);

    }
}