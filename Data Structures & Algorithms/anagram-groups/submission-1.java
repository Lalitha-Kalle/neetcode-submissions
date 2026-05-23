class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs) {
            char[] char_arr = s.toCharArray();
            Arrays.sort(char_arr);
            String char_str = String.valueOf(char_arr);
            if(!map.containsKey(char_str)) map.put(char_str, new ArrayList<>());
            map.get(char_str).add(s);
        }
        return new ArrayList<>(map.values());
    }
}