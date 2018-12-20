package top.wordcount.java.datastruct.queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(10);
        priorityQueue.insert(4);
        priorityQueue.insert(5);
        System.out.println( priorityQueue.peekMin());
        priorityQueue.insert(3);
        System.out.println( priorityQueue.peekMin());
        priorityQueue.insert(2);

        System.out.println( priorityQueue.peekMin());
        int remove = priorityQueue.remove();
        int peekMin = priorityQueue.peekMin();
        System.out.println("remove="+remove+"|peekMin="+peekMin);
    }
}
