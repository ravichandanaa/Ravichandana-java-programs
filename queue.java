class Queue{
    int front;
    int rear;
    int capacity;
    int arr[];
    Queue(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        front=0;
        rear=-1;
    }
    boolean isFull(){
        return rear==capacity-1;
    }
    boolean isEmpty(){
        return front>rear;
    }
    void enqueue(int item){
        if(isFull()){
            System.out.println("Queue Overflow");
            return;
        }
        arr[++rear]=item;
        System.out.println(item+" enqueued to queue");
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front++];
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }
    void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue elements:");
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
class QueueExample{
    public static void main(String[] args){
        Queue q=new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        System.out.println("Front element:"+q.peek());
        System.out.println("Dequeued:"+q.dequeue());
        q.display();
    }
}
