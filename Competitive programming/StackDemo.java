import java.util.ArrayList;
import java.util.EmptyStackException;
class Stack<T> {
    private ArrayList<T> stack;
    public Stack() {
        stack = new ArrayList<>();
    }
    public void push(T item) {
        stack.add(item);
    }
    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        int last = stack.size() - 1;
        T poppedItem = stack.get(last);
        stack.remove(last);
        return poppedItem;
    }
    public void display(){
        System.out.println(stack);
    }
}
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.println("Popped from intStack: " + intStack.pop());
        System.out.println("Popped from intStack: " + intStack.pop());
        intStack.display();
        Stack<Float> floatStack = new Stack<>();
        floatStack.push(1.5f);
        floatStack.push(2.5f);
        floatStack.push(3.5f);
        System.out.println("Popped from floatStack: " + floatStack.pop());
        System.out.println("Popped from floatStack: " + floatStack.pop());
        floatStack.display();
        Stack<Character> charStack = new Stack<>();
        charStack.push('A');
        charStack.push('B');
        charStack.push('C');
        System.out.println("Popped from charStack: " + charStack.pop());
        System.out.println("Popped from charStack: " + charStack.pop());
        charStack.display();
    }
}
