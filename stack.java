class Stack{
    int top;
    int capacity;
    int arr[];
    Stack(int capacity){
            this.capacity=capacity;
            top=-1;
            arr=new int[capacity];
    }
    boolean isFull(){
        return top==capacity-1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    void push(int item){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top]=item;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack Undeflow");
            return -1;
        }
        return arr[top--];
    }
    int peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }
    void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack Elements:");
        for(int i=top;i>=0;i--){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
class StackExample{
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Top element:"+stack.peek());
        System.out.println("Popped element:"+stack.pop());
        stack.display();
    }
}
