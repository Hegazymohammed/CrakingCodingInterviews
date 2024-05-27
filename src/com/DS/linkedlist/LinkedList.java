package com.DS.linkedlist;


import java.util.ArrayList;
import java.util.List;

class Node{
    public int val;
    public Node next;

    public Node(int val){
        this.val=val;
    }
}
public class LinkedList {
    public Node head;
    public  void add(int val){
        Node newNode=new Node(val);
        if(head==null)
            head=newNode;
        else{
            newNode.next=head;
            head=newNode;
        }

    }

    public void insert(int ... args){
        int []values=args;
        int length=values.length;
        for (int value : values) {
            add(value);
        }
    }

    public  List<Integer>  print(){
        List<Integer> nodesValues=new ArrayList<>();
        for(Node current=head;current!=null;current=current.next){
              nodesValues.add(current.val);
        }
        return nodesValues;
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(1,3,4,5,6,7);
        list.print();
    }
}
