package Queues;

class CircularQueue{
    int[] arr;
    int f = 0;
    int r = 0;
    int size = 0;
    CircularQueue(int len){
        arr = new int[len];
    }

    void add(int val){
        if (size==arr.length){
            System.out.println("Queue is full!");
            return;
        }
        arr[r++]=val;
        if (r==arr.length){
            r=0;
        }
        size++;
    }

    int remove(){
        if (size==0){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int frontVal = arr[f++];
        if (f==arr.length){
            f=0;
        }
        size--;
        return frontVal;
    }

    int peek(){
        if (size==0){
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arr[f];
    }

    void display(){
        if (size==0){
            return;
        }
        if (f>=r){
            for (int i=f; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            for (int i=0; i<r; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        else{
            for (int i=f; i<r; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}

public class ArrayImplementation {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();

        System.out.println(q.remove());
        System.out.println(q.remove());
        q.display();

        q.add(60);
        q.display();
        q.add(70);
        q.add(80);
        q.display();
    }
}
