package Hw9;

import java.util.Queue;

public class MyQueue {
    private Object[] arrayQu;
    private int index;

    public Object[] getArrayQu() {
        // для зручності тестування
        return arrayQu;
    }
    public MyQueue(){
        arrayQu = new Object[10];
    }
    void add(Object value){
        if (arrayQu.length - index < 5 ){
            increaseSize();
            arrayQu[index++] = value;
        } else {
            arrayQu[index++] = value;
        }
    }
    private void increaseSize() {
        Object[] increasedAr = new Object[arrayQu.length + 5];
        System.arraycopy(arrayQu, 0, increasedAr, 0, arrayQu.length);
    }
    Object peek(){
        return arrayQu[0];
    }
    Object poll(){
        if(arrayQu[0] != null){
            Object temp = arrayQu[0];
            Object[] croppedAr = new Object[arrayQu.length];
            System.arraycopy(arrayQu, 1, croppedAr, 0, arrayQu.length - 1);
            arrayQu = croppedAr;
            index--;
            return temp;
        }else {
            return null;
        }
    }
    void clear(){
        arrayQu = new Object[10];
        index = 0;
    }
    int size(){
        return index;
    }
}
