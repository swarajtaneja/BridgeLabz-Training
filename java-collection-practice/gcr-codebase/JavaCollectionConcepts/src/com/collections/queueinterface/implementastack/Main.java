package com.collections.queueinterface.implementastack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUsingQueue stack = new StackUsingQueue();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.top());
	}
}
