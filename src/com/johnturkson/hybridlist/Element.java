package com.johnturkson.hybridlist;

public class Element<T> implements Pointer<T> {
    private T value;
    
    public Element(T value) {
        this.value = value;
    }
    
    @Override
    public T deference() {
        return value;
    }
}
