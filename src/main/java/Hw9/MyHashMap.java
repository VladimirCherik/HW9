package Hw9;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Objects;

public class MyHashMap {
    private Node firstBucket;
    private Node lastBucket;
    int quantity = 0;
    public MyHashMap() {
        lastBucket = new Node(null);
        firstBucket = new Node(lastBucket);
    }

    private static class Node {
        private int hash;
        private Object key;
        private Object value;
        private Node next;


        Node(Node next) {
//            this.hash = hash;
//            this.key = key;
//            this.value = value;
            this.next = next;

        }
    }


    void put(Object key, Object value){
        Node target = firstBucket.next;
        if(target != null){
            //перевірка на співпадіння hash
            if(firstBucket.hash == Objects.hash(key)){
                System.err.println("this hash has already added");
                return;
            }

            for (int i = 0; i < quantity; i++){
                if(target!= null && target.hash == Objects.hash(key)){
                    System.err.println("this hash has already added");
                    return;
                }
                target = getNextMetd(target);
            }
        }

        // Створення елементу.
        Node prev = lastBucket;
        prev.key = key;
        prev.value = value;
        prev.hash = Objects.hash(key);
        lastBucket = new Node(null);
        prev.next = lastBucket;
        quantity++;
    }
    private Node getNextMetd(Node target) {
        return target.next;
    }
    void remove(Object key){
        Node target = firstBucket;
        for (int i = 0; i < quantity; i++){
            System.out.println(target.key + "    target");
            System.out.println(key + "     key");

            if(target.next.hash == Objects.hash(key)){
                target.next = target.next.next;
                quantity--;
                return;
            }
            target = getNextMetd(target);
        }
    }
    void clear(){
        firstBucket = null;
        lastBucket = null;
        quantity = 0;
    }
    int size(){
        return quantity;
    }
    Object get(Object key){
//        if(firstBucket.hash == Objects.hash(key)){
//            System.out.println(firstBucket.hash + "!!!!");
//            return firstBucket.value;
//        }
        Node target = firstBucket.next;

        for (int i = 0; i < quantity; i++){
//            System.out.println(target.hash + " target");
//            System.out.println(Objects.hash(key) + " key");
            if(target.hash == Objects.hash(key)){
                return target.value;
            }
           target = getNextMetd(target);
        }
        return null;
    }
}
