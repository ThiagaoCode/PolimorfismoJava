package polimorfiInterfeiEMetAbstract;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade) {
		super(nome, idade); 
	}
	
	public void imprimirInfo() {
		System.out.println("\n" + getNome() + " com " + getIdade() + " anos ");
	
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Auuuuuuu au aua auuuu....");
	}
	
	
	@Override
	public void acao() {
		System.out.println("Coorre negoo!  ------------->");
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
}
