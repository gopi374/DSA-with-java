
import java.util.ArrayList;

public class listreturn {
    public static void main(String[] args) {
        int[] arr={1,2,5,6,6,8,91,0};
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(find(arr, 6, 0)); //output = 3,4

    }

    static ArrayList<Integer> find(int[] arr,int target,int i, ArrayList<Integer> list){ //returning list using arguments
        if(i==arr.length)
            return list;
        if(arr[i]==target){
            list.add(i);
        }    
        return find(arr, target, i+1,list);
    }

    static ArrayList<Integer> find(int[] arr,int target,int i){ //returning list using no arguments
        ArrayList<Integer> list =new ArrayList<>();
        while (i<arr.length) { 
            if(arr[i]==target){
                list.add(i);
            } 
            i++;
        }
        return list;
    }
}
