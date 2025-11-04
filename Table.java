package cafe;

import java.util.*;

public class Table {
	
	static Scanner sc = new Scanner(System.in);
	
	 int tableNo;
     boolean flag;     //flag = true means Empty table

     public Table(int tableNo, boolean flag)
     {
         this.tableNo = tableNo;
         this.flag = flag;
     }
     
     static LinkedList<Table> tables = new LinkedList<>();
     
     public static void createTable()
     {
    	 for(int i = 0; i < 5; i++)
         {
             Table t = new Table(i+1,true);
             tables.add(t);
         }
     }
     
     static void addTable()
     {
    	 System.out.println("Enter total no. of tables to be added: ");
    	 int n = sc.nextInt();
    	 
    	 for(int i=5;i<(n+5);i++)
    	 {
    		 Table t = new Table((i+1),true);
             tables.add(t);
             System.out.println("Table no. "+(i+1)+" added!");
    	 }
     }
     
     static void removeTable()
     {
    	 int exit=0;
    	 do {
    		 System.out.println("Enter which table no. you want to remove ?");
    		 int no = sc.nextInt();
    		 tables.remove(no-1);
    		 System.out.println("Enter 1 to delete more tables.");
    		 exit = sc.nextInt();
    	 }while(exit == 1);
     }
   
}
