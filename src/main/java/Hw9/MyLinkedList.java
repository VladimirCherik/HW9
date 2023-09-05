package Hw9;

import java.util.LinkedList;

public class MyLinkedList {
    public Node firstNode;
    public   Node lastNode;
    public int size;
    public MyLinkedList (){
        lastNode = new Node(null, firstNode, null);
        firstNode = new Node(null, null, lastNode);
    }

    void add(Object value){
        Node prev = lastNode;
        prev.currentElem = value;
        lastNode = new Node(null, prev, null);
        prev.nextElem = lastNode;
        size++;
    }

    void remove(int index){
        if(index >= 0 && index < size){
            Node target = firstNode.nextElem;
            for (int i = 0; i < index - 1; i++){
                target = getNextMetd(target);
            }
            // переприв'язка лінку на наступну ноду після тієй що видаляємо
            target.nextElem = target.nextElem.nextElem;
            // переприв'язка лінку з нової наступної ноди на поточну
            target.nextElem.prevElem = target.nextElem.prevElem.prevElem;

            size--;
        }else {
            System.err.println("There is not the index you would like to remove ");
        }

    }
    int size(){
        return size;
    }
    Object get(int index){
        if(index >= 0 && index < size){
            Node target = firstNode.nextElem;
            for (int i = 0; i < index; i++){
                target = getNextMetd(target);
            }
            return target.currentElem;
        }
        System.err.println("There is not the index you would like to get ");
        return null;
    }
    private Node getNextMetd(Node target) {
        return target.nextElem;
    }
    void clear(){
        firstNode = null;
        lastNode = null;
        size = 0;
    }
    private static class Node {
        public Object currentElem;
        public Node prevElem;
        public Node nextElem;
        public Node (Object currentElem, Node prevElem, Node nextElem){
            this.currentElem = currentElem;
            this.prevElem = prevElem;
            this.nextElem = nextElem;
        }
    }
}
