
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascaltriangle {
    
    public static void main(String[] args) {
        int n=5;
        System.out.println(Arrays.asList(getlist(n)));
    }
    static List<List<Integer>> getlist(int nums){
        List<List<Integer>> result = new ArrayList<>();
        if(nums == 0) return result;
        result.add(new ArrayList());
        result.get(0).add(1);
        for(int i = 1;i<nums;i++){
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for(int j=1;j<i;j++){
                cur.add(result.get(i-1).get(j-1) + result.get(j-1).get(j));
            }
            cur.add(1);
            result.add(cur);
        }
        return result;
    }
}
