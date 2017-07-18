package com.sonly.memento;

import java.util.Deque;
import java.util.LinkedList;

public class RoleStateCaretaker {

	private Deque<RoleStateMemeto> deque = new LinkedList<>();
	
	public void save(RoleStateMemeto memeto) {
		deque.push(memeto);
	}
	
	public RoleStateMemeto checkOut() {
		return deque.pop();
	}
}
