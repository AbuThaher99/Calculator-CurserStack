package com.example.datastructureprojecttwo;

public interface StackInterFace<T> {

	public void push(T data);
	public T pop();
	public T peek();
	public boolean isEmpty();
	public void clear();
}
