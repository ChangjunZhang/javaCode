package top.wordcount.java.datastruct.queue;

/**
 * 　优先级队列（priority queue）是比栈和队列更专用的数据结构，在优先级队列中，数据项按照关键字进行排序，关键字最小（或者最大）的数据项往往在队列的最前面，而数据项在插入的时候都会插入到合适的位置以确保队列的有序。
 *
 * 　　优先级队列 是0个或多个元素的集合，每个元素都有一个优先权，对优先级队列执行的操作有：
 *
 * 　　（1）查找
 *
 * 　　（2）插入一个新元素
 *
 * 　　（3）删除
 *
 * 　　一般情况下，查找操作用来搜索优先权最大的元素，删除操作用来删除该元素 。对于优先权相同的元素，可按先进先出次序处理或按任意优先权进行。
 *
 * 　　这里我们用数组实现优先级队列，这种方法插入比较慢，但是它比较简单，适用于数据量比较小并且不是特别注重插入速度的情况。
 *
 * 　　后面我们会讲解堆，用堆的数据结构来实现优先级队列，可以相当快的插入数据。
 *
 * 　　数组实现优先级队列，声明为int类型的数组，关键字是数组里面的元素，在插入的时候按照从大到小的顺序排列，也就是越小的元素优先级越高。
 *
 *    insert() 方法，先检查队列中是否有数据项，如果没有，则直接插入到下标为0的单元里，否则，从数组顶部开始比较，找到比插入值小的位置进行插入，并把 nItems 加1.
 *
 * 　　remove 方法直接获取顶部元素。
 *
 * 　　优先级队列的插入操作需要 O(N)的时间，而删除操作则需要O(1) 的时间，后面会讲解如何通过 堆 来改进插入时间。
 */
public class PriorityQueue {
    private int maxSize;
    private int[] priQueArray;
    private int nItems;

    public PriorityQueue(int s){
        maxSize = s;
        priQueArray = new int[maxSize];
        nItems = 0;
    }

    //插入数据
    public void insert(int value){
        int j;
        if(nItems == 0){
            priQueArray[nItems++] = value;
        }else{
            j = nItems -1;
            //选择的排序方法是插入排序，按照从大到小的顺序排列，越小的越在队列的顶端
            while(j >=0 && value > priQueArray[j]){
                priQueArray[j+1] = priQueArray[j];
                j--;
            }
            priQueArray[j+1] = value;
            nItems++;
        }
    }

    //移除数据,由于是按照大小排序的，所以移除数据我们指针向下移动
    //被移除的地方由于是int类型的，不能设置为null，这里的做法是设置为 -1
    public int remove(){
        int k = nItems -1;
        int value = priQueArray[k];
        priQueArray[k] = -1;//-1表示这个位置的数据被移除了
        nItems--;
        return value;
    }

    //查看优先级最高的元素
    public int peekMin(){
        return priQueArray[nItems-1];
    }

    //判断是否为空
    public boolean isEmpty(){
        return (nItems == 0);
    }

    //判断是否满了
    public boolean isFull(){
        return (nItems == maxSize);
    }
}
