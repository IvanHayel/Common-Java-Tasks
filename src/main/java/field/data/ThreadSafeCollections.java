package field.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TransferQueue;

public class ThreadSafeCollections {
  private static final int CAPACITY = 10;

  public static void main(String[] args) {
    // ArrayList, LinkedList
    List<Object> safeListFirst = new CopyOnWriteArrayList<>();
    List<Object> safeListSecond = new Vector<>();

    // HashSet, TreeSet, LinkedHashSet, BitSet, EnumSet
    Set<Object> safeSetFirst = new ConcurrentSkipListSet<>();
    Set<Object> safeSetSecond = new CopyOnWriteArraySet<>();

    // HashMap, TreeMap, LinkedHashMap, IdentityHashMap, WeakHashMap, EnumMap
    Map<Object, Object> safeMapFirst = new ConcurrentHashMap<>();
    Map<Object, Object> safeMapSecond = new ConcurrentSkipListMap<>();
    Map<Object, Object> safeMapThird = new Hashtable<>();

    // ArrayDeque, PriorityQueue
    Queue<Object> safeQueueFirst = new ArrayBlockingQueue<>(CAPACITY);
    Queue<Object> safeQueueSecond = new ConcurrentLinkedQueue<>();
    Deque<Object> safeQueueThird = new ConcurrentLinkedDeque<>();
    Queue<Object> safeQueueFourth = new LinkedBlockingQueue<>();
    Deque<Object> safeQueueFifth = new LinkedBlockingDeque<>();
    TransferQueue<Object> safeQueueSixth = new LinkedTransferQueue<>();
    Queue<Object> safeQueueSeventh = new PriorityBlockingQueue<>();
    Queue<Object> safeQueueEighth = new SynchronousQueue<>();
    BlockingQueue<Object> safeQueueNinth = new DelayQueue();
    Stack<Object> safeQueueTenth = new Stack<>();

    //Any
    Collection<Object> safeCollectionFirst = Collections.synchronizedCollection(new ArrayList<>());
    Collection<Object> safeCollectionSecond = Collections.synchronizedSet(new HashSet<>());
    Map<Object, Object> safeCollectionThird = Collections.synchronizedMap(new HashMap<>());
    Collection<Object> safeCollectionFourth = Collections.synchronizedList(new ArrayList<>());
  }
}
