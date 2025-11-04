package cafe;
import java.util.*;
public class Cafe {

	public static Scanner sc = new Scanner(System.in);

	public Cafe()
	{
		Menu.createMenu();
		Table.createTable();
	}

	public static void main(String[] args) {

		Cafe TheUrbo = new Cafe();

		int owner_passkey = 17;
		int staff_passkey = 123;

		int ch=0;
		System.out.println("Enter your job role:");
		System.out.println("1.Owner \n2.Staff");
		ch=sc.nextInt();
		switch (ch) {
		//to check authenticity if its owner or staff we can have passwords 
		//if it matches then allow the operation
		case 1:
			System.out.println("Enter your passkey: ");
			int p = sc.nextInt();
			if(p == owner_passkey)
			{
				System.out.println("Enter 1.Edit menu 2.Edit tables");
				int opt = sc.nextInt();
				int option=0;
				switch(opt)
				{
				case 1:
					do {
						System.out.println("1. Add menu \n2.Remove menu");
						option = sc.nextInt();
						switch(option)
						{
						case 1:
							Menu.addMenu();
							break;
						case 2:
							Menu.removeMenu();
							break;
						}
					}while(option>0 && option<3);
					
					break;
					
				case 2:
						System.out.println("1. Add tables \n2.Remove tables");
						option = sc.nextInt();
						switch(option)
						{
						case 1:
							Table.addTable();
							break;
						case 2:
							Table.removeTable();
							break;
						}

					break;
				}
				
			}
			else
				System.out.println("Wrong password");

			break;

		case 2:
			System.out.println("Enter your passkey: ");
			int p2 = sc.nextInt();
			if(p2 == staff_passkey)
			{
				int exitChoice = 0;
				do
				{
					System.out.println("Enter 1: Customer arriving 2:Any customer leaving ");
					int choice = sc.nextInt();
					switch(choice)
					{
					case 1:
					{
						System.out.println("Enter customer name");
						String name = sc.next();
						System.out.println("Enter customer number");
						int customerNo = sc.nextInt();
						Customer c = new Customer(name,customerNo);
						if(WaitingQueue.customerArrival(c) == 1)
						{
							System.out.println("Here is the menu :");
							Menu.displayMenu();
							System.out.println("take order from customer");
							c.takeOrder();
							c.CalculateBill();
						}
						else
						{
							System.out.println("Please ask the customer to wait in queue");
							WaitingQueue.waitingLine.add(c);
						}
					}
					break;
					case 2:
					{
						System.out.println("enter the table number which is now available");
						int z = WaitingQueue.customerLeaving(sc.nextInt());//z checks if queue is empty or not
						if(z == 1)
						{
							Customer front = WaitingQueue.waitingLine.poll();
							System.out.println("Here is the menu :");
							Menu.displayMenu();
							System.out.println("take order from customer");
							front.takeOrder();
							front.CalculateBill();
						}
					}
					break;
					default:
					{
						System.out.println("Invalid Choice");
					}
					}
					System.out.println("Enter 0 to continue cafe 1 to exit cafe");
					exitChoice = sc.nextInt();
				}while( exitChoice != 1);

			}
			else
				System.out.println("Wrong password");

		default:
			break;
		}
	}
}
