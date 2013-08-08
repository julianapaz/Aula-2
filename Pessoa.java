
public class Pessoa {
  private String nome;
	private int matricula;
	
	//contrutor nao tem nome e sim o tipo Pessoa
	public Pessoa(String nome){//pratica de se usar o parametro com o mesmo do atributo
	this.nome = nome;//this um parametro zero
	this.matricula = -1;
	}
	
	public String getNome(){
		return nome;
	}	
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	public int getMatricula(){
		return matricula;
	}
	
	private static int converteInteiro(String valor){
		return Integer.parseInt(valor);		
	
	}
		
	
public static void main(String[] args) {
		Pessoa p = new Pessoa(args[0]);
		p.setMatricula(converteInteiro(args[1]));
		System.out.println(p.getNome());
		System.out.println(p.getMatricula());
		
	}
}
