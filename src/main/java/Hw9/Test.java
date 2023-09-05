package Hw9;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Test {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        List<Integer> objects = new ArrayList<>();
        objects.add(15);
        objects.add(16);
        objects.add(17);
        objects.add(18);
        objects.add(19);
        objects.add(20);
        objects.add(21);
        objects.add(22);
        try {
            objects.remove(8);

        } catch (IndexOutOfBoundsException ex){
            System.out.printf("you should chose the index between 0 - %s",objects.size()-1);
        }



    }

}
