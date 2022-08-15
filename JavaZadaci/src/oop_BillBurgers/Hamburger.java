package oop_BillBurgers;

public class Hamburger {
	
	private String name;
	private String meat;
	private String breadRollType;
	private Double price;
	
	private String addition1Name;
	private double addition1Price;
	
	private String addition2Name;
	private double addition2Price;
	
	private String addition3Name;
	private double addition3Price;
	
	private String addition4Name;
	private double addition4Price;
	
	
	public Hamburger(String name, String meat, String breadRollType, Double price) {
		super();
		this.name = name;
		this.meat = meat;
		this.breadRollType = breadRollType;
		this.price = price;
	}

	
	
	public void addHamburgerAddition1() {
		System.out.println(this.addition1Name); 
	}

	public void addHamburgerAddition2() {
		System.out.println(this.addition2Name); 
	}
	
	public void addHamburgerAddition3() {
		System.out.println(this.addition3Name); 
	}
	
	public void addHamburgerAddition4() {
		System.out.println(this.addition4Name); 
	}
	
	
	public double itemizeHamburger() {
		if(this.addition1Name !=null) {
			this.price+=this.ad
		}
		
		
		
		
	}
	
	
	
	
}
