class str{
    public static void main(String[] args) {
        //string creation
        String s1=new String();
        s1="user 1";
        str(s1);
        index(s1);
        length(s1);
        compare(s1);

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
    //to get the length of string
    static void length(String str){
        int index=str.length();
        System.out.println(index);
    }
    // comparing strings
    static void compare(String str){
        String str2="gopi"; 
        boolean com =str.equals(str2);
        System.out.println(com);
    }

}