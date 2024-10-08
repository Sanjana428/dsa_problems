// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

// Implement the MinStack class:

// MinStack() initializes the stack object.
// void push(int val) pushes the element val onto the stack.
// void pop() removes the element on the top of the stack.
// int top() gets the top element of the stack.
// int getMin() retrieves the minimum element in the stack.
// You must implement a solution with O(1) time complexity for each function.

// Solution

class MinStack {
//to find minimum element without using space then we use gap strategy where in stack instead of storing the element we'ill store the difference between mmin element the element itself. and wherever the element in stack comes out to be negative then it time to update the minimum value bcoz it means that we have smaller element then the minimum eleemnt.
    public MinStack() {
        
    }
    Stack<Long> st=new Stack<>();
    Long min;
    public void push(int val) {
        if(st.size()==0){
            st.push(0L);
            min=(long)val;
             return;

        }
        Long f=val-min;
        st.push(f);
        if(val<min){
            min=(long)val;
        }
    }
    
    public void pop() {
        Long f=st.pop();
        if(f<0){
            min=min-f;
        }
    }
    
    public int top() {
        Long f=st.peek();
        if(f<0){return min.intValue();}
        else{
           
            return (int)(f+min);
        }
    }
    
    public int getMin() {
        return min.intValue();
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
