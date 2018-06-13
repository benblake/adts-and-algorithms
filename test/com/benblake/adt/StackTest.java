package com.benblake.adt;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void popOnEmptyStackReturnsNull() {
        Stack<Object> stack = new Stack<>();

        assertNull(stack.pop());
    }

    @Test
    public void popOnOneEntryStackReturnsEntryThenNull() {
        Stack<Object> stack = new Stack<>();
        stack.push(new Integer(5));

        assertEquals(5, stack.pop());
        assertNull(stack.pop());
    }

    @Test
    public void popOnTwoEntryStackReturnsEntriesThenNull() {
        Stack<Object> stack = new Stack<>();
        stack.push(new Integer(5));
        stack.push(new Integer(6));

        assertEquals(6, stack.pop());
        assertEquals(5, stack.pop());
        assertNull(stack.pop());
    }

    @Test
    public void peekOnEmptyStackReturnsNull() {
        Stack<Object> stack = new Stack<>();

        assertNull(stack.peek());
    }

    @Test
    public void peekOnOneEntryStackReturnsEntryThenNull() {
        Stack<Object> stack = new Stack<>();
        stack.push(new Integer(5));

        assertEquals(5, stack.peek());
        assertEquals(5, stack.pop());
    }

}