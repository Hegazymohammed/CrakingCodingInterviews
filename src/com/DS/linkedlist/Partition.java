
public class Partition{
  public head partition(Node head,int value){
    Node greater=null,newHead;
    Node smaller=null;
    
    while(head!=null){
      Node temp=head.next;
      if(head.val<value){
         if(smaller==null){
             smaller=newHead=head;
         }
         else{
           smaller.next=head;
           smaller=head;
           smaller.next=null;
         }
      }
        else  {
          
            head.next=null;
            greater=head;
            greater.next=null;
         }
      }
    
    }
    smaller.next=greater;
    return newHead;
  }


public Node partition(Node node,int x){
     Node head=node;
     Node tail=node;
    node=node.next;
     while(node!=null){
           Node next=node.next;
           if(node.val>x){
               node.next=head;
               head=node;
           }
           else{
              tail.next=node;
              tail=node;
            
           }
       
       node =next;
     }
   tail.next=null;
  return head;
}
    
    
  
  
}
