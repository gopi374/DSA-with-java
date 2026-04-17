
import java.util.ArrayList;

public class listreturn {
    public static void main(String[] args) {
        int[] arr={1,2,5,6,6,8,91,0};
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(find(arr, 6, 0, list)); //output = 3,4

    }

    static ArrayList<Integer> find(int[] arr,int target,int i, ArrayList<Integer> list){
        if(i==arr.length)
            return list;
        if(arr[i]==target){
            list.add(i);
        }    
        return find(arr, target, i+1,list);
    }
}
