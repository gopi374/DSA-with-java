public class substring {
    public static void main(String[] args) {
        String str = new String("gopi");
        substring(str, 0, 3);
    }
    // string .substring method
    static void substring(String str, int startidx, int endidx) {
    System.out.printf("value between index[%d] and index[%d] : %s%n",startidx,endidx,str.substring(startidx, endidx));
    }

}
