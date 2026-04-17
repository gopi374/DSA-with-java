class sorted{
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,9,7,10};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int[] arr, int idx){
        //base condition to stop the recursion
        if(idx == arr.length-1){
            return true;
        }
        return arr[idx]<arr[idx+1] && isSorted(arr, idx+1);
    }
}