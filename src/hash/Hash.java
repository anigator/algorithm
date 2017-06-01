package hash;

public class Hash<K, V> {

	private int size;
	private Entry<K, V>[] hashTable;
	
	@SuppressWarnings("unchecked")
	public Hash(int size) {
		this.size = size;
		hashTable = new Entry[size];
	}
	
	public static class Entry<K, V> {
		
		private K key;
		private V value;
		private Entry<K, V> next;
		
		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
	
	public int hashFunction(K key) {
		return 31 * 17 + key.hashCode();
	}
	
	public int getIndex(K key) {
		return hashFunction(key) % this.size;
	}
	
	public void put(K key, V value) {
		int index = getIndex(key);
		Entry<K, V> entry = hashTable[index];
		
		if (entry == null) {
			hashTable[index] = new Entry<>(key, value);
		} else {
			while (entry.key != key) {
				if (entry.next == null) {
					entry.next = new Entry<>(key, value);
					break;
				}
				entry = entry.next;
			}
			
			if (entry.key == key) {
				entry.value = value;
			}
		}
	}
	
	public V get(K key) {
		int index = getIndex(key);
		Entry<K, V> entry = hashTable[index];
		
		while (entry != null) {
			if (entry.key == key) {
				return entry.value;
			}
			entry = entry.next;
		}
		return null;
	}
	
	public static void main(String[] args) {
		int size = 10;
		Hash<Integer, String> hash = new Hash<>(size);
		
		hash.put(3, "1");
		hash.put(3, "4");
		hash.put(9, "9");
		hash.put(1, "1");
		hash.put(31, "31");
		hash.put(15, "15");
		hash.put(30, "30");
		hash.put(29, "29");
		
		for (int i=0; i < size; i++) {
			if (hash.hashTable[i] != null) {
				Entry<Integer, String> entry = hash.hashTable[i];
				System.out.print(entry.value);
				while(entry.next != null) {
					entry = entry.next;
					System.out.print("," + entry.value);
				}
				System.out.println();
			}
		}
	}
}
