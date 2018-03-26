package com.benblake.adt;

import org.junit.Test;

import static com.benblake.adt.LinkedList.*;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void nodeConstructorTakesGeneralObjectDataAndDefaultsNextNodeToNull() {
        Object data = new Object();
        Node<Object> node = new Node<>(data);

        assertEquals(data, node.getData());
        assertEquals(null, node.getNextNode());
    }

    @Test
    public void alternateNodeConstructorTakesPointerToNextNode() {
        Object data = new Object();
        Node<Object> nextNode = new Node<>(data);
        Node<Object> node = new Node<>(data, nextNode);

        assertEquals(nextNode, node.getNextNode());
    }

    @Test
    public void settingNextNodeSetsCorrectly() {
        Object data1 = new Object();
        Object data2 = new Object();
        Node<Object> node = new Node<>(data1);
        Node<Object> nextNode = new Node<>(data2);
        node.setNextNode(nextNode);

        assertEquals(nextNode, node.getNextNode());
    }

    @Test
    public void nodeCannotEqualObjectOfDifferentType() {
        Object data = new Object();
        Node<Object> node = new Node<>(data);

        assertNotEquals(node, data);
    }

    @Test
    public void nodeCannotEqualObjectOfDifferentGenericType() {
        Integer integerData = new Integer(6);
        Float floatData = new Float(6);
        Node<Integer> integerNode = new Node<>(integerData);
        Node<Float> floatNode = new Node<>(floatData);

        assertNotEquals(integerNode, floatNode);
    }

    @Test
    public void nodeEqualsNodeWithSameDataAndNextNode() {
        Integer integerData1 = new Integer(6);
        Integer integerData2 = new Integer(6);
        Node<Integer> integerNode1 = new Node<>(integerData1);
        Node<Integer> integerNode2 = new Node<>(integerData1, integerNode1);
        Node<Integer> integerNode3 = new Node<>(integerData2, integerNode1);

        assertEquals(integerNode2, integerNode3);
    }

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
}