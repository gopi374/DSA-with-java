class Removevowels{
    public static void main(String[] args) {
        String s="idea";
        int n=s.length();
        int idx=n;
        for(int i=n-1;i>0;i--){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                idx=i;
            }
            else{
                break;
            }
        }
        String result = s.substring(0, idx);
        System.out.println(result);
    }
}