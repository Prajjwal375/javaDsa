import java.util.*;

public class StackUQueue {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // push - O(1)
        public void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // pop - O(n)
        public int pop() {
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) break;
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();   // ✅ FIXED
                    if (q2.isEmpty()) break;
                    q1.add(top);
                }
            }

            return top;
        }

        // peek - O(n)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();   // ✅ FIXED
                    q1.add(top);
                }
            }

            return top;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}