package ProblemSolving.LinkedList;

import java.util.LinkedList;

class Node 
{
    int data ;
     Node next;
}

class LinkedList1 
{
    Node head;
    Node tail;
    int size;

    public void add (int val)
    {
        if(size==0)
        {
            Node n = new Node();
            n.data= val;
            n.next= null;
           head= n;
           tail= n;
           size++;


        }
        else 
        {
            Node n = new Node();
            n.data= val;
            n.next= null;
            tail.next= n;
            tail= n;
            size++;
        }
    }

}

public class AddLast {
    public static void main(String[] args) {
        LinkedList1 l = new LinkedList1();
        l.add(10);
        l.add(20);
        System.out.println(l.head.data + " "+ l.tail.data);
    }
}
