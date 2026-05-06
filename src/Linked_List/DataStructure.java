package Linked_List;

class LL{
    Node head;
    Node tail;
    int size = 0;

    void addAtHead(int val){
        Node temp = new Node(val);
        if (head == null){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addAtTail(int val){
        Node temp = new Node(val);
        if (tail == null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void deleteAtHead(){
        if (head==null){
            return;
        }
        head = head.next;
        if (head == null){
            tail=null;
        }
        size--;
    }

    int search(int val){
        if (head == null){
            return -1;
        }
        int idx = 0;
        Node temp = head;
        while (temp.next!=null){
            if (temp.val == val){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    void insert(int val, int idx){
        if(idx > size || idx < 0){
            System.out.println("Invalid Index");
            return;
        }
        if (idx == size){
            addAtTail(val);
        }
        else if (idx == 0){
            addAtHead(val);
        }
        else{
            Node t = new Node(val);
            Node temp = head;
            int i = 1;
            while (i<idx){
                temp = temp.next;
                i++;

            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }

    int get(int idx){
        if (idx < 0 || idx > size){
            return -1;
        }
        int i=0;
        Node temp = head;
        while (i<idx){
            temp = temp.next;
            i++;
        }
        return temp.val;
    }

    void display(){
        if (head == null){
            return;
        }
        else{
            Node temp = head;
            while (temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class DataStructure {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.display();
        System.out.println("Head: "+ll.head.val);
        System.out.println("Tail: "+ll.tail.val);
        System.out.println("Size: "+ll.size);

        ll.addAtHead(10);
        ll.addAtHead(15);
        ll.display();
        System.out.println("Head: "+ll.head.val);
        System.out.println("Tail: "+ll.tail.val);
        System.out.println("Size: "+ll.size);

        ll.deleteAtHead();
        ll.deleteAtHead();
        ll.deleteAtHead();
        ll.display();
        System.out.println("Head: "+ll.head.val);
        System.out.println("Tail: "+ll.tail.val);
        System.out.println("Size: "+ll.size);

        System.out.println(ll.search(40));
        System.out.println(ll.search(60));

        ll.insert(20, 2);
        ll.display();
        ll.insert(60, 3);
        ll.display();
        ll.insert(70, 0);
        ll.display();
        ll.insert(10, 1);
        ll.display();

        System.out.println(ll.get(4));
        System.out.println(ll.get(2));
    }
}
