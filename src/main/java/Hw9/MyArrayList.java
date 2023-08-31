package Hw9;

public class MyArrayList {
    private Object[] array;

    public MyArrayList(){}
    public MyArrayList(Object[]array){
        this.array = array;
    }
    public Object[] getArray() {
        return array;
    }

    void add(Object value){
        sizeArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null){
                array[i] = value;
                break;
            }
        }
    }
//    проверка размера и увеличение
    private void sizeArray() {
        float coefficient = 1.5f;
        if(array[array.length - 1] != null ){
            Object[] biggerArray = new Object[(int) (array.length * coefficient)];
            for (int i = 0; i < array.length; i++) {
                biggerArray[i] = array [i];
            }
            array = biggerArray;
        }
    }

    void remove(int index){
        array[index] = null;
        Object[] tempArray = new Object[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!= null){
                tempArray[j] = array[i];
                j++;
            }
        }
        array = tempArray;
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
