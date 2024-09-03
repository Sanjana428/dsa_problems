// Design a stack-like data structure to push elements to the stack and pop the most frequent element from the stack.

// Implement the FreqStack class:

// FreqStack() constructs an empty frequency stack.
// void push(int val) pushes an integer val onto the top of the stack.
// int pop() removes and returns the most frequent element in the stack.
// If there is a tie for the most frequent element, the element closest to the stack's top is removed and returned.

  // Solution:

class FreqStack {

    public FreqStack() {
        // HashMap<Integer,Stack<Integer>> st = new HashMap<>();
        // HashMap<Integer,Integer> hm = new HashMap<>();
        // int fm;
    }
    HashMap<Integer,Stack<Integer>> st = new HashMap<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int fm;
    public void push(int val) {
        int f=hm.getOrDefault(val,0);
        f++;
        hm.put(val,f);
        if(!st.containsKey(f)){
            st.put(f,new Stack<>());
            fm=Math.max(fm,f);
        }
        st.get(f).push(val);

    }
    
    public int pop() {
        int var=st.get(fm).pop();
        int f=hm.get(var);
        f--;
        hm.put(var,f);
        if(st.get(fm).size() == 0){
            st.remove(fm);
            fm--;
        }
        return var;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
