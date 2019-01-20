package com.johnturkson.hybridlist;

public class Node<T> {
    private Element<T> value;
    private Node<T> previous;
    private Node<T> next;
    
    public Node(Element<T> value, Node<T> previous, Node<T> next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }
    
    public Element<T> getValue() {
        return value;
    }
    
    public void setValue(Element<T> value) {
        this.value = value;
    }
    
    public Node<T> getPrevious() {
        return previous;
    }
    
    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }
    
    public Node<T> getNext() {
        return next;
    }
    
    public void setNext(Node<T> next) {
        this.next = next;
    }
}
