package com.demo;

/*
定义一个节点类型
 */
public class Node<T> {

    private T value;
    private Node next;

    public Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }
}
