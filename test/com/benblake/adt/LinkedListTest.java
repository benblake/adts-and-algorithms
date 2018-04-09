package com.benblake.adt;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void emptyLinkedListReturnsNullForFirstElement() {
        LinkedList<Object> linkedList = new LinkedList<>();

        assertNull(linkedList.get(0));
    }

    @Test
    public void threeEntryLinkedListCreatedFromAddingReturnsCorrectNodeAndLengthData() {
        Integer data1 = new Integer(1);
        Integer data2 = new Integer(2);
        Integer data3 = new Integer(3);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(data1);
        linkedList.add(data2);
        linkedList.add(data3);

        assertEquals(data1, linkedList.get(0));
        assertEquals(data2, linkedList.get(1));
        assertEquals(data3, linkedList.get(2));
        assertEquals(null, linkedList.get(3));
        assertEquals(3, linkedList.getLength());
    }

    @Test
    public void threeEntryLinkedListCreatedFromInsertingReturnsCorrectNodeAndLengthData() {
        Integer data1 = new Integer(1);
        Integer data2 = new Integer(2);
        Integer data3 = new Integer(3);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insert(0, data1);
        linkedList.insert(0, data2);
        linkedList.insert(1, data3);

        assertEquals(data2, linkedList.get(0));
        assertEquals(data3, linkedList.get(1));
        assertEquals(data1, linkedList.get(2));
        assertEquals(null, linkedList.get(3));
        assertEquals(3, linkedList.getLength());
    }

    @Test
    public void deletingFirstEntryReturnsCorrectNodeAndLengthData() {
        Integer data1 = new Integer(1);
        Integer data2 = new Integer(2);
        Integer data3 = new Integer(3);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insert(0, data1);
        linkedList.insert(0, data2);
        linkedList.insert(1, data3);
        linkedList.delete(0);

        assertEquals(data3, linkedList.get(0));
        assertEquals(data1, linkedList.get(1));
        assertEquals(null, linkedList.get(2));
        assertEquals(2, linkedList.getLength());
    }

    @Test
    public void deletingMiddleEntryReturnsCorrectNodeAndLengthData() {
        Integer data1 = new Integer(1);
        Integer data2 = new Integer(2);
        Integer data3 = new Integer(3);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insert(0, data1);
        linkedList.insert(0, data2);
        linkedList.insert(1, data3);
        linkedList.delete(1);

        assertEquals(data2, linkedList.get(0));
        assertEquals(data1, linkedList.get(1));
        assertEquals(null, linkedList.get(2));
        assertEquals(2, linkedList.getLength());
    }

    @Test
    public void deletingLastEntryReturnsCorrectNodeAndLengthData() {
        Integer data1 = new Integer(1);
        Integer data2 = new Integer(2);
        Integer data3 = new Integer(3);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insert(0, data1);
        linkedList.insert(0, data2);
        linkedList.insert(1, data3);
        linkedList.delete(2);

        assertEquals(data2, linkedList.get(0));
        assertEquals(data3, linkedList.get(1));
        assertEquals(null, linkedList.get(2));
        assertEquals(2, linkedList.getLength());
    }

    @Test
    public void tryingToDeleteOffEndReturnsCorrectNodeAndLengthData() {
        Integer data1 = new Integer(1);
        Integer data2 = new Integer(2);
        Integer data3 = new Integer(3);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insert(0, data1);
        linkedList.insert(0, data2);
        linkedList.insert(1, data3);
        linkedList.delete(3);

        assertEquals(data2, linkedList.get(0));
        assertEquals(data3, linkedList.get(1));
        assertEquals(data1, linkedList.get(2));
        assertEquals(null, linkedList.get(3));
        assertEquals(3, linkedList.getLength());
    }
}