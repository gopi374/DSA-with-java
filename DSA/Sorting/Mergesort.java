public class Mergesort {
    public static void main(String[] args) {
        int[] arr={7,6,8,0,2,9,1};
        merge(arr, 0, arr.length-1);
        for (int  num : arr) {
            System.out.print(num +" ");
        }
  
    }
    static void merge(int[] arr, int start , int end){

    if (start >= end) { // it is the base case of recurcion
        return;
    }

    int mid = start + (end - start) / 2;

    merge(arr, start, mid);
    merge(arr, mid + 1, end);
    merging(arr, start, mid, end);
    }

    static void merging(int[] arr,int start,int mid,int end ){
        
        int n1=mid-start+1;
        int n2=end-mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        //
        for(int i=0;i<n1;i++){
            leftArray[i]=arr[start+i];
        }
        for(int i=0;i<n2;i++){
            rightArray[i]=arr[mid+1+i];
        }

        int i=0,j=0;
        int k=start;
        while(i<n1 && j<n2){
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
