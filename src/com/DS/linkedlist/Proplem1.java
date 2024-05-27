package com.DS.linkedlist;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class Proplem1 {

    //first i can solve it in o(n)time and o(n)memeory
    //O(n2)time and o(1)memory
    public   void removeDups(Node head){
        Node current=head;
        for(;current!=null;current=current.next){
            for(Node node=current;node.next!=null;){
                  if(node.next.val== current.val)
                      node.next=node.next.next;

                  else
                      node=node.next;

            }
        }
    }

    public void removeDups2(Node head){
        Node current =head;
        HashSet<Integer>set=new HashSet<>();
        Node previous=null;

        while(current!=null){
            if(set.contains(current.val)){
                 previous.next=current.next ;
            }
            else{
                set.add(current.val);
                previous=current;

            }
            current=current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.insert(1,2,3,1,2,1,3);
        Proplem1 proplem1=new Proplem1();
        proplem1.removeDups2(linkedList.head);
        List<Integer>expected= List.of(3,1,2);
        List<Integer>result=linkedList.print();
        assertEquals(expected,result);




    }
}
