package polimorfiInterfeiEMetAbstract;

public abstract class Animal {
	
	 //atributo
	private String nome;
	private int idade;
	
	
	
	public Animal( String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		
		
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void filhote() {
		if(getIdade() > 3) {
			System.out.println("\nSeu animal não é mais filhote!");			
		}
		else {
			System.out.println("\nSeu animal é um filhotinho!!!");
		}
	}
	
	public abstract void emitirSom(); //metodos abstratos
	
	public abstract void acao();
	

}
