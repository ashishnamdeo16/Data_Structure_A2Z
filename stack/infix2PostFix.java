import java.util.*;

class infix2PostFix{
    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)";
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<infix.length();i++){
            char ch = infix.charAt(i);
            if(ch >= 'a'  && ch <= 'z' || ch >= 'A'  && ch <= 'Z' || ch >= '0'  && ch <= '9'){
                sb.append(ch);
            }else if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    sb.append(stack.peek());
                    stack.pop();
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && priority(ch) <= priority(stack.peek())){
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }

        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.print(sb);
    }
    public static int priority(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

}