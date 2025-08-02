//Time Complexity :O(n)
//Space Complexity :O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : N/A
class MyQueue {
    Stack<Integer> inSt;
    Stack<Integer> outSt;

    public MyQueue() {
        this.inSt = new Stack<>();
        this.outSt = new Stack<>();  //
    }
    
    public void push(int x) {
        inSt.push(x);  // Push a element will directly goes into IN-STACK
    }
    
    public int pop() {
        if(empty()) return -1; 
        peek();   //pop will only pop elements from outstack to follow FIFO order by moving OUT-STACK 

         
        return outSt.pop();
    }
    
    public int peek() {
        if(outSt.isEmpty()){
            while(!inSt.isEmpty()){
                outSt.push(inSt.pop()); // ELements in instack is popped & pushed into outstack
            }
        }
        return outSt.peek();
    }
    
    public boolean empty() {
        return inSt.isEmpty() && outSt.isEmpty();
    }
}
