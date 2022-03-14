package gt.edu.umg.progra3.parcial1.pilas;

import java.util.LinkedList;

public class PilaImplementar implements Pila{
	
	private LinkedList<String> list = new LinkedList<>();

	@Override
	public void push(String item) {
		// TODO Esbozo de método generado automáticamente
		list.addFirst(item); //añadir
	}

	@Override
	public String pop() {
		// TODO Esbozo de método generado automáticamente
		return list.removeFirst(); //eliminar el primero
	}

	@Override
	public String peek() {
		// TODO Esbozo de método generado automáticamente
		return list.getFirst();//mostrar el primero
	}

	@Override
	public int size() {
		// TODO Esbozo de método generado automáticamente
		return list.size();// mostrar el tamaño de la lista
	}

	@Override
	public boolean isEmpty() {
		// TODO Esbozo de método generado automáticamente
		return list.isEmpty(); //mostar si esta vacio o no
	}
	
	
	   

}
