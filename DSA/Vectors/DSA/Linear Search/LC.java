class LC{
    public static void main(String[] args) {
        int[] arr={555,901,482,1771};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(even(arr[i])){
                count++;
            }
        }
        

        return count;
    }

    //even digits
    static boolean even(int num){
        int numOfDigits=digit(num);
        return numOfDigits%2==0;
    }
    // count of digits in a number
    static int digit(int num){
        int count = 0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}