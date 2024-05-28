public class DeleteMiddleNode{

  public void delete(Node head){
        Node fast=head ;
        Node slow=head;
        Node prev=null;
        while(fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;


        }
        prev.next=prev.next.next;

    }
  
}
