
public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    // creating a stack
    Stack(int size) {
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    // adding elements into stack
    public void push(int e) {
        if (isFull()) {
            System.out.println("the stack is Full");
            System.exit(1);
        }
        System.out.println("Inserting " + e + " into the stack");

        arr[++top] = e;
    }

    // removing elements from the stack
    public int pop() {
        if(isEmpty()){
            System.out.println("The stack is empty, there is nothing to pop.");
            System.exit(1);
        }
        int x = arr[top--];
        System.out.println("poping out "+x);
        return x;
    }

    //checking conditions
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==capacity - 1;
    }

    //size of stack
    public int size(){
        return top+1;
    }

    //printing the stack
    public void display(){
        for (int i = 0; i <=top; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //main thread
    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push(2);
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(6);
        st.push(0);
        st.display();
        st.pop();
        st.display();

    }
}
