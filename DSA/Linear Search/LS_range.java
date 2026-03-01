class LS_range{
    public static void main(String[] args) {
        int[] arr={85,42,96,2,47,36,2};
        search(arr, 0, 5, 47);
        
    }
    static void search(int[] arr,int start,int end,int target){
        end=arr[end];
        for(int i = 0; i<=end;i++){
            if(arr[i]==target){
                System.out.println("element found at index "+i);
            }
            else{
                System.out.println("could not found");
            }
        }
    }
}