import java.util.*;

class Solution {
    public String frequencySort(String s) {
        // 1) Count frequency
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // 2) Buckets where index = frequency
        List<StringBuilder> buckets = new ArrayList<>(s.length() + 1);
        for (int i = 0; i <= s.length(); i++) buckets.add(new StringBuilder());

        // 3) Put chars into buckets by their freq
        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            int f = e.getValue();
            char ch = e.getKey();
            for (int i = 0; i < f; i++) buckets.get(f).append(ch);
        }

        // 4) Build string from high freq to low
        StringBuilder res = new StringBuilder();
        for (int i = s.length(); i > 0; i--) {
            if (buckets.get(i).length() > 0) res.append(buckets.get(i));
        }
        return res.toString();
    }
}
