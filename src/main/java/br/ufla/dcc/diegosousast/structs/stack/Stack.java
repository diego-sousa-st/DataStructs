package br.ufla.dcc.diegosousast.structs.stack;

public class Stack<T> {

    private Integer size;
    private StackNode<T> top;

    Stack() {
        this.size = 0;
        this.top = null;
    }

    public void push(T element) {
        if(this.size == Integer.MAX_VALUE) {
            String INTEGER_MAX_VALUE_EXCEPTION = "The size of the stack is the maximum value allowed: " + Integer.MAX_VALUE;
            throw new UnsupportedOperationException(INTEGER_MAX_VALUE_EXCEPTION);
        }
        this.top = new StackNode<>(element, this.top);
        this.size++;
    }

    public T pop() {
        if(this.isEmpty()) {
            String EMPTY_STACK = "The stack is empty";
            throw new UnsupportedOperationException(EMPTY_STACK);
        }

        StackNode<T> newTop = this.top.getPointerToNextElement();
        T element = this.top.getElement();
        this.top = newTop;
        this.size--;
        return element;
    }

    public Integer size() {
        return this.size;
    }

    public Boolean isEmpty() {
        return this.top == null;
    }

}
