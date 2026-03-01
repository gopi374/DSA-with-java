import java.util.Vector;
class index{
    public static void main(String[] args) {
        //vector are dynamic arrays which can grow and shrink in size
        //vector are synchronized and thread safe
        //creation of vectors
        Vector<Integer>arr=new Vector<>(6);
        // arr.set(0,1);
        arr.set(10,2);
        // arr.set(2,3);
        // arr.set(3,4);
        // arr.set(4,5);
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println("Arr get"+arr.get(0)); //get() method is used to access the element at the specified index
        System.out.println(" Remove() "+arr.remove(2)); //remove() method is used to remove the element at the specified index and return the removed element
        System.out.println("Size: "+arr.size()); //size() method is used to get the number of elements in the vector
        System.out.println("Element at index 4: "+arr.elementAt(4)); //elementAt() method is used to access the element at the specified index

    }
}