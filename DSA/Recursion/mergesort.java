import java.util.Arrays;

class mergesort{
    public static void main(String[] args) {
        int[] arr={4,28,6,9,3,10,2};
        arr=merge(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] merge(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid=arr.length/2;
        int[] left = merge(Arrays.copyOfRange(arr,0,mid));
        int[] right = merge(Arrays.copyOfRange(arr,mid, arr.length));

        return mergeSort(left,right);

    }
    private static int[] mergeSort(int[] left ,int[] right){
        int[] mix=new int[left.length+right.length];
        int i=0,j=0,k=0;
        
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }
            else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        // when the one of them array is not completed
        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }

        return mix;
    }

}