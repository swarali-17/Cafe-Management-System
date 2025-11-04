package cafe;

import java.util.*;

public class WaitingQueue {
	
	static Queue<Customer> waitingLine = new LinkedList<>();
	
	 public static int customerArrival(Customer c)  //this function returns 1 if table is available
	    {
	        int flag2 = 0;
	        for(Table t : Table.tables)
	        {
	            if(t.flag == true) {
	                System.out.println("Table number " + t.tableNo +" : Available");
	                t.flag = false;
	                flag2 = 1;
	                break;
	            }
	        }
	        return flag2;
	    }
	    public  static int customerLeaving(int tableNo)
	    {
	        int someoneWaiting = 0; //if queue is empty someonewaiting = 0;
	        Table t = null;
	        
	        for( Table t1 : Table.tables)
	        {
	            if(t1.tableNo == tableNo)
	            {
	                t1.flag = true;
	                t = t1;
	                break;
	            }
	        }
	        if(! waitingLine.isEmpty())
	        {
	            System.out.println("Customer No " + waitingLine.peek().customerNo+ " Table available, Pls go to tableNo " + tableNo );
	            t.flag = false;
	            someoneWaiting = 1;
	        }
	        return someoneWaiting;
	    }

}
