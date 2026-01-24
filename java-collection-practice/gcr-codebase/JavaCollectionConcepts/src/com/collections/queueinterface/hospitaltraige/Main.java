package com.collections.queueinterface.hospitaltraige;

import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Patient> pq = new PriorityQueue<>();

        // Add patients
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        System.out.println("Treatment Order:");

        // Treat patients by severity
        while (!pq.isEmpty()) {
            Patient p = pq.poll();
            System.out.println(p.name);
        }
	}

}
