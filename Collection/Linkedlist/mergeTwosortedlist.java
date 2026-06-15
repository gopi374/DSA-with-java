
import java.util.LinkedList;

class mergeTwosortedlist{
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList<>();
        LinkedList list2 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(8);
        list2.add(9);
        list2.add(10);
        list2.add(12);
        System.out.println(merge(list1, list2));   
    }
    public static LinkedList merge(LinkedList l1 , LinkedList l2){
        LinkedList ans = new LinkedList<>();
        LinkedList anshead=ans;
        while(l1 != null && l2 != null){
            if(l1.val<l2.val){
                anshead.next=l1;
                l1=l1.next;
                anshead=anshead.next;
            }else{
                anshead.next=l2;
                l2=l2.next;
                anshead=anshead.next;
            }
        }
        if(l1 != null){
            anshead.next=l1;
        }else{
            anshead.next=l2;
        }
        return ans.next;
    }
}