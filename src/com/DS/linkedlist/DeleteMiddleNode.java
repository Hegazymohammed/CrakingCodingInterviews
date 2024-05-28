public class DeleteMiddleNode{

  //using the techenique of slow and fast pointer it takes o(n)time and o(1)memory
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

  
  //there is other ways to solve this proplem takes also o(n)time and o(1)memeory
}
