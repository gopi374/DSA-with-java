public class queue{
    private int[] data;
    private static final int Default_size = 5;
    int end = 0;

    public queue(){
        this(Default_size);
    }
    public queue(int size){
        this.data = new int[size];
    }


    public boolean add(int val) throws Exception{
        if (isFull()){
            return false;
        }
        data[end]=val;
        end++;
        return true;

    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot remove , queue is empty !");
        }
        int removed = data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public int front(){
        return data[0];
    }
    
    public void display(){
        System.out.print("FRONT ");
        for(int i=0;i<end;i++){
            System.out.print(data[i]+" <- ");
        }
        System.out.print("END");
     }
    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public static void main(String[] args) throws Exception{
        queue q = new queue(10);
        q.add(12);
        q.add(16);
        q.add(15);
        q.add(14);
        q.add(17);
        q.add(18);
        q.remove();
        q.remove();
        q.display();
        System.out.println();
        System.out.println("FRONT : "+q.front());
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
    }

}