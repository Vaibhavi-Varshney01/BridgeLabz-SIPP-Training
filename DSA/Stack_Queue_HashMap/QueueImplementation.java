package DSA.Stack_Queue_HashMap;
import java.util.Stack;

class QueueUsingStacks<T> {
    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();
 
    public void enqueue(T data) {
        stack1.push(data);
        System.out.println("✅ Enqueued: " + data);
    }

    
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("❌ Queue is empty!");
            return null;
        }

      
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();  
    }


    public T peek() {
        if (isEmpty()) {
            System.out.println("❌ Queue is empty!");
            return null;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

     
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

public class QueueImplementation {
    public static void main(String[] args) {
        QueueUsingStacks<Integer> q = new QueueUsingStacks<>();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front: " + q.peek());  // Should show 10

        System.out.println("Dequeued: " + q.dequeue()); // Removes 10
        System.out.println("Dequeued: " + q.dequeue()); // Removes 20

        q.enqueue(40);

        System.out.println("Front: " + q.peek()); // Should show 30
        System.out.println("Dequeued: " + q.dequeue()); // Removes 30
        System.out.println("Dequeued: " + q.dequeue()); // Removes 40

        System.out.println("Dequeued: " + q.dequeue()); // Queue empty
    }
}
