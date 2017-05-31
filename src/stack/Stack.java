package stack;

public class Stack<T> {

	private int size;
	private int top;
	private T[] stackArray;
	
	@SuppressWarnings("unchecked")
	public Stack(int size) {
		this.size = size;
		this.top = -1;
		stackArray = (T[]) new Object[size];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return (size - 1) == top; 
	}
	
	public void push(T input) {
		if (isFull()) {
			System.out.println("stack is full");
			return;
		}
		stackArray[++top] = input;
	}
	
	public T pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return null;
		}
		return stackArray[top--];
	}
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(5);
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}
}
