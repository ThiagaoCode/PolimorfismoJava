package polimorfiInterfeiEMetAbstract;

public class Preguica extends Animal {
	
	
	
	public Preguica(String nome, int idade) {
		super(nome, idade); 
	}
	
	public void imprimirInfo() {
		System.out.println("\n" + getNome() + " com " + getIdade() + " anos ");
	
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Rriririri riririririr....");
	}
	
	
	@Override
	public void acao() {
		System.out.println("Escalaaa Siiid, mosca não!! ||||||||||||>");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * código anterior sem polimorfismo
	 * 
	 * private String deitar;
	private String escalar;
	
	public Preguica(String nome, int idade, double peso, String deitar, String escalar) {
		super( nome, idade, peso);
		this.deitar = deitar;
		this.escalar = escalar;
		
	}

	public String getDeitar() {
		return deitar;
	}

	public void setDeitar(String deitar) {
		this.deitar = deitar;
	}

	public String getEscalar() {
		return escalar;
	}

	public void setEscalar(String escalar) {
		this.escalar = escalar;
	}
	
	
	
	public void imprimirInfo() {
		System.out.println("\nSeu animal: " + getNome() + " com " + getIdade() + " anos " + " \npesando: " + getPeso() + " Kg" 
	+ "\nEle deita: " + getDeitar() + " \n e escala: " + getEscalar());
		
	} */

}
