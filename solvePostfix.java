import java.util.Stack;
public class solvePostfix {
    public static void main(String[] args) {
        String str = "32+7*4-";

        int res = calculate(str);
        System.out.println(res);
    }
    static int calculate(String s){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(Character.isDigit(c)){
                st.push(c-'0');
            }
            else{
                int num2 = st.pop();
                int num1 = st.pop();

                switch(c){
                    case '+':
                    st.push(num1+num2);
                    break;
                    case '-':
                    st.push(num1-num2);
                    break;
                    case '*':
                    st.push(num1*num2);
                    break;
                    case '/':
                    st.push(num1/num2);
                    break;
                }
            }
        }
        return st.pop();
    }
}
