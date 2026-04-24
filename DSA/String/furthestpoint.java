class furthestpoint{
    public static void main(String[] args) {
        String str="L_RL__R";
        System.out.println(furthestDistanceFromOrigin(str));
    }
    public static int furthestDistanceFromOrigin(String str) {
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='L' || str.charAt(i)=='_'){
                count--;
            }
            else{
                count++;
            }
        }
        return Math.abs(count);
    }
}