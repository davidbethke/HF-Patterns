package com.bigshoulders.composite;



public class MenuApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 // ArrayList<Component> allMenus = new ArrayList<Component>();
	 // allMenus.add(new MenuItem("fish", "fried fish", false, 4.99));
		Component pancakeMenu = new Menu("Pancake", "pancakes only");
		Component dinerMenu = new Menu("Diner Menu", "anything on the diner");
		Component dessertMenu = new Menu("Dessert Menu","all sweets");
		Component crepeMenu = new Menu("Crepes", "Crepes not creeps");
		Component allMenus = new Menu("All Menus", "top of the tree");
		allMenus.add(pancakeMenu);
		pancakeMenu.add(new MenuItem("fullstack", "stack of cakes", true, 6.99));
		allMenus.add(dinerMenu);
		dinerMenu.add( new MenuItem("Burger", "good burger", false, 5.99));
		dinerMenu.add( new MenuItem("Veggie Plate", "all veggies", true, 8.99));
		dinerMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("cake", "Chocolate", false, 2.99));
		dessertMenu.add(new MenuItem("fruit basket", "Fresh fruit", true, 2.99));
		Waitress waitress = new Waitress(allMenus);
		waitress.printVegetarianMenu();
		
		
		
	}

}
