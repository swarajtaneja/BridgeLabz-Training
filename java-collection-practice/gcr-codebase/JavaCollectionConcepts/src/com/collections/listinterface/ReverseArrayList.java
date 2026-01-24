package com.collections.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {
	public static void main(String []args) {
		List<Integer> data = new ArrayList<>();
		for(int i=1;i<=50;i++) {
			data.add(i);
		}
		int len=data.size();
		int end=len-1;
		int temp;
		for(int i=0;i<len/2;i++) {
			temp=data.get(i);
			data.set(i, data.get(end));
			data.set(end, temp);
			end--;
		}
		System.out.print(data);
	}

}
