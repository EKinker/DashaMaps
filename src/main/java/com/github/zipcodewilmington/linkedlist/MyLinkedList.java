package com.github.zipcodewilmington.linkedlist;

public class MyLinkedList {
    MyNode head;

    public MyLinkedList(String key){
        head = new MyNode(key, null);
    }
    public MyNode getHead(){return head;}

    public MyNode get(String name){
        MyNode current =head;
        while(current!=null){
            if(current.getData().getKey().equals(name)){
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean isEmpty(){
        return head.getNext()==null;
    }

    public void add(String key, Integer value){
        MyNode current =head;
        while(current.getNext()!=null){
            current = current.getNext();
        }
        current.setNext(new MyNode(key, value));
    }

    public Integer remove(String key){
        MyNode previous = head;
        MyNode current =head.getNext();
        while(current != null && !current.getData().getKey().equals(key)){
            previous = current;
            current = current.getNext();
        }
        if(current == null) return null;
        previous.setNext(current.getNext());
        return current.getData().getValue();
    }

    public int size(){
        MyNode current = head;
        int counter =0;
        while(current.getNext()!=null){
            current = current.getNext();
            counter++;
        }
        return counter;
    }

}
