package Hw9;

public class MyStack {
    private Object[] arrayStack;
    private int index;

    public MyStack(){
        arrayStack = new Object[10];
    }

    public Object[] getArrayStack() {
        // для зручності тестування
        return arrayStack;
    }

    void push(Object value){
        //add an element to tail
        if (arrayStack.length - index < 5 ){
            increaseSize();
            arrayStack[index++] = value;
        } else {
            arrayStack[index++] = value;
        }
    }
    private void increaseSize() {
        Object[] increasedAr = new Object[arrayStack.length + 5];
        System.arraycopy(arrayStack, 0, increasedAr, 0, arrayStack.length);
        arrayStack = increasedAr;
    }
    Object peek(){
        // return first (from ending) element
        return arrayStack[index - 1];
    }
    Object pop(){
        // return first (from ending) element and deletes it
        Object temp = arrayStack[index - 1];
        arrayStack[--index] = null;
        return temp;
    }
    void remove(int index){
        if(index >= 0 && index < this.index){
            // deletes an element at the index
            Object[] newArray = new Object[arrayStack.length  - 1];
            System.arraycopy(arrayStack, 0, newArray, 0, index);
            System.arraycopy(arrayStack,index + 1, newArray, index, arrayStack.length - index - 1);
            arrayStack = newArray;
            this.index--;
        }else{
            System.err.println("There is not the index you would like to remove ");
        }

    }
    void clear(){
        arrayStack = new Object[10];
        index = 0;
    }
    int size() {
        return index;
    }
}
