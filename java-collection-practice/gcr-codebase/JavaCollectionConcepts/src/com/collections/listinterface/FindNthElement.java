package com.collections.listinterface;
import java.util.*;
public class FindNthElement {
	public static String findNthElement(LinkedList<String> list, int n) {
		Iterator<String> fast = list.iterator();
		Iterator<String> slow = list.iterator();
		
		for(int i=0; i<n; i++) {
			fast.next();
		}
		
		while(fast.hasNext()) {
			fast.next();
			slow.next();
		}
		return slow.next();
	}
	
	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
		System.out.println(findNthElement(ll, 3));
		
	}

}
