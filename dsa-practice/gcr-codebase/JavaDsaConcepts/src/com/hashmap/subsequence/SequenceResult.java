package com.hashmap.subsequence;

public class SequenceResult {
    int length;

    public SequenceResult(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Longest Consecutive Length: " + length;
    }
}	