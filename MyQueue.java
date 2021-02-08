public class MyQueue{
    public static final int DEFAULT_SIZE=5;
    private Fruta data[];
    private int index;
    
    public MyQueue(){
        data = new Fruta[DEFAULT_SIZE];
    }

    public MyQueue(int s){
        data = new Fruta[s];
    }

    public boolean isEmpty(){
        return index==0;
    }

    public void enqueue(Fruta obj) throws Exception{
        if(index == data.length){
            throw new Exception("Queue is full. Dequeue some objects");
        }
        this.data[index]=obj;
        this.index++;
    }

    public Fruta dequeue() throws Exception{
        if(isEmpty())throw new Exception("Queue is empty");
        Fruta obj= this.data[0];
        for(int i=0; i<this.index-1;i++){
            data[i]=data[i+1];
        }
        this.index--;
        return obj;
    }

    public Fruta peek() throws Exception{
        if(isEmpty())throw new Exception("Queue is empty");
            return this.data[0];
    }

    public String toString(){
        String temp = "";
        for(int i = 0;i<index;i++){
            temp = temp + "[" + data[i] + "]";
        }
        return temp;
    }
}