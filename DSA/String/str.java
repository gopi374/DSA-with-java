class str{
    public static void main(String[] args) {
        //string creation
        String s1=new String();
        s1="user 1";
        str(s1);
        index(s1);

    }

    //task one combine two different string
    static void str(String str){
        String name="gopi";
        String greet="Welcome ~";
        String str1 =greet.concat(" ").concat(name);
        System.out.println(str);
    }
    //to get index value
    static void index(String str){
        int index=str.indexOf(' ');
        System.out.println(index);
    }
}