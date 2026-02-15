public class numofdigitone {
    public static void main(String[] args) {
        int n=13;
        int count=0;
        for(int i=0;i<=n;i++){
            int num=i;
            while(num>0){
                if (num % 10 == 1) {
                count++;
            }
            num /= 10;
            }
        }
        System.out.println(count);
    }
}
