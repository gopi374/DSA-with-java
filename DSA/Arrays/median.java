import java.util.Arrays;
class median {
    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] nums2={2};
        //output 2.00000
        // System.out.println(findMedian(nums1, nums2));
        
    // }
    // public double findMedian(int[] nums1, int[] nums2) {
        for(int i=0;i<nums2.length;i++){
            nums1[nums1.length-nums2.length+i]=nums2[i];
        }
        
        Arrays.sort(nums1);
        double s=0,e=nums1.length-1;
        double med=s+(e-s)/2.0;
        for(int i=0;i<nums1.length;i++){
        System.out.println(nums1[i]+" ");}
    // return med;
    }
}