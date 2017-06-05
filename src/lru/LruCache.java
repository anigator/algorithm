package lru;

import java.util.HashMap;

public class LruCache {

	private int capacity;
	private HashMap<Integer, Node> lruCache = new HashMap();
	private Node head;
	private Node tail;
	
	public class Node {
		private int value;
		private Node pre;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
}
