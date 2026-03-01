import java.util.Vector;
class index{
    public static void main(String[] args) {
        //vector are dynamic arrays which can grow and shrink in size
        //vector are synchronized and thread safe
        //creation of vectors
        Vector<Integer>arr=new Vector<>(6);
        arr.add(5); //add() methods are used to add element insode the last of  vector array
        arr.add(10);
        arr.add(03);
        arr.add(4);
        arr.add(2);
        arr.add(6);
        for(int e:arr){
            System.out.println(e+" ");
        }
        System.out.println(arr.get(55)); //get() method is used to access the element at the specified index
        System.out.println(arr.remove(2)); //remove() method is used to remove the element at the specified index and return the removed element
        System.out.println(arr.size()); //size() method is used to get the number of elements in the vector
        
    }
}