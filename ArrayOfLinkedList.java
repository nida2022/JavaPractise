package base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayOfLinkedList {
    public static void main(String args[]) {




        List<Integer> l[] = new LinkedList[5];

        for(int i = 0;i <4;i++){
            l[i]= new LinkedList<Integer>();
        }

        l[0].add(1);
        l[0].add(2);
        l[1].add(0);
        l[1].add(2);

        for(int i = 0;i<4;i++) {
            System.out.print (l[i]);
        }
        //2nd way
        List<LinkedList<Integer>> ll = new ArrayList<>();
        for(int i = 0;i <4;i++){
            ll.add(new LinkedList<Integer>());
        }

        ll.get(0).add(1);
        ll.get(0).add(2);
        ll.get(1).add(0);
        ll.get(1).add(2);
        System.out.println();
        System.out.println(ll);
    }
}
