package prova3;

import java.util.Iterator;

public class Principal {
	
	public static void main (String args []) {
		
		Lista lista = new Lista();
		for(int i=0; i<=41;i++) {
			
			lista.inserir(i);
		}
		
		lista.listar();
		
		 Iterator<Lista> carrosAsIterator = lista.iterator();
         while (carrosAsIterator.hasNext()){
                Lista it = carrosAsIterator.next();
		
		
		
		
		
		
		
	}

}
