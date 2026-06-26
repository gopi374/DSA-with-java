public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
       super(size);
    }

    @Override
    public boolean add(int item) throws Exception {
        if (this.isFull()){
            int[] temp = new int[data.length*2];

            for(int i =0;i<data.length;i++){
                temp[i]=data[(front+i)%data.length];
            }
            front = 0;
            end=data.length;
            data=temp;
        }
        return super.add(item);
    }

    public static void main(String[] args) throws Exception{
        DynamicQueue dq = new DynamicQueue();
        dq.add(56);
        dq.add(16);
        dq.add(15);
        dq.add(14);
        dq.add(17);
        dq.add(18);
         dq.add(56);
        dq.add(16);
        dq.add(15);
        dq.add(14);
        dq.add(17);
        dq.add(18);
        dq.display();
    }
}
