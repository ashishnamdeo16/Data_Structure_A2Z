import java.util.*;
class postfix2Infix{
    public static void main(String[] args) {
        String postFix = "AB-DE+F*/";
        Stack<String> stack = new Stack<>();
        for(int i=0;i<postFix.length();i++){
            char ch = postFix.charAt(i);
            if(ch >= 'a' && ch <='z' || ch >= 'A' && ch <='Z' || ch >= '0' && ch <='9'){
                stack.push(Character.toString(ch));
            }else{
                String val = stack.pop();
                String val2 = stack.pop();
                String newVal = "(" +  val2 + ch + val + ")" ;
                stack.push(newVal);
            }
        }
        System.out.print(stack.peek());
    }
}