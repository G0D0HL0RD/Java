public class BinaryToInteger {
        class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public Node head = null;
        public Node tail = null;

        public void addNode(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public void display() {

            Node current = head;

            if (head == null) {
                System.out.println("The list is empty");
            }

            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public int getDecimalValue(Node head) {
            int count=0;
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                count++;
            }
            int bin=0,sum=0;
            int res=0;
            Node temp1=head;
            while(temp1!=null){
                bin=temp1.data;
                res=res+bin*(int)(Math.pow(2,count-1));
                count--;
                temp1=temp1.next;
            }
            // System.out.print(res)
            return res;
        }

        public static void main(String[] args) {
            BinaryToInteger list = new BinaryToInteger();
            list.addNode(1);
            list.addNode(0);
            list.addNode(1);
            list.display();
            list.getDecimalValue(list.head);

        }

    
}
