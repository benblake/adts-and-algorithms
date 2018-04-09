package com.benblake.adt;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
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
}