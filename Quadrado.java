package polimorfiInterfeiEMetAbstract;

public class Quadrado extends BaseFigura implements Figuras{
	//herdando da BaseFgura e implmentando de figuras
	//configura��o de uma multioka heran�a
	
	public Quadrado(double lado, String nome) {
		super(lado, lado, nome);
		nomeClasse = "Quadrado";	
	}
	
	@Override
	public double getDiagonal() {
		return Math.sqrt(2) * lado1;
	}

}
