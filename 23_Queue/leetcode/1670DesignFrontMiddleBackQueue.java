/// My own solution

class FrontMiddleBackQueue {
    int size = 0;
    Deque<Integer> dq;
    Deque<Integer> st;

    public FrontMiddleBackQueue() {
        dq = new ArrayDeque<>();
        st = new ArrayDeque<>();
    }

    public void pushFront(int val) {
        dq.addFirst(val);
        size++;
    }

    public void pushMiddle(int val) {
        int mid = size / 2;

        while (mid > 0) {
            st.addLast(dq.pollFirst());
            mid--;
        }

        dq.addFirst(val);

        while (!st.isEmpty()) {
            dq.addFirst(st.pollLast());
        }

        size++;
    }

    public void pushBack(int val) {
        dq.addLast(val);
        size++;
    }

    public int popFront() {
        if (dq.isEmpty())
            return -1;

        size--;
        return dq.pollFirst();
    }

    public int popMiddle() {
        if (dq.isEmpty())
            return -1;

        // Left middle when even
        int mid = (size - 1) / 2;

        while (mid > 0) {
            st.addLast(dq.pollFirst());
            mid--;
        }

        int ans = dq.pollFirst();

        while (!st.isEmpty()) {
            dq.addFirst(st.pollLast());
        }

        size--;
        return ans;
    }

    public int popBack() {
        if (dq.isEmpty())
            return -1;

        size--;
        return dq.pollLast();
    }
}



// O(1) optimal using left and right
class FrontMiddleBackQueue {
    Deque<Integer> left, right;

    public FrontMiddleBackQueue() {
        left = new ArrayDeque<>();
        right = new ArrayDeque<>();
    }

    private void balance() {
        if (left.size() > right.size() + 1) {
            right.addFirst(left.pollLast());
        } else if (left.size() < right.size()) {
            left.addLast(right.pollFirst());
        }
    }

    public void pushFront(int val) {
        left.addFirst(val);
        balance();
    }

    public void pushMiddle(int val) {
        if (left.size() > right.size()) {
            right.addFirst(left.pollLast());
        }
        left.addLast(val);
    }

    public void pushBack(int val) {
        right.addLast(val);
        balance();
    }

    public int popFront() {
        if (left.isEmpty() && right.isEmpty()) return -1;

        int val = left.isEmpty() ? right.pollFirst() : left.pollFirst();
        balance();
        return val;
    }

    public int popMiddle() {
        if (left.isEmpty() && right.isEmpty()) return -1;

        int val = left.pollLast();
        balance();
        return val;
    }

    public int popBack() {
        if (left.isEmpty() && right.isEmpty()) return -1;

        int val = right.isEmpty() ? left.pollLast() : right.pollLast();
        balance();
        return val;
    }
}