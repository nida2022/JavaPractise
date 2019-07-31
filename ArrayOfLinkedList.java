package base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayOfLinkedList {
    public static void main(String args[]) {


        List<LinkedList<Integer>> ll = new ArrayList<>();

       
        for(int i = 0;i <4;i++){
            ll.add(new LinkedList<Integer>());
        }
        ll.get(0).add(1);
        ll.get(0).add(2);
        ll.get(1).add(0);
        ll.get(1).add(2);
        System.out.println(ll);
    }
}
