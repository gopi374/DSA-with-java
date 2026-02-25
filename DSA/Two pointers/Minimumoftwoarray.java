public class Minimumoftwoarray {
    public static void main(String[] args) {
        int[] nums1={4,12,13};
        int[] nums2={4,2};
        // int min=nums1[0];
        // for(int i=0;i<nums1.length;i++){
        //     if(nums1[i]<min){
        //         min=nums1[i];
        //     }
        // }
        // for(int i=0;i<nums2.length;i++){
        //     if(nums2[i]<min){
        //         min=nums2[i];
        //     }
        // }
        System.out.println(mini(nums1, nums2));
    }
    static int mini(int[] nums1,int[] nums2){
        int min=nums1[0];
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]<min){
                min=nums1[i];
            }
        }
        int min2=nums2[0];
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]<min){
                min2=nums2[i];
            }
        }
        if(min<min2){
            min=min+1;
        }else if(min2<min){
            min2=min2+1;
        }
        return Math.min(min, min2);
        //output is 4
    }
}
