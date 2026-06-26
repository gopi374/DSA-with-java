public class CircularQueue {
    protected  int[] data;
    private static final int Default_size = 5;

    protected int end = 0;
    protected int front = 0;
    private  int size = 0;


    public CircularQueue(){
        this(Default_size);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(int val) throws Exception{
        if (isFull()){
            return false;
        }
        data[end]=val;
        end++;
        end = end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot remove , queue is empty !");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot get front , queue is empty !");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        int i = front;
        do { 
            System.out.print(data[i]+" ->");
            i++;
            i%=data.length;
        } while (i!=end);
        System.out.print("END");
        System.out.println();
    }



    public static void main(String[] args) throws Exception{
        CircularQueue cq = new CircularQueue();
        cq.add(15);
        cq.add(25);
        cq.add(14);
        cq.add(85);
        cq.add(81);
        // System.out.println(cq.front());
        cq.display();
        System.out.println(cq.remove());
        cq.add(2000);
        cq.add(12); 
        cq.add(1200);
        cq.display();

    }
}
