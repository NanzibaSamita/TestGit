import java.util.Stack;

class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        mainStack.push(value);

        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }


    public void pop() {

        if (!mainStack.isEmpty()) {
            int poppedValue = mainStack.pop();
            if (poppedValue == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int min() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new IllegalStateException("Stack is empty");
    }

    public static void main(String[] args) {
        // Test Case 1
        MinStack stack1 = new MinStack();
        stack1.push(3);
        stack1.push(2);
        stack1.push(5);
        stack1.push(1);
        System.out.println("Test Case 1: " + (stack1.min() == 1));  // Expected Output: true


        MinStack stack2 = new MinStack();
        stack2.push(3);
        stack2.push(2);
        stack2.push(5);
        stack2.push(1);
        stack2.pop(); // Pop 1
        System.out.println("Test Case 2: " + (stack2.min() == 2));  // Expected Output: true

       
        MinStack stack3 = new MinStack();
        stack3.push(1);
        stack3.push(2);
        stack3.push(3);
        stack3.push(4);
        System.out.println("Test Case 3: " + (stack3.min() == 1));  // Expected Output: true
    }
}
