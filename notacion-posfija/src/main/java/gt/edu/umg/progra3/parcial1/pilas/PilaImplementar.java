package gt.edu.umg.progra3.parcial1.pilas;

import java.util.LinkedList;

public class PilaImplementar implements Pila{
	
	private LinkedList<String> list = new LinkedList<>();

	@Override
	public void push(String item) {
		// TODO Esbozo de m�todo generado autom�ticamente
		list.addFirst(item); //a�adir
	}

	@Override
	public String pop() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return list.removeFirst(); //eliminar el primero
	}

	@Override
	public String peek() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return list.getFirst();//mostrar el primero
	}

	@Override
	public int size() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return list.size();// mostrar el tama�o de la lista
	}

	@Override
	public boolean isEmpty() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return list.isEmpty(); //mostar si esta vacio o no
	}
	
	
	   

}