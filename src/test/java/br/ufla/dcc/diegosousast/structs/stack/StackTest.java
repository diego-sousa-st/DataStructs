package br.ufla.dcc.diegosousast.structs.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {


    private Stack<Integer> stack;
    private Integer[] elements;

    @Before
    public void setUp() {
        this.stack = new Stack<>();
        this.elements = new Integer[10];
        for (int i = 0; i < 10; i++) {
            this.elements[i] = i;
        }
    }

    @Test
    public void push() {
        for (Integer element : this.elements) {
            this.stack.push(element);
        }

        assertEquals(new Integer(10), this.stack.size());
    }

    @Test
    public void pop() {
        for (Integer element : this.elements) {
            this.stack.push(element);
        }

        Integer topElement = this.stack.pop();
        assertEquals(new Integer(9), topElement);

        for (int i = 0; i < this.elements.length-1; i++) {
            this.stack.pop();
        }

        assertEquals(new Integer(0), this.stack.size());
    }

    @Test
    public void size() {
        assertEquals(new Integer(0), this.stack.size());

        for (int i = 0; i < 5; i++) {
            this.stack.push(this.elements[i]);
        }

        assertEquals(new Integer(5), this.stack.size());

        for (int i = 0; i < 5; i++) {
            this.stack.push(this.elements[i+5]);
        }

        assertEquals(new Integer(10), this.stack.size());

        for (int i = 0; i < this.elements.length; i++) {
            this.stack.pop();
        }

        assertEquals(new Integer(0), this.stack.size());
    }

    @Test
    public void isEmpty() {
        assertTrue(this.stack.isEmpty());

        for (int i = 0; i < 5; i++) {
            this.stack.push(this.elements[i]);
        }

        assertFalse(this.stack.isEmpty());

        for (int i = 0; i < 5; i++) {
            this.stack.push(this.elements[i+5]);
        }

        assertFalse(this.stack.isEmpty());

        for (int i = 0; i < this.elements.length; i++) {
            this.stack.pop();
        }

        assertTrue(this.stack.isEmpty());
    }
    
}