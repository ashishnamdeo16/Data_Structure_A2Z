package com.stack;
import java.util.Stack;

//Implementation of Min Stack

public class minStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> supportingStack = new Stack<>();

    public void push(int item){
        stack.push(item);
        if(supportingStack.isEmpty() || supportingStack.peek() >= stack.peek()) {
            supportingStack.push(item);
        }
    }

    public int pop(){
        if(stack.isEmpty()){
            return -1;
        }
        int ans = stack.pop();
        if(supportingStack.peek() == ans){
            supportingStack.pop();
        }
        return ans;
    }

    public int getMinVal(){
        if(supportingStack.isEmpty()){
            return -1;
        }
        return supportingStack.peek();
    }
}
