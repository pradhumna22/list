public class Main {
    public static   void main(String[] args) {
        LinkList list = new LinkList();
        list.head = new LinkList.Node(1);
        LinkList.Node second = new LinkList.Node(2);
        LinkList.Node third = new LinkList.Node(3);
        LinkList.Node fourth= new LinkList.Node(4);
        LinkList.Node fifth = new LinkList.Node(5);
        LinkList.Node sixth = new LinkList.Node(6);
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = null;




//        list.push(1987);
//        list.insertAfter(list.head.next.next,34);
//        list.insertLast(87);
//        list.printList();
//        System.out.println(list.length(list.head));
//        list.deleteNode(second, 2);
//        list.printList();
        list.swapNode(second,2,4);
        list.printList();

    }

}