import java.util.ArrayList;

class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(24);
        list.add(56);
        list.add(67);
        list.add(89);
        list.add(1,45);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.size());
    }
}