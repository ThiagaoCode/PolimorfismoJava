package polimorfiInterfeiEMetAbstract;

public class fixo extends telefone {
	
	public fixo() {
		super("Telefone fixo");
	}
	
	@Override
	public void toca(int numToques) {
		for(int i=0; i<numToques; i++) {
			System.out.println("Plinpilinpiln...");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nDiscando: " + numero);
	}
	
	

}
