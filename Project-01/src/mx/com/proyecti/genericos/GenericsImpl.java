package mx.com.proyecti.genericos;

public class GenericsImpl {

	public static void main(String[] args) {
		
		//Clases con manejo de un tipo de dato específico
		CacheString myMessage = new CacheString();
		CacheShirt myShirt = new CacheShirt();

		//Uso de genéricos
		CacheAny<String> myGenericMessage = new CacheAny<>();
		
		CacheAny<Shirt> myGenericShirt = new CacheAny<>();
		
		myMessage.add("Tipo de dato String");
		myGenericMessage.add("Tipo de dato Genérico");
		
		System.out.println("Mensaje tipo String: " + myMessage.get() + ", Mensaje de tipo Genérico" + myGenericMessage.get());

	}

}
