import java.util.*;
public class QueueCollection {

    public static void main(String args[]) {
        //Queue q = new Queue();
        Queue<Integer> q = new LinkedList<>(); // ArrayQueue
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}