package com.github.zipcodewilmington;

import com.github.zipcodewilmington.linkedlist.MyLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap implements HashMapX{

    MyLinkedList[] dashamap;

    public DashaMap() {
        dashamap = new MyLinkedList[26];
        char letter = 'a';
        for (int i = 0; i <26; i++){
            dashamap[i]= new MyLinkedList(Character.toString(letter));
            letter++;
        }
    }

    @Override
    public void set(String key, String value) {

    }

    @Override
    public String delete(String key) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        for (MyLinkedList ll: dashamap){
            if (!ll.isEmpty()){
                return false;
            }
        }
        return true;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (MyLinkedList list : dashamap){
            sb.append((list.toString())+"\n");

        }

        return sb.toString();
    }
}
