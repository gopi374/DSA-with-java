public class Array_swap {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        swap(arr,0,3);
        System.out.println("After swapping:");
        for(int i = 0;i <arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.print("Maximum of array : ");
        max(arr,0,arr.length-1);
        System.out.println("Reverse of the array :");
        reverse(arr);
        for(int i = 0;i <arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
    static void swap(int[] arr , int index1 ,int index2){
        int temp = arr[index1];
        arr[index1] =arr[index2];
        arr[index2] = temp;
    }
    static void  max(int[] arr ,int start,int end){
        int max =arr[start];
        if(arr.length==0){
            return ;
        }
        for(int i = start;i<=end; i++){
            if(arr[i]>max){
                max=arr[i];
            }
           
        }
        System.out.println(max);
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}