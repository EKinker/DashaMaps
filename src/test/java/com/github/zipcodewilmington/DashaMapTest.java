package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapTest {
    @Test
    void set() {
    }

    @Test
    void delete() {
    }

    @Test
    void get() {
    }

    @Test
    void isEmpty() {
        DashaMap dm = new DashaMap();
        Assert.assertTrue(dm.isEmpty());
    }

    @Test
    void isNotEmpty(){
        DashaMap dm = new DashaMap();

    }

    @Test
    void size() {
    }

    @Test
    void bucketSize() {
    }

    @Test
    void testToString() {
        DashaMap dm = new DashaMap();
        System.out.println(dm.toString());
    }
}
