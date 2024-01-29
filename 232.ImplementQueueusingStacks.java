import java.util.Stack;

public class ImplementQueueusingStacks 
{
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    public ImplementQueueusingStacks () 
    {
        
    }
    
    public void push(int x)
    {
        //Move all elements from stack1 to stack2
        while(!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
        //push item into stack1
        stack1.push(x);

        //push everything back to stack1
       while(!stack2.isEmpty())
       {
           stack1.push(stack2.pop());
           //Stack2.pop()
       } 
    }
    
    public int pop() 
    {
        return stack1.pop();
    }
    //return top to stack1
    public int peek() 
    {
        return stack1.peek();
    }
    
    public boolean empty() 
    {
        return stack1.isEmpty();
    }
    public static void main(String[] args)
    {
        ImplementQueueusingStacks obj = new ImplementQueueusingStacks();

        // Push elements into the queue
        obj.push(1);
        obj.push(2);
        obj.push(3);

        // Peek at the front element
        System.out.println("Front element: " + obj.peek());

        // Pop elements from the queue
        System.out.println("Popped element: " + obj.pop());
        System.out.println("Popped element: " + obj.pop());

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + obj.empty());

        // Push more elements into the queue
        obj.push(4);
        obj.push(5);

        // Pop remaining elements from the queue
        System.out.println("Popped element: " + obj.pop());
        System.out.println("Popped element: " + obj.pop());

        // Check if the queue is empty after popping all elements
        System.out.println("Is the queue empty? " + obj.empty());
    }
}
