package com.collections.listinterface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseLinkedList {

	public static LinkedList reverseLL(LinkedList<Integer> list) {
		
		LinkedList<Integer> ansList = new LinkedList<>();
		ListIterator<Integer> l = list.listIterator(list.size());
		
		while(l.hasPrevious()) {
			ansList.add(l.previous());
		}
		return ansList;
	}
	public static void main(String []args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		ll = reverseLL(ll);
		for(int l: ll) {
			System.out.print(l + " ");
		}
	}

}