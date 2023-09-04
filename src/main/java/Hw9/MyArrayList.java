package Hw9;

public class MyArrayList {
    private Object[] array;
    public MyArrayList(){
        array = new Object[0];
    }

    public Object[] getArray() {

        return array;
    }

    void add(Object value){
        Object[] newArray = new Object[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = value;
        array = newArray;
    }
    void remove(int index){

        Object[] newArray = new Object[array.length - 1];

        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index -1 );

        array = newArray;
    }
    void clear(){
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    int size(){

        return array.length;
    }

    Object get(int index){
        return array[index];
    }





}
