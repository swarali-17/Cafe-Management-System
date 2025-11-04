package cafe;

import java.util.*;

public class Menu {

	static HashMap<String,Integer>coffee = new HashMap<>();
	static HashMap<String,Integer>croissants = new HashMap<>();
	static HashMap<String,Integer>dessert = new HashMap<>();

	static Scanner sc = new Scanner(System.in);

	public static void createMenu() 
	{
		coffee.put("espresso",120);
		coffee.put("americano",150);
		coffee.put("cappuccino",180);
		coffee.put("latte",200);
		coffee.put("mocha",220);
		coffee.put("iced-coffee",180);
		coffee.put("hot-chocolate",200);

		croissants.put("plain",120);
		croissants.put("chocolate",150);
		croissants.put("almond",160);

		dessert.put("cheesecake",220);
		dessert.put("chocolate-brownie",150);
		dessert.put("fruit-parfait",220);
		dessert.put("icecream",160);
		dessert.put("cookies",120);
		dessert.put("tiramisu",220);
	}

	public static void displayMenu()
	{
		System.out.println("---COFFEE:---- ");
		for (Map.Entry<String, Integer> entry : coffee.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " +" Rs. "+ value);
		}
		System.out.println();
		System.out.println("---CROISSANTS---");
		for (Map.Entry<String, Integer> entry : croissants.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " +" Rs. "+ value);
		}
		System.out.println();
		System.out.println("---DESERTS---");
		for (Map.Entry<String, Integer> entry : dessert.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " +" Rs. "+ value);
		}
	}

	public static boolean isItemInMenu(String item)
	{
		if(coffee.containsKey(item))
			return true;
		else if(croissants.containsKey(item))
			return true;
		else if(dessert.containsKey(item))
			return true;
		else 
			return false;
	}

	public static int getItemPrice(String item)
	{
		if (coffee.containsKey(item)) 
			return coffee.get(item);
		else if (croissants.containsKey(item)) 
			return croissants.get(item);
		else if (dessert.containsKey(item)) 
			return dessert.get(item);

		return -1;
	}

	public static void addMenu() {
		System.out.println("What do you like to add");
		String item=sc.next();
		if (item.equals("coffee")) {
			System.out.println("Enter the name of the new item and its price");
			String newItem = sc.next();
			int price = sc.nextInt();
			coffee.put(newItem, price);
		} else if (item.equals("croissants")) {
			System.out.println("Enter the name of the new item and its price");
			String newItem = sc.next();
			int price = sc.nextInt();
			croissants.put(newItem, price);
		} else {
			System.out.println("Enter the name of the new item and its price");
			String newItem = sc.next();
			int price = sc.nextInt();
			dessert.put(newItem, price);
		}
	}

	public static void removeMenu() {
		System.out.println("What do you like to remove");
		String item=sc.next();
		if (item.equals("coffee")) {
			System.out.println("Enter the name of item");
			String newItem=sc.next();
			coffee.remove(newItem);

		} else if (item.equals("croissants")) {
			System.out.println("Enter the name of item");
			String newItem=sc.next();
			croissants.remove(newItem);

		} else {
			System.out.println("Enter the name of item");
			String newItem=sc.next();
			dessert.remove(newItem);

		}
	}

}
