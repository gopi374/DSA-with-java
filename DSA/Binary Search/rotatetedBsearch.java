

public class rotatetedBsearch {
    public static void main(String[] args) {
        int[] arr={3,1};
        int target=3;
        System.out.println(search(arr,target));
        
    }

    static int search(int[] nums,int target){
        int pivot =pivotfind(nums);
        if(pivot ==-1){
            return Bsearch(nums, target ,0, nums.length-1);
        }
        if(nums[pivot]==pivot){
            return pivot;
        }

        if(target>=nums[0]){
            return Bsearch(nums, target, 0, pivot-1);
        }
        return Bsearch(nums, target , pivot +1, nums.length-1);
    }
    static int Bsearch(int[] arr,int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(target>arr[mid]){
            return Bsearch(arr,target,mid+1,end);
        }
        else if(target<arr[mid]){
            return Bsearch(arr,target,start,mid-1);
        }
        else{
            return mid;
        }
    }

    static int pivotfind(int[] arr){
        int start = 0;
        int end =arr.length-1;
        while(start<=end){
            int mid =start +(end-start)/2;
            if( mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid > start && arr[mid]<arr[mid-1]){
                return mid;
            }
            if(arr[mid]<=arr[start]){
                end =mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

}
