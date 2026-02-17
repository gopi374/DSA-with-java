
public class uniquethreenum {
    /*
    you are given an array of digits called digits. Your task is to determine the number of distinct three-digit even numbers that can be formed using these digits.

Note: Each copy of a digit can only be used once per number, and there may not be leading zeros.

 

Example 1:

Input: digits = [1,2,3,4]

Output: 12

Explanation: The 12 distinct 3-digit even numbers that can be formed are 124, 132, 134, 142, 214, 234, 312, 314, 324, 342, 412, and 432. Note that 222 cannot be formed because there is only 1 copy of the digit 2. */
    public static void main(String[] args) {
        int[] digits={2,0,2};
        int count=0;
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(digits[i]!=0 && digits[k]%2==0 && i!=j && j!=k && i!=k){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        
    }
}