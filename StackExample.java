import java.util.Stack;
public class StackExample 
{
    public static void main(String[] args) 
     {
        Stack<Integer> stack = new Stack<Integer>();
        // Push elements onto the stack
        stack.push(10);         stack.push(20);        stack.push(30);
        // View top element
        System.out.println("Top element: " + stack.peek()); // 30
        // Remove elements
        System.out.println("Popped element: " + stack.pop()); // 30
        System.out.println("Popped element: " + stack.pop()); // 20
        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); 
// false     
    } 
}