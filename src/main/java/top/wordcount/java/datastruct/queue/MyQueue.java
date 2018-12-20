package top.wordcount.java.datastruct.queue;

/**
 * 　队列（queue）是一种特殊的线性表，特殊之处在于它只允许在表的前端（front）进行删除操作，而在表的后端（rear）进行插入操作，和栈一样，队列是一种操作受限制的线性表。进行插入操作的端称为队尾，进行删除操作的端称为队头。队列中没有元素时，称为空队列。
 *
 * 　　队列的数据元素又称为队列元素。在队列中插入一个队列元素称为入队，从队列中删除一个队列元素称为出队。因为队列只允许在一端插入，在另一端删除，所以只有最早进入队列的元素才能最先从队列中删除，故队列又称为先进先出（FIFO—first in first out）线性表。
 *
 * 　　比如我们去电影院排队买票，第一个进入排队序列的都是第一个买到票离开队列的人，而最后进入排队序列排队的都是最后买到票的。
 *
 * 　　在比如在计算机操作系统中，有各种队列在安静的工作着，比如打印机在打印列队中等待打印。
 *
 * 　　队列分为：
 *
 * 　　①、单向队列（Queue）：只能在一端插入数据，另一端删除数据。
 *
 * 　　②、双向队列（Deque）：每一端都可以进行插入数据和删除数据操作。
 *
 * 　　这里我们还会介绍一种队列——优先级队列，优先级队列是比栈和队列更专用的数据结构，在优先级队列中，数据项按照关键字进行排序，关键字最小（或者最大）的数据项往往在队列的最前面，而数据项在插入的时候都会插入到合适的位置以确保队列的有序。
 *
 *   Java模拟单向队列实现
 *    ①、与栈不同的是，队列中的数据不总是从数组的0下标开始的，移除一些队头front的数据后，队头指针会指向一个较高的下标位置
 *    ②、我们再设计时，队列中新增一个数据时，队尾的指针rear 会向上移动，也就是向下标大的方向。移除数据项时，队头指针 front 向上移动。那么这样设计好像和现实情况相反，比如排队买电影票，队头的买完票就离开了，然后队伍整体向前移动。在计算机中也可以在队列中删除一个数之后，队列整体向前移动，但是这样做效率很差。我们选择的做法是移动队头和队尾的指针。
 *    ③、如果向第②步这样移动指针，相信队尾指针很快就移动到数据的最末端了，这时候可能移除过数据，那么队头会有空着的位置，然后新来了一个数据项，由于队尾不能再向上移动了，那该怎么办呢？
 *   为了避免队列不满却不能插入新的数据，我们可以让队尾指针绕回到数组开始的位置，这也称为“循环队列”。
 *
 */
public class MyQueue {
    private Object[] queArray;
    //队列总大小
    private int maxSize;
    //前端
    private int front;
    //后端
    private int rear;
    //队列中元素的实际数目
    private int nItems;

    public MyQueue(int s){
        maxSize = s;
        queArray = new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    //队列中新增数据
    public void insert(int value){
        if(isFull()){
            System.out.println("队列已满！！！");
        }else{
            //如果队列尾部指向顶了，那么循环回来，执行队列的第一个元素
            if(rear == maxSize -1){
                rear = -1;
            }
            //队尾指针加1，然后在队尾指针处插入新的数据
            queArray[++rear] = value;
            nItems++;
        }
    }

    //移除数据
    public Object remove(){
        Object removeValue = null ;
        if(!isEmpty()){
            removeValue = queArray[front];
            queArray[front] = null;
            front++;
            if(front == maxSize){
                front = 0;
            }
            nItems--;
            return removeValue;
        }
        return removeValue;
    }

    //查看对头数据
    public Object peekFront(){
        return queArray[front];
    }


    //判断队列是否满了
    public boolean isFull(){
        return (nItems == maxSize);
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return (nItems ==0);
    }

    //返回队列的大小
    public int getSize(){
        return nItems;
    }
}
