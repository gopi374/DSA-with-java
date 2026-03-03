public class Minimumoftwoarray {
    public static void main(String[] args) {
        int[] nums1={4,12,13};
        int[] nums2={4,2};
        //output 4
        //solutiion 1: brute force
        System.out.println(mini(nums1, nums2));

        //solution 2: two pointer aaproach
        System.out.println(mini2(nums1, nums2)
        );
    }
    static int mini(int[] nums1,int[] nums2){
        int i=0;
        int j=0;
        for( i=0;i<nums1.length;i++){
            for( j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    return nums1[i];
                }
            }
        }
        return -1;
    }
    static int mini2(int[] nums1,int[] nums2){
        int i=0,j=0;
        int result=-1;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                result=nums1[i];
                break;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return result;
    }
}
