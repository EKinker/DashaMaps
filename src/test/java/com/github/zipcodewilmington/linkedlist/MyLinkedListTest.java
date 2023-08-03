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
    }

    @Test
    void size() {
        MyLinkedList list = new MyLinkedList("A");
        int expected = 1;
        int actual = list.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    void size2(){
        MyLinkedList list = new MyLinkedList("A");
        list.add("Apple",1);

        int expected = 2;
        int actual = list.size();

        Assert.assertEquals(expected, actual);
    }
}