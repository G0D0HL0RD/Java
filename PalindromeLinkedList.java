import java.util.Scanner;

public class PalindromeLinkedList {
        class Node{
            int data;
            Node next;
    
            public Node(int data){
                this.data = data;
                this.next =null;
            }
        }
    
        public Node head =null;
        public Node tail =null;
    
        public void addNode(int data){
            Node newNode = new Node(data);
    
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
        }
    
        public void display(){
    
            Node current = head;
    
            if(head==null){
                System.out.println("The list is empty");
            }
    
            while(current!=null){
                System.out.println(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }

        public boolean checkPalindrome(Node head){
            Node fast=head,slow=head,prev,temp;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            prev=slow;
            slow=slow.next;
            prev.next=null;

            while(slow!=null){
                temp=slow.next;
                slow.next=prev;
                prev=slow;
                slow=temp;
            }
            fast=head;
            slow=prev;
            while(slow!=null){
                if(fast.data!=slow.data)
                return false;

                fast=fast.next;
                slow=slow.next;
            }
            return true;

        }
    
        public static void main(String[] args) {
            PalindromeLinkedList list = new PalindromeLinkedList();
            System.out.println("Enter the number of elements your want in the palindrome string");
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            System.out.println("enter the elements in LinkedList");
            for(int i=0;i<n;i++){
                list.addNode(sc.nextInt());
            }
            sc.close();

            System.out.println( list.checkPalindrome(list.head));
        }
    
    
}
