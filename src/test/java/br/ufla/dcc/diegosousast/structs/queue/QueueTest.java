package br.ufla.dcc.diegosousast.structs.queue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class QueueTest {

    private Queue<Integer> queue;
    private Integer[] elements;

    @Before
    public void setUp() {
        this.queue = new Queue<>();
        this.elements = new Integer[10];
        for (int i = 0; i < 10; i++) {
            this.elements[i] = i;
        }
    }

    @Test
    public void enqueue() {
        for (Integer element : this.elements) {
            this.queue.enqueue(element);
        }

        assertEquals(new Integer(10), this.queue.size());
    }

    @Test
    public void dequeue() {
        for (Integer element : this.elements) {
            this.queue.enqueue(element);
        }

        Integer headElement = this.queue.dequeue();
        assertEquals(new Integer(0), headElement);

        for (int i = 0; i < this.elements.length-1; i++) {
            this.queue.dequeue();
        }

        assertEquals(new Integer(0), this.queue.size());
    }

    @Test
    public void size() {
        assertEquals(new Integer(0), this.queue.size());

        for (int i = 0; i < 5; i++) {
            this.queue.enqueue(this.elements[i]);
        }

        assertEquals(new Integer(5), this.queue.size());

        for (int i = 0; i < 5; i++) {
            this.queue.enqueue(this.elements[i+5]);
        }

        assertEquals(new Integer(10), this.queue.size());

        for (int i = 0; i < this.elements.length; i++) {
            this.queue.dequeue();
        }

        assertEquals(new Integer(0), this.queue.size());
    }

    @Test
    public void isEmpty() {
        assertTrue(this.queue.isEmpty());

        for (int i = 0; i < 5; i++) {
            this.queue.enqueue(this.elements[i]);
        }

        assertFalse(this.queue.isEmpty());

        for (int i = 0; i < 5; i++) {
            this.queue.enqueue(this.elements[i+5]);
        }

        assertFalse(this.queue.isEmpty());

        for (int i = 0; i < this.elements.length; i++) {
            this.queue.dequeue();
        }

        assertTrue(this.queue.isEmpty());
    }
}