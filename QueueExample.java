import java.util.*;
public class QueueExample {
    public static void main(String args[]){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        int removed = queue.remove();
        int front = queue.peek();
        boolean empty = queue.isEmpty();
        int size = queue.size();
        System.out.println(queue);
    }
}
