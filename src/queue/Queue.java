package queue;

import stack.Stack;

public class Queue<T> {

	private Stack<T> inputQueue;
	private Stack<T> outputQueue;
	
	public Queue(int size) {
		inputQueue = new Stack<>(size);
		outputQueue = new Stack<>(size);
	}
	
	public void push(T inputValue) {
		inputQueue.push(inputValue);
	}
	
	public T pop() {
		if (outputQueue.isEmpty()) {
			copyQueue();
		}
		return outputQueue.pop();
	}
	
	public void copyQueue() {
		while (!inputQueue.isEmpty()) {
			outputQueue.push(inputQueue.pop());
		}
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>(10);
		
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		
	}
}
