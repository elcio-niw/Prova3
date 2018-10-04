package prova3;

public class No {
	
	private int galinha;
	private No proximo;
	public No(int  galinha ){
		super();
		this.galinha = galinha;
		this.proximo= null;
		
		
	}
	public int getGalinha() {
		return galinha;
	}
	public void setGalinha(int galinha) {
		this.galinha = galinha;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	
	
	
	

}
