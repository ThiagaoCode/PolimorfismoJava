package polimorfiInterfeiEMetAbstract;

public abstract class telefone {// classe abstratata
	
	private String tipo; //atributo tipo
	
	abstract public void disca(String numero); //metodos abstratos
	abstract public void toca(int numToques);
	
	public telefone(String tipo) { // construtor
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}
