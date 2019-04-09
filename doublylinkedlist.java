//
package data.structure;

public class doublylinkedlist 
{
    Node head;
   static class Node
    {
        int data;
        Node prev,next;
        
        Node(int d)
        {
            data = d;
            next = null;
            prev =null;
        }
        
    }
     static int c=0;
   public static Node insert(doublylinkedlist list,int data)
   {
     
       Node new_node = new Node(data);
       Node last;
       Node temp = new_node;
       Node temp1 ;
       last = list.head;
    
       if(list.head == null)
       {
           //c++;
           list.head  = new_node;
           
           //temp1 = new_node;
              
       }
          else
       {
          
           last = list.head;
           temp1 = last;
         
           
           while(last.next!=null)
           {
               c++;
               last = last.next;
              
           }
           if((last.next == null)&&(last.prev == null))  //to insert after first node and temp1 stores the address of first node
           { 
           last.next  = new_node;
           last.next.prev = temp1;
          System.out.print("co:\n"+c+last.next);
           }
           else        //to insert after second node and so on...
           {
           last.next  = new_node;
           last.next.prev = last.prev.next;
           System.out.print("\nc:\n"+c+last.next);
               
           }
         
           
       }
       
       return last;
   }
   
   public static void print(doublylinkedlist list)
   {
       Node curnode;
       curnode = list.head;
     while(curnode != null)
       {
           System.out.println("\n"+curnode.data);
           curnode  = curnode.next;
       }
       
   }
   
   public static void main(String[]args)
   {
       int cv=0;
     doublylinkedlist list = new doublylinkedlist();
     int n=4;
     list.insert(list,1);
     cv++;
     list.insert(list,2);
     cv++;
     list.insert(list,3);
     cv++;
     list.insert(list,4);
     cv++;
     
     print(list);
   }
   
    
}
