package Hw9;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

//        MyArrayList myArrayList = new MyArrayList();
//        myArrayList.add(17);
//        myArrayList.add(18);
//        myArrayList.add(19);
//        myArrayList.add(20);
//        myArrayList.add("whou");
//        myArrayList.add("yes");
//        System.out.println(Arrays.toString(myArrayList.getArray()) + " - add()");
//        myArrayList.remove(2);
//        System.out.println(Arrays.toString(myArrayList.getArray()) + " - remove()");
//        System.out.println(myArrayList.get(2) + " - get() element at the index");
//        myArrayList.clear();
//        System.out.println(Arrays.toString(myArrayList.getArray()) + " - clear()");
//        System.out.println(myArrayList.size() + " - size()");


//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.add("0");
//        myLinkedList.add("1");
//        myLinkedList.add("2");
//        myLinkedList.add("3");
//        myLinkedList.add("4");
//        myLinkedList.add("5");
//        myLinkedList.add("6");
//        myLinkedList.add("7");
//        System.out.println(myLinkedList.get(0));
//        System.out.println(myLinkedList.get(1));
//        System.out.println(myLinkedList.get(2));
//        System.out.println(myLinkedList.get(3));
//        System.out.println(myLinkedList.get(2) + " beforeRemove");
//        myLinkedList.remove(2);
//        System.out.println(myLinkedList.get(2) + " afterRemove");
//        System.out.println(myLinkedList.size + " size");
//        myLinkedList.clear();
//        System.out.println(myLinkedList.size + " afterCleaning");

//        MyQueue myQueue = new MyQueue();
//        myQueue.add("first");
//        myQueue.add("second");
//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.peek());
//        System.out.println(Arrays.toString(myQueue.getArrayQu()));
//        myQueue.clear();
//        System.out.println(Arrays.toString(myQueue.getArrayQu()));
//        myQueue.add("first");
//        myQueue.add("first1");
//        myQueue.add("first2");
//        System.out.println(Arrays.toString(myQueue.getArrayQu()));
//        System.out.println(myQueue.poll());
//        System.out.println(Arrays.toString(myQueue.getArrayQu()));
//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.poll());
//        System.out.println(Arrays.toString(myQueue.getArrayQu()));
//        System.out.println(myQueue.size());

//        MyStack stack = new MyStack();
//        stack.push("firstPlate");
//        stack.push("secondPlate");
//        stack.push("thirdPlate");
//        System.out.println(Arrays.toString(stack.getArrayStack()));
//        System.out.println(stack.size());
//        stack.pop();
//        System.out.println(Arrays.toString(stack.getArrayStack()));
//        System.out.println(stack.size());
//        System.out.println(stack.peek());
//        stack.push("thirdPlate");
//        System.out.println(Arrays.toString(stack.getArrayStack()));
//        stack.remove(0);
//        stack.remove(0);
//        System.out.println(Arrays.toString(stack.getArrayStack()));


        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put("1", "first");
        myHashMap.put("2", "second");
        myHashMap.put("3", "three");
        myHashMap.put(5, "five digit");
        System.out.println(myHashMap.get("1"));
        System.out.println(myHashMap.size() + " size before ");
        myHashMap.remove("2");
        System.out.println(myHashMap.size() + " size after deleting");
        System.out.println(myHashMap.get(5));





    }
}
