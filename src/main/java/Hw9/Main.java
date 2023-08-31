package Hw9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[2];
        strArray[0] = "one";
        strArray[1] = "two";

        Integer[] intArray = new Integer[5];
        intArray[0] = 0;
        intArray[1] = 1;
        intArray[2] = 2;
        intArray[3] = 3;
        intArray[4] = 4;




        MyArrayList myArrayList = new MyArrayList(intArray);
        System.out.println(Arrays.toString(myArrayList.getArray()) + " - getter()");

        myArrayList.add("17");
        System.out.println(Arrays.toString(myArrayList.getArray()) + " - add()");

        myArrayList.remove(1);
        System.out.println(Arrays.toString(myArrayList.getArray()) + " - remove()");

        System.out.println(myArrayList.get(2) + " - get() element at the index");

        myArrayList.clear();
        System.out.println(Arrays.toString(myArrayList.getArray()) + " - clear()");

        System.out.println(myArrayList.size() + " - size()");





    }
}
