import java.util.*;
class Infix2Prefix{
    public static int priority(char ch){
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }
    public static void main(String[] args) {
        String infix = "(A+B)*C-D+F";
        StringBuilder reverseInfix = new StringBuilder();
        int len = infix.length()-1;
        while(len >= 0){
            char ch = infix.charAt(len);
            if(ch == '('){
                reverseInfix.append(')');
            }else if(ch == ')'){
                reverseInfix.append('(');
            }else{
                reverseInfix.append(ch);
            }
            len--;
        }
        String resultString = reverseInfix.toString();

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<reverseInfix.length();i++){
            char ch = resultString.charAt(i);
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
                while(!stack.isEmpty() && priority(ch) < priority(stack.peek())){
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }

        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        sb.reverse();
        String finalAns = sb.toString();
        System.out.print(finalAns);
    }
}