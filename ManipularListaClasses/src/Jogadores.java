
public class Jogadores {
	private String nome;
	private String posicao;
	private double valor;
		
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getPosicao() {
		return posicao;
	}


	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public Jogadores(String nome, String posicao, double valor) {
		super();
		this.nome = nome;
		this.posicao = posicao;
		this.valor = valor;
	}
	
	public void mostrarJogador() {
		System.out.println("Nome: " + this.getNome() +
						" Posição: " + this.getPosicao() +
						" Valor: " + this.getValor());
	}
}
