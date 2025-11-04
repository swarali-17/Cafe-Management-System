package cafe;
import java.util.*;
public class Customer {
	
	int customerNo;
    String name;
    
    public Customer(String name,int customerNo)
    {
        this.customerNo=customerNo;
        this.name = name;
    }

    HashMap<String, Integer>order = new HashMap<>();
    
    public void takeOrder()
    {
        Scanner sc = new Scanner(System.in);
        int exitChoice = 0;
        System.out.println("Enter the items one by one");
        do
        {
            System.out.println("Enter the item");
            String item = sc.next();
            if(!Menu.isItemInMenu(item) )
            {
                System.out.println("Item not present in menu");
            }
            else
            {
                System.out.println("Enter qty");
                int qty = sc.nextInt();
                order.put(item, qty);
            }
            System.out.println("Enter 0 to order more 1 to stop");
            exitChoice = sc.nextInt();
        }while(exitChoice != 1);
        System.out.println("Your Order");
        for (Map.Entry<String, Integer> entry : order.entrySet())
        {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " +" Qty: "+ value);
        }
    }
    public void CalculateBill()
    {
        int totalBill = 0;
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();
            int itemPrice = Menu.getItemPrice(item);
            if (itemPrice == -1) {
                System.out.println("Item '" + item + "' is not in the menu. Please choose from the menu.");
                continue;
            }
            totalBill += itemPrice * quantity;
        }
        System.out.println("Total Bill: " + totalBill);
    }
}
