package com.collections.listinterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FrequencyOfElements {
	public static HashMap<String, Integer> findFrequency(List<String> list) {
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String l: list) {
			map.put(l, map.getOrDefault(l, 0) + 1);
		}
		return map;
	}

	public static void main(String[] args) {

		List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
		HashMap<String, Integer> result = findFrequency(input);
        System.out.println(result);

	}

}
