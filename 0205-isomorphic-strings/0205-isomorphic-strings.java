class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        // Map for s -> t
        Map<Character, Character> map = new HashMap<>();
        // To prevent two s characters mapping to same t character
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (map.containsKey(a)) {
                if (map.get(a) != b) return false;
            } else {
                if (set.contains(b)) return false;
                map.put(a, b);
                set.add(b);
            }
        }
        return true;
    }
}
