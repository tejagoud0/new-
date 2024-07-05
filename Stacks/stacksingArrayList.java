package Stacks;

import java.util.ArrayList;

public class stacksingArrayList {
    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static Boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int last = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return last;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!stack.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
