public class KthToTheLast{
public Node KthToLast1(int index,Node node){
    //this soluation is o(n)time and o(n)memory
    //warm up soluation
    List<Node> nodes=new ArrayList<>();
    for(Node current=node;current!=null;current=current.next)
           nodes.add(current);

    return nodes.get(nodes.size()-1-index);
}
public Node KthToLast2(int index,Node node){
      //soluation in o(n)time and o(1)memory
      //get length of the linkedlist 
      int length=getLength(node);
     //move length-index
      int steps=length-index;
      for(Node current=node;current!=null;current=current.next,steps--){
                  if(steps==0)
                      return current;
         
      }
        return null;

  }
  private int getLength(Node node){
         Node current=node;
        int length=0;
    while(current!=null){
       current=current.next;
       length++;
    }
        return length;
  }

  //recurive soluation
  public int KthToLast3(Node node,int target){
            if(node==0)
                return 0;
    int result=KthToLast3(node.next,target)+1;
    if(result==target){
         System.out.println(result+" "+node.val);
    }
    return result;
  }
        
      
}
