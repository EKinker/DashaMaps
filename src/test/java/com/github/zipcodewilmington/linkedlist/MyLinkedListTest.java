package com.github.zipcodewilmington.linkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void add() {
        MyLinkedList list = new MyLinkedList("A");
        String expectedKey = "B";
        Integer expectedValue = 6;
        MyNode expected = new MyNode(expectedKey, expectedValue);

        list.add(expectedKey, expectedValue);
        MyNode actual = list.getHead().getNext();

        Assert.assertEquals(actual,expected);

    }

    @Test
    void remove() {
        MyLinkedList list = new MyLinkedList("A");
        list.add("Apple", 1);
        list.add("Arrow", 2);
        list.add("Amelia", 3);
        Assert.assertEquals(3, list.size());

        Integer actual = list.remove("Arrow");
        Assert.assertEquals(2, list.size());
        Assert.assertEquals((Integer) 2, actual);

    }

    @Test
    void size() {
        MyLinkedList list = new MyLinkedList("A");
        int expected = 0;
        int actual = list.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    void size2(){
        MyLinkedList list = new MyLinkedList("A");
        list.add("Apple",1);

        int expected = 1;
        int actual = list.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    void get() {
        MyLinkedList list = new MyLinkedList("A");
        list.add("Apple",1);

        MyNode expected = new MyNode("Apple",1);
        MyNode actual = list.get("Apple");

        Assert.assertEquals(expected, actual);
    }

    @Test
    void isEmpty() {
        MyLinkedList list = new MyLinkedList("A");
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    void isEmpty2() {
        MyLinkedList list = new MyLinkedList("A");
        list.add("Apple", 1);
        Assert.assertFalse(list.isEmpty());
    }
}