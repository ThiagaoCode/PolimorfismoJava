package polimorfiInterfeiEMetAbstract;

public class testeTelefone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		celular celular = new celular();
		fixo fixo = new fixo();
		publico publico = new publico();
		
		telefone telefone = null;
		
		int n = (int) (Math.random()*3.0);
		
		System.out.println("\nNúmero escolhido foi: " + n);
		
		switch(n) {
		case 0: telefone = celular;break;
		case 1: telefone = fixo;break;
		case 2: telefone = publico;break;
		default: System.out.println("\nErro inesperado!!");
		}
		
		if(telefone!=null) {
			telefone.toca(2);
			telefone.disca("99998787");
		}

	}

}
