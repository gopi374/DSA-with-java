

class finalvalueLC2011{
    public static void main(String[] args) {
        String[] opr={"--X","X++","X++"};
        // for(int i=0;i<opr.length;i++){
        //     System.out.print(opr[i]+" ");
        // }
        System.out.println(findlen(opr));

    }
    static int findlen(String[] opr){
        int X=0;
        for(int i=0;i<opr.length;i++){
            String s=opr[i];
            if(s=="X++")
                X=X+1;
            else if(s=="++X")
                X=X+1;
            else if(s=="X--")
                X=X-1;
            else if(s=="--X")
                X=X-1;
        }
        return X;
    }
}