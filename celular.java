package polimorfiInterfeiEMetAbstract;

public class celular extends telefone {
	
	public celular() {
		super("celular"); 
	}
	
	@Override // sobrescrita do metodo abstrato da classe telefone
	public void toca(int codigoToque) { //metodo polimorfo da classe abstrata
		switch(codigoToque) {
		case 1:
			System.out.println("Trimm... triim");
			break;
		case 2:
			System.out.println("biii.... bibibibi..... bibibii");
			break;
		default:
			System.out.println("tendann... tandaan");
			
			
		
		
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("O numero: " + numero + " é um celular...");
		
	}

}
