import java.util.*;
public class LinkedListExample {
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.addLast(30);
        System.out.println("List after additions : "+list);
        list.remove();
        list.removeLast();
        System.out.println("List after removals : "+list);
    }
}
