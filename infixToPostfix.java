import java.util.*;
public class infixToPostfix {
    public static void main(String[] args) {
        // String exp = "a+b*(c^d-e)^(f+g*h)-i";
        String exp = "a*b/(d+c)*e";
        
        String str=inToPost(exp);
        System.out.println(str);
    }

    static int precedance(char c){
        switch (c) {
            case '*':
            case '/':
                return 2;

            case '+':
            case '-':
                return 1;
            case '^':
                return 3;    
        }
        return -1;
    }
    static String inToPost(String s){
        String res= new String("");

        Deque<Character> st = new ArrayDeque<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(Character.isLetterOrDigit(c))
            res+=c;

            else if(c=='(')
            st.push(c);

            else if(c==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    res+=st.peek();
                    st.pop();
                }
                st.pop();
            }

            else{
                while(!st.isEmpty() && precedance(c)<=precedance(st.peek()))
                {
                    res+=st.peek();
                    st.pop();
                }
                st.push(c);
            }
        }
            while(!st.isEmpty()){
                if(st.peek()=='(')
                return "Incorrect input";

                res += st.peek();
                st.pop();
            }
            return res;
        }
    }

