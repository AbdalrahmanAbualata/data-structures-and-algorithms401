package stackAndQueue;


public class MaxStackk {
    Stack<Integer> stack;
    Stack<Integer> maxStack;
    public MaxStackk() {
        stack= new Stack<Integer>();
        maxStack = new Stack<Integer>();
    }
        public void push(int k) {
            if (maxStack.isEmpty()) {
                maxStack.push(k);
            } else if (k >= maxStack.peek()) {
                maxStack.push(k);
            }
            stack.push(k);
        }
    public int getMax() {
        if (!maxStack.isEmpty()) {
            return maxStack.peek();
        } else {
            return 0;
        }
    }
    }
