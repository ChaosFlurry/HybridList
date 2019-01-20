package com.johnturkson.hybridlist;


public class HybridList<T> {
    private Node<T> head;
    private Node<T> tail;
    
    public HybridList() {
        head = null;
        tail = null;
    }
    
    public HybridList(T value) {
        Element<T> e = new Element<>(value);
        head = new Node<>(e, null, null);
        tail = new Node<>(e, null, null);
        head.setNext(tail);
        tail.setPrevious(head);
    }
    
    public Node<T> get(int index) {
        int i = 0;
        Node<T> current = head;
        while (i < index) {
            current = current.getNext();
            i++;
        }
        return current.getNext();
    }
    
    public void set(int index, T value) {
        Element<T> e = get(index).getValue();
        T reference = e.deference();
        reference = value;
    }
    
    public int length() {
        int length = 0;
        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
            length++;
        }
        return length;
    }
    
    public void insert(int index, Node<T> node) {
        
    }
    
    public void add(Node<T> node) {
        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
        node.setPrevious(current);
        node.setNext(head);
        head.setPrevious(node);
        
        // with tail:
        //tail.setNext(node);
        //node.setNext(head);
        //node.setPrevious(tail);
        //head.setPrevious(node);
    }
    
    public void remove(int index) {
        // navigate to the index (using get())
        Node<T> current = get(index);
        Node<T> previous = current.getPrevious();
        Node<T> next = current.getNext();
        
        // deallocate current first
        // delete current;
        
        previous.setNext(next);
        next.setPrevious(previous);
    }
    
    public void join(HybridList<T> other) {
        
    }
    
    public void weave(HybridList<T> other) {
        
    }
}
