public class SubStringConcatenation {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (s == null || s.length() == 0 || words.length == 0) return res;

        int wordLen = words[0].length();
        int numWords = words.length;
        int totalLen = wordLen * numWords;

        Map<String, Integer> wordCount = new HashMap<>();
        for (String w : words) wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);

        // We check for each possible offset in word length
        for (int i = 0; i < wordLen; i++) {
            int left = i, count = 0;
            Map<String, Integer> seen = new HashMap<>();

            for (int j = i; j <= s.length() - wordLen; j += wordLen) {
                String sub = s.substring(j, j + wordLen);
                if (wordCount.containsKey(sub)) {
                    seen.put(sub, seen.getOrDefault(sub, 0) + 1);
                    count++;

                    // If word occurs more than expected, shrink the window from left
                    while (seen.get(sub) > wordCount.get(sub)) {
                        String leftWord = s.substring(left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                    // If all words matched
                    if (count == numWords) {
                        res.add(left);
                        // Move left to shrink window for next potential match
                        String leftWord = s.substring(left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }
                } else {
                    // Reset if word not in words array
                    seen.clear();
                    count = 0;
                    left = j + wordLen;
                }
            }
        }

        return res;
    }
}

