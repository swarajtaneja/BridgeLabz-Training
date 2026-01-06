public class RestoreIP {
    List<String> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        backtrack(s, 0, 0, new StringBuilder());
        return res;
    }

    private void backtrack(String s, int idx, int part, StringBuilder cur) {
        if (part == 4 && idx == s.length()) {
            res.add(cur.toString());
            return;
        }
        if (part == 4 || idx == s.length()) return;

        int len = cur.length();
        for (int i = idx; i < Math.min(idx + 3, s.length()); i++) {
            String seg = s.substring(idx, i + 1);
            if ((seg.length() > 1 && seg.startsWith("0")) || Integer.parseInt(seg) > 255)
                continue;

            if (len > 0) cur.append('.');
            cur.append(seg);

            backtrack(s, i + 1, part + 1, cur);

            cur.setLength(len);
        }
    }
}
