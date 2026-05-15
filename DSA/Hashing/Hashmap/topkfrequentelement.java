import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class topkfrequentelement {
    public static void main(String[] args) {
        int[] nums ={1,2,1,2,1,2,3,1,3,2};
        int k=2;
        System.out.println(Arrays.toString(kelement(nums, k)));
    }
    static int[] kelement(int[] nums,int k){
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int i:map.keySet()){
            int key = map.get(i);
            if (bucket[key] == null) {
                bucket[key] = new ArrayList<>();
            }
            bucket[key].add(i);
        }
        int[] res = new int[k];
        int idx = 0;
        for(int i =nums.length;i>=0 && idx<k;i--){
            if (bucket[i] != null) {

                for (int num : bucket[i]) {

                    res[idx++] = num;

                    if (idx == k) {
                        break;
                    }
                }
            }
        }
        return res;
    }
}
