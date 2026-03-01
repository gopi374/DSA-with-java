import java.util.Arrays;    
import java.util.Comparator;

class LS79 {
    public static void main(String[] args){
        int [] largestNumber={3,30,34,5,9};
        //output should be 210
        System.out.println(largestNumber(largestNumber));
    }
    static String largestNumber(int[] nums){
        String[] strNums = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strNums[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strNums,new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                String order1 = a+b;
                String order2 = b+a;
                return order2.compareTo(order1);
            }
        });
        if(strNums[0].equals("0")){
            return "0";
        }
        StringBuilder largestNumber = new StringBuilder();
        for(String numAsStr : strNums){
            largestNumber.append(numAsStr);
        }
        return largestNumber.toString();
    }
}
