
public class LLStack implements LLStackQInterface{

SintNode head = null,tail=null;

@Override
public void enQueue(int num) 
{
  SintNode n=new SintNode(num);
  if(head==null)
    {
    head=n;
    tail=n;
    }
  else
    {
    tail.nextNode=n;
    tail=n;
    }
}

@Override
public int deQueue() 
{
  int a=0;
  if(head!=null)
    {
    a=head.num;
    head=head.nextNode;
    }
return a;
}

@Override
public SintNode getHeadOfLinkedList() 
{
  return head;
}

@Override
  public int getMin(){
    if(head==null)
      {
      return 0;
      }

int min=99999;

SintNode curr=head;

while(curr!=null)
  {
  if(curr.num<min)
    {
    min=curr.num;
    }
  curr=curr.nextNode;
  }

return min;

  }
 }
}
