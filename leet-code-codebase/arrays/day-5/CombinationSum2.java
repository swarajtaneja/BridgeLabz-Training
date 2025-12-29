public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }

    void backtrack(List<List<Integer>> res, List<Integer> cur, int[] c, int t, int idx) {
        if (t == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = idx; i < c.length && c[i] <= t; i++) {
            if (i > idx && c[i] == c[i - 1]) continue;
            cur.add(c[i]);
            backtrack(res, cur, c, t - c[i], i + 1);
            cur.remove(cur.size() - 1);
        }
    }
}
