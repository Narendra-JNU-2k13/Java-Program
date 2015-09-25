import java.util.*;
class node
{
    public int data;
    public node next;
}

class queue
{
    node front,rear;
    queue()
    {
        front=null;
        rear=null;
    }
    
    public void enque()
    {
       int t;
       System.out.println("\n\t Enter data in node : - ");
       Scanner sc=new Scanner(System.in);
       t=sc.nextInt();
       node t1=new node();
         t1.data=t;
         t1.next=null;
         if(rear==null)
         {  
             rear=t1;
             front=t1;
         }   
         else
         {  
             rear.next=t1;
             rear=t1;
         }   
       System.out.println("\n\t Enqueue Sucessful ....");
    }
    
    public void deque()
    {
        if(front==null)
          {
            System.out.print("\n\t Sorry !! Queue is empty, Dequeue failed... ");
          }
          else
          {
            if(front==rear)
            { front=rear=null;}
            else
            { front=front.next; }
            System.out.println("\n\t Dequeue Successful...\n");
          }
    }
    
    public void display()
    {
        node t2;
        t2=front;
        if(t2!=null)
        {
            while(t2!=rear)
            {
              System.out.print("-->"+t2.data);
              t2=t2.next;
             }
            System.out.print("-->"+t2.data);    
        }
        else
        {    
            System.out.println("\n\t Sorry !! There is no element in queue...");
        }
    }      
}

public class DataStructure {

    public static void main(String[] args)
    {
      
        queue q1=new queue();
        Scanner sc1=new Scanner(System.in);
        int ch;
        do
        {
            System.out.println("\n\t1. Enque\n\t2. Deque\n\t3. Didplay\n\t0. Exit");
            System.out.print("\t Please Enter your choice - ");
            ch=sc1.nextInt();
            switch(ch)
            {
                case 1: q1.enque(); break;
                case 2: q1.deque(); break;
                case 3:
                    System.out.print("\n\t\t\t Content of queue\n\t");
                    q1.display();
                    System.out.println(); break;
                case 0: System.exit(0);
                default : System.out.println("\n\t Sorry ! Please enter valid choice ");    
            }
        }while(true);
    }
}
