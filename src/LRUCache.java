import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCache {

    private Deque<Integer> deque;
    private Set<Integer> hashSet;
    private final int CACHE_SIZE;

    public LRUCache(int capacity) {
        deque = new LinkedList<Integer>();
        hashSet = new HashSet<Integer>();
        CACHE_SIZE = capacity;
    }

    public int get(int key) {
        return 0;
    }

    public void put(int key, int value) {
        if(!hashSet.contains(key) && deque.size() < CACHE_SIZE) {
            deque.add(value);
        }
    }

}
