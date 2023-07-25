package Queue.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class DisplayLinkedList {

    public static void display(){

        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println(linkedList);

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        System.out.println(linkedList);

        linkedList.addFirst("Pineapple");
        System.out.println(linkedList);

        linkedList.addLast("Litchi");
        System.out.println(linkedList);


        Iterator<String> iterator = linkedList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator);
        }

    }

    public static void main(String[] args) {
        DisplayLinkedList.display();
    }

}
