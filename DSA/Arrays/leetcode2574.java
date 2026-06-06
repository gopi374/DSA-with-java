import java.util.Arrays;
class leetcode2574{
    public static void main(String[] args) {
        int[] nums={10,4,8,3};
        System.out.println(Arrays.toString(leftright(nums)));
    }
    static int[] leftright(int[] nums){
        int n = nums.length;
        int[] answer = new int[n];
        int[] lefts= new int[n];
        lefts[0]=0;
        int[] rights = new int[n];

        for(int i =0 ;i<n;i++){
            rights[i]=sumofnums(nums, i+1);
        }
        for(int i=1;i<n;i++){
            lefts[i]=sumofleft(nums, i);
        }

        for(int i=0;i<n;i++){
            answer[i]=Math.abs(lefts[i]-rights[i]);
        }

        return answer;
    }
    static int sumofnums(int[] nums,int s){
        int sum=0;
        for(int i=s;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    static int sumofleft(int[] nums, int s){
        int sum=0;
        for(int i=s-1;i>=0;i--){
            sum+=nums[i];
        }
        return sum;
    }
}