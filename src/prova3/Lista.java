package prova3;

import java.util.Iterator;

public class Lista {

	private No inicio;
	private No ultimo;

	private int tamanho;

	public Lista() {

		this.inicio = null;
		this.ultimo = null;
		this.tamanho = 0;
	}

	public boolean isvazia() {

		return inicio == null;
	}

	public void inserir(int galinha) {

		No novo = new No(galinha);
		novo.setGalinha(galinha);

		if (isvazia()) {

			inicio = novo;
			ultimo = novo;
			ultimo.setProximo(inicio);
		} else {
			novo.setProximo(inicio);
			inicio = novo;
			ultimo.setProximo(inicio);

		}

		tamanho++;

	}

	public void listar() {
		No controle = inicio;
		while (controle.getProximo() != inicio) {
			System.out.println("Valor: " + controle.getGalinha());
			controle = controle.getProximo();
		}
		System.out.println("Valor: " + controle.getGalinha());
	}
	private class Interator implements Iterator<Integer>{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}



}
