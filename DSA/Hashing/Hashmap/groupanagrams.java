import java.util.*;
class groupanagrams{
    public static void main(String args[]){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(getgroupana(strs));

    }
    static List<List<String>> getgroupana(String[] strs){
        Map<String , List> map = new HashMap<>();
        // int n = strs.length();
        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i: count){
                sb.append("#");
                sb.append(i);
            }
            String key = sb.toString();

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());

    }
}