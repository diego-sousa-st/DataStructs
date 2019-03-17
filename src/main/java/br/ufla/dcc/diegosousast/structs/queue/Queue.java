package br.ufla.dcc.diegosousast.structs.queue;

public class Queue<T> {

    private Integer size;
    private QueueNode<T> head;
    private QueueNode<T> tail;

    Queue() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void enqueue(T element) {
        if(this.size == Integer.MAX_VALUE) {
            String INTEGER_MAX_VALUE_EXCEPTION = "The size of the queue is the maximum value allowed: " + Integer.MAX_VALUE;
            throw new UnsupportedOperationException(INTEGER_MAX_VALUE_EXCEPTION);
        }
        QueueNode<T> newTail = new QueueNode<>(element, null);
        if(this.tail != null) {
            this.tail.setPointerToNextElement(newTail);
        }
        if(this.head == null) {
            this.head = newTail;
        }
        this.tail = newTail;
        this.size++;
    }

    public T dequeue() {
        if(this.isEmpty()) {
            String EMPTY_QUEUE = "The queue is empty";
            throw new UnsupportedOperationException(EMPTY_QUEUE);
        }
        T element = this.head.getElement();
        this.head = this.head.getPointerToNextElement();
        this.size--;
        return element;
    }

    public Integer size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.head == null;
    }
}
