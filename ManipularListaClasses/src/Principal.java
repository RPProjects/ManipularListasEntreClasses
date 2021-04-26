import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Jogadores j1 = new Jogadores("Raul", "Meia", 50);
		Jogadores j2 = new Jogadores("Diego", "Zagueiro", 40);
		
		j1.mostrarJogador();
		j2.mostrarJogador();
		
		List<Jogadores> players = new ArrayList<Jogadores>();
		players.add(j1);
	 	players.add(j2);

		Time time1 = new Time(j1);
		time1.mostraJogadorContratado();
		time1.modificaValorJogador();
		time1.mostraJogadorContratado();
		
		Time time2 = new Time(players);
		time2.mostraJodoresContratados();
		time2.modificaValorJogadorDaLista(j2, 40);
		
		j1.mostrarJogador();
		j2.mostrarJogador();
		
	}

}
