package ex8_1;

import java.util.ArrayList;
import java.util.List;

public class AgregadorTopico implements ConsomeNoticia {
	private String topico;
	private List<Conteudo> conteudos = new ArrayList<>();
	
	public AgregadorTopico(String topico) {
		setTopico(topico);
	}

	
	public String getTopico() {
		return topico;
	}


	public void setTopico(String topico) {
		this.topico = topico;
	}


	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		if(getTopico().equals(topico)) {
			Conteudo conteudo = new Conteudo(textoNoticia, dia, mes, topico);
			conteudos.add(conteudo);
		}
		if(conteudos.size() >= 10) {
			System.out.println("Chegou a 10 Noticia do topico: "+getTopico());
			conteudos.forEach(c -> System.out.println(c));
			conteudos.clear();
		}

	}

}
