package com.benblake.adt;

public class Stack<T> {

    private int mLength = 0;
    private Node<T> mRootNode;

    public T pop() {
        if (mLength == 0) {
            return null;
        }

        T data = mRootNode.getData();
        mRootNode = mRootNode.getNextNode();
        mLength--;
        return data;
    }

    public T peek() {
        if (mLength == 0) {
            return null;
        }

        return mRootNode.getData();
    }

    public void push(T data) {
        mRootNode = new Node<>(data, mRootNode);
        mLength++;
    }
}
