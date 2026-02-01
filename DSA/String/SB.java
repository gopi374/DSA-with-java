public class SB {
    public static void main(String[] args) {
        StringBuilder builder =new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char a =(char)('a'+i);
            builder.append(a);
        }
        System.out.println(builder.toString());
        System.out.println(builder.substring(1,20));
        System.out.println(builder.capacity());
        System.out.println(builder.deleteCharAt(2));// cdeleted
        System.out.println(builder.isEmpty());
    }
}
