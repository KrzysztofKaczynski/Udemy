package linkedList;

import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class LinkedList
{

    public static void main(String[] args) {
        Deque<String> list = new java.util.LinkedList<>();

        list.addFirst("Orange");
        list.addFirst("Banana");
        list.addFirst("Grapefruit");

        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }
}
