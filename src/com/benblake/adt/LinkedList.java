package com.benblake.adt;

public class LinkedList<T> {

    private int mLength;
    private Node<T> mRootNode;
    private Node<T> mEndNode;

    public T get(int index) {
        if (index >= mLength) {
            return null;
        }

        Node<T> temp = mRootNode;
        for (int i = 0; i < index; i++) {
            temp = temp.getNextNode();
        }
        return temp.getData();
    }

    public void add(T data) {
        if (mLength == 0) {
            mRootNode = new Node<>(data);
            mEndNode = mRootNode;
        } else {
            mEndNode.setNextNode(new Node<>(data));
            mEndNode = mEndNode.getNextNode();
        }
        mLength++;
    }

    public void insert(int index, T data) {
        if (index == 0) {
            mRootNode = new Node<>(data, mRootNode);
            mLength++;
        } else if (index <= mLength) {
            Node<T> temp = mRootNode;
            for (int i = 0; i < (index - 1); i++) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(new Node<>(data, temp.getNextNode()));
            mLength++;
        }
    }

    public void delete(int index) {
        if (index == 0) {
            mRootNode = mRootNode.getNextNode();
            mLength--;
        } else if (index < mLength) {
            Node<T> temp = mRootNode;
            for (int i = 0; i < (index - 1); i++) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(temp.getNextNode().getNextNode());
            mLength--;
        }
    }

    public int getLength() {
        return mLength;
    }
}
