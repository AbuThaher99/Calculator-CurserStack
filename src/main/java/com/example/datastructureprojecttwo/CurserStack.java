package com.example.datastructureprojecttwo;

public class CurserStack <T> implements StackInterFace<T>{
	CursorArray<T> ca = new CursorArray<>(1000);
	int l = ca.createList();
	@Override
	public void push(T data) {
		if(!ca.insertAtHead(data, l))
			System.out.println("Error: Satck Overflow!!!!");
	}

	@Override
	public T pop() {
		return ca.deleteFirst(l);
	}

	@Override
	public T peek() {
		return ca.getFirst(l);
	}

	@Override
	public boolean isEmpty() {
		return ca.isEmpty(l);
	}

	@Override
	public void clear() {
		while(true){
			if(ca.isEmpty(l)) {
				break;
			}else {
				ca.deleteFirst(l);
			}
		}

	}

}