package easy;

public class AddTwoNumbers {
	
	    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	        int outNumber1 = 0;
	        int outNumber2 = 0;
	        ListNode targetNode = new ListNode(); 
	        
	        int i = 0;
	        while(l1 != null)
	        {
	            outNumber1 = (int) Math.pow(10,i) * l1.val + outNumber1; 
	            l1=l1.next;
	            i++ ;           
	        }
	        int j =0;
	        while(l2 != null)
	        {
	            outNumber2 = (int) Math.pow(10,j) * l2.val + outNumber2; 
	            l2=l2.next;
	            j++;           
	        }
	        
	        int revOutput = outNumber1+outNumber2;
	        
	        while(revOutput != 0)   
	        {  
	        int remainder = revOutput % 10; 
	            targetNode = new ListNode(remainder);
	            
	         revOutput=revOutput/10;
	        }  
	        
	        System.out.println(targetNode.val);
	        return targetNode;
	        
	        
	    }
	    
	    public static void main(String args[])
	    {
	    	ListNode node1 = new ListNode(1);
	    	node1.next = new ListNode(5);
	    	node1.next.next = new ListNode(3);
	    	
	    	ListNode node2 = new ListNode(2);
	    	node2.next = new ListNode(4);
	    	node2.next.next= new ListNode(1);
	    	addTwoNumbers(node1,node2);
	    	
	    	
	    	
	    }
	}


