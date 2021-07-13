package polimorfiInterfeiEMetAbstract;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade) {
		super(nome, idade); 
	}
	
	public void imprimirInfo() {
		System.out.println("\n" + getNome() + " com " + getIdade() + " anos ");
	
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Ruuuruumm ruuuruummm....");
	}
	
	
	@Override
	public void acao() {
		System.out.println("Coorre Alzao!!  ////////////>");
	}
	
	
	
	
	

}
