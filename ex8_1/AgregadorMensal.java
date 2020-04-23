package ex8_1;

import java.util.ArrayList;
import java.util.List;

public class AgregadorMensal implements ConsomeNoticia {
	private int mesCorrente = 0;
	private List<Conteudo> conteudos = new ArrayList<>();


	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		Conteudo c = new Conteudo (textoNoticia, dia ,mes, topico);
		if(mesCorrente == 0) {
			mesCorrente = mes;
			conteudos.add(c);
		}else {
			if(mesCorrente == mes) {
				conteudos.add(c);
			}else {
				System.out.println("Mudou o mês, todas as noticias do mês passado");
				for(Conteudo conteudo: conteudos) {
					System.out.println(conteudo.toString());

				}
				conteudos.clear();
				mesCorrente = mes;
				conteudos.add(c);
			}
		}
	}
}
