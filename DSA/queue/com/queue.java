public class queue{
    private int[] data;
    private static final int Default_size = 5;
    int end = 0;

    int front = 0;

    public queue(){
        this(Default_size);
    }
    public queue(int size){
        this.data = new int[size];
    }
    public boolean add(int val) throws Exception{
        if(isFull()){
            throw new Exception("cannot add ,Queue is full");
        }
        data[front]=val;
        front++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int val = data[end];
        end++;
        return val;
    }
    public void display(){
        System.out.print("END ");
        for(int i=0;i< front;i++){
            System.out.print(data[i]+" ");
        }
        System.out.print("FRONT ");
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
        q.display();
    }

}