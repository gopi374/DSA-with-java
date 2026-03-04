class savepeople{
    public static void main(String[] args) {
        int[] people={3,5,3,4};
        int limit=5;
        System.out.println(save(people,limit));
    }
    static int save(int[] people,int limit){
        Arrays.sort(people);
        int n= people.length;
        int boats=0,i=0,j=n-1;
            while(i<=j){
                if(people[i]+people[j] <= limit){
                    i++; 
                }
                j--;
                boats++;
            }
        return boats;
    }
}