class MyStack {
int arr[];
int front;
int rear;
    public MyStack() {
        arr=new int[100];
        front=0;
        rear=0;
    }
    
    public void push(int x) {
        arr[rear]=x;
        rear++;
    }
    
    public int pop() {
        if(!empty())
        {
            int x=arr[rear-1];
            rear=rear-1;
            return x;
        }
        return -1;
    }
    
    public int top() {
          if(!empty())
        {
            int x=arr[rear-1];
            return x;
        }
        return -1;
    }
    
    public boolean empty() {
        if(rear==front)
        return true;
        else 
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
