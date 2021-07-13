package polimorfiInterfeiEMetAbstract;

public interface Figuras {
	
	public String nomeInterface = "Figuras"; // nome da interface
	
	abstract public String getNome(); // metodos abstractis
	abstract public void setNome(String nome);
	
	public double getArea();  // metodos nao abstrados
	public double getPerimetro();
	double getDiagonal();
	
		

}
