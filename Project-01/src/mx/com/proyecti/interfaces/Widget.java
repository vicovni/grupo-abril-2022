package mx.com.proyecti.interfaces;

public class Widget implements SalesCalcs{

	private String name;
	private double salesPrice;
	private double cost;
	private double weight;
	
	@Override
	public String getName() {
		return "Widget";
	}

	@Override
	public double calcSalesPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcProfit() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Widget(double salesPrice, double cost, double weight) {
		super();
		this.salesPrice = salesPrice;
		this.cost = cost;
		this.weight = weight;
	}
	
	

}
