class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> mp = new HashMap<>();

        for(String s: strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String sort = new String(ch);

            mp.putIfAbsent(sort, new ArrayList<>());
            mp.get(sort).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
