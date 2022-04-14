package mx.com.proyecti.interfaces;

public class CrushedRock implements SalesCalcs {
	private String name = "Crushed Rock";
	private double salesPrice = 0;
	private double cost = 0;
	private double weight = 0; // en libras
	
	public CrushedRock(double salesPrice, double cost, double weight) {
		super();
		this.salesPrice = salesPrice;
		this.cost = cost;
		this.weight = weight;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double calcSalesPrice() {
		return this.cost * 0.2;
	}

	@Override
	public double calcCost() {
		return this.cost * this.weight;
	}

	@Override
	public double calcProfit() {
		return this.calcSalesPrice() - this.calcCost();
	}

	
}
