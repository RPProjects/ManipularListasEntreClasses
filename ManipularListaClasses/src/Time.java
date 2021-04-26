import java.util.ArrayList;
import java.util.List;

public class Time {
	
	Jogadores j1 = new Jogadores(null, null, 0);
	List<Jogadores> jogadoresComprados = new ArrayList<Jogadores>();
	
	Time (Jogadores jogador1){
		//j1 = jogador1;
		j1.setNome(jogador1.getNome());
		j1.setPosicao(jogador1.getPosicao());
		j1.setValor(jogador1.getValor());
	}
	Time (List<Jogadores> jogadores){
		jogadoresComprados = jogadores;
	}
	
	public void modificaValorJogador() {
		j1.setValor(70);
	}
	
	public void modificaValorJogadorDaLista(Jogadores jogador, double valor) {
		if (jogadoresComprados.contains(jogador)) {
			System.out.println("Jogador está na lista: " + jogadoresComprados.indexOf(jogador));
			System.out.println("E joga na posição: " + jogadoresComprados.get(jogadoresComprados.indexOf(jogador)).getPosicao());
		double valorAtual = jogadoresComprados.get(jogadoresComprados.indexOf(jogador)).getValor();
		jogadoresComprados.get(jogadoresComprados.indexOf(jogador)).setValor(valorAtual+valor);
		System.out.println("Jogador valorizou seu passe em: " + jogadoresComprados.get(jogadoresComprados.indexOf(jogador)).getValor());
		} 		
	}
	
	public void mostraJodoresContratados() {
		System.out.println("Jogadores Contratados");
		 for (Jogadores elem : jogadoresComprados) {
			 System.out.println("Nome: " + elem.getNome() +
						" Posição: " + elem.getPosicao() +
						" Valor: " + elem.getValor());
		 }
	}
	
	public void mostraJogadorContratado() {
		System.out.println("Jogador contratado \n"
				+ "Nome: " + j1.getNome() +
				" Posição: " + j1.getPosicao() +
				" Valor: " + j1.getValor());
	}
}
