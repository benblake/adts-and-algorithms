package com.benblake.adt;

public class LinkedList {



    public static class Node<T> {
        private T mData;
        private Node<T> mNextNode;

        public Node(T data) {
            mData = data;
        }

        public Node(T data, Node<T> nextNode) {
            mData = data;
            mNextNode = nextNode;
        }

        public T getData() {
            return mData;
        }

        public Node<T> getNextNode() {
            return mNextNode;
        }

        @Override
        public boolean equals(Object other) {
            if (other instanceof Node<?>) {
                Node<?> otherNode = (Node<?>) other;

                if (!otherNode.mData.equals(mData)) {
                    return false;
                }

                if (otherNode.mNextNode == null) {
                    return mNextNode == null;
                }

                return otherNode.mData.equals(mData) && otherNode.mNextNode.equals(mNextNode);
            }
            return false;
        }
    }
}
