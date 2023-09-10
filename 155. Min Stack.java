class MinStack {
  Stack < Integer > arr = new Stack < > ();
  Stack < Integer > arr1 = new Stack < > ();
  public MinStack() {

  }

  public void push(int val) {
    arr.push(val);
    if (arr1.isEmpty() || val <= arr1.peek())
      arr1.push(val);

  }

  public void pop() {
    int x = arr.pop();
    if (arr1.peek() == x)
      arr1.pop();

  }

  public int top() {
    return arr.peek();

  }

  public int getMin() {
    return arr1.peek();
  }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
