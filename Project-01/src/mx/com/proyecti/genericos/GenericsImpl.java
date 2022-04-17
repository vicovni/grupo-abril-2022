package mx.com.proyecti.genericos;

public class GenericsImpl {

	public static void main(String[] args) {
		
		//Clases con manejo de un tipo de dato espec�fico
		CacheString myMessage = new CacheString();
		CacheShirt myShirt = new CacheShirt();

		//Uso de gen�ricos
		CacheAny<String> myGenericMessage = new CacheAny<>();
		
		CacheAny<Shirt> myGenericShirt = new CacheAny<>();
		
		myMessage.add("Tipo de dato String");
		myGenericMessage.add("Tipo de dato Gen�rico");
		
		System.out.println("Mensaje tipo String: " + myMessage.get() + ", Mensaje de tipo Gen�rico" + myGenericMessage.get());

	}

}
