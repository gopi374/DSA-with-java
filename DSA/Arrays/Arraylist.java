import java.util.ArrayList;

class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(24);
        list.add(56);
        list.add(67);
        list.add(89); // add method is used to add element in arraylist
        list.add(1,45);
        System.out.println(list);
        list.remove(2);// remove method is used to remove element from arraylist by index
        System.out.println(list);
        System.out.println(list.get(2));// get method is used to access element from arraylist by index
        System.out.println(list.size());        // size method is used to get the size of arraylist
        list.set(2, 90); // set method is used to update element in arraylist by index
        System.out.println(list); 
    }
}