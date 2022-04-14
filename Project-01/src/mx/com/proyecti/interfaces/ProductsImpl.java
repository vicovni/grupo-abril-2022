package mx.com.proyecti.interfaces;

public class ProductsImpl {

	public static void main(String[] args) {
		SalesCalcs[] itemList = new SalesCalcs[5];
		ItemReport report = new ItemReport();
		
		itemList[0] = new CrushedRock(0, 0, 0);
		itemList[1] = new CrushedRock(10, 32, 542);
		itemList[2] = new RedPaint(21, 23, 2);
		itemList[3] = new Widget(23, 35, 2);
		itemList[4] = new Widget(32, 234, 2);
		
		System.out.println("----REPORT----");
		for(SalesCalcs calcs: itemList) {
			report.printItemData(calcs);
		}

	}

}
