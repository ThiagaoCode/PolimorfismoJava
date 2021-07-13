package polimorfiInterfeiEMetAbstract;

public class TesteAnimais {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro(" Akins ", 6);
		Cavalo horse = new Cavalo(" Abayomi ", 3);
		Preguica sid = new Preguica(" Sid ", 10);
		
		dog.filhote();
		System.out.println("\n");
		dog.imprimirInfo();
		System.out.println("\n");
		dog.emitirSom();
		System.out.println("\n");
		dog.acao();
		
		
		
		
		System.out.println("\n\t ***** outro animal**** ");
		
		
		
		horse.filhote();
		System.out.println("\n");
		horse.imprimirInfo();
		System.out.println("\n");
		horse.emitirSom();
		System.out.println("\n");
		horse.acao();
		
		System.out.println("\n\t ***** outro animal**** ");
		
		
		
		sid.filhote();
		System.out.println("\n");
		sid.imprimirInfo();
		System.out.println("\n");
		sid.emitirSom();
		System.out.println("\n");
		sid.acao();
		
		System.out.println("\n\t ***** outro animal**** ");
		

	}

}
