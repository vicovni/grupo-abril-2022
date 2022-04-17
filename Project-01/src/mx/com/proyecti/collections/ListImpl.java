package mx.com.proyecti.collections;

import java.util.ArrayList;
import java.util.List;

//Cuáles son las ventajas del uso de Genéricos en las colecciones
//Respuesta: El uso genéricos en las colecciones me permite pasar errores que ocurrían en tiempo de ejecución
			// y pasarlos a errores en tiempo de desarrollo
public class ListImpl {

	public static void main(String[] args) {
		List<Integer> partList = new ArrayList<>(3);
		partList.add(new Integer(111));
		partList.add(new Integer(222));
		partList.add(new Integer(333));
		partList.add(new Integer(444));
		//partList.add("Esto es un mensaje");
		
		partList.add(0, new Integer(555));
		
		System.out.println("first part " + partList.get(0));
	}

}
