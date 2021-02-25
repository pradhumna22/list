public class LinkList {
    Node head;
    int size=0;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;

        }

    }


    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }
    public void push(int newData){
        Node nyaa = new Node(newData);
        nyaa.next=head;
        head = nyaa;
        size++;

    }
    public void insertAfter(Node prev, int newData ){

        if( prev == null){
            System.out.println("no");

        }
        else{
            Node newNode = new Node(newData);
            newNode.next=prev.next;
            prev.next=newNode;
        }
    }

    public void insertLast(int newData){
        Node newNode = new Node(newData);
        if(head == null){
            head = new Node(newData);
            return;
        }
        newNode.next=null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = newNode;
        return;
    }

    public int length(Node head){
        if(head==null){
            return 0;
        }
        int count = 0;
        Node current=head;
        while (current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public Node deleteNode(Node head, int position){
        int size = length(head);
        if (position>size || position<1){
            System.out.println("invalid position.");
            return head;
        }
        if (position==1){
            Node temp = head;
            head = head.next;
            temp.next=null;
            return temp;

        }
        else{
            Node previous = head;
            int count = 1;
            while(count<position-1) {
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            previous.next=current.next;
            current.next=null;
            return current;
        }
    }

    public Node swapNode(Node node, int a, int b ){
        if (node==null || node.next==null){
            return node;
        }
        Node t1,t2,head,prev1,prev2;
        prev1=prev2=head=t1=t2=null;
        head=node;

        while (node!=null){
            if(node.data==a){
                t1=node;
                break;
            }
            prev1 = node;
            node=node.next;
        }
        node=head;
        while(node!=null){
            if(node.data==b){
                t2=node;
                break;
            }
            prev2=node;
            node=node.next;

        }
        if(t1==null || t2 == null){
            return head;
        }
        if(prev1!=null){
            prev1.next=t1;

        }
        else
        {
            head = t2;

        }
        if(prev2!=null){
            prev2.next=t1;
        }
        else{
            head = t1;

        }
        Node temp =t1.next;
        t1.next=t2.next;
        t2.next=temp;
        return head;


    }

}