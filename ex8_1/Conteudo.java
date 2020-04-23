package ex8_1;

public class Conteudo {
	private String textoNoticia, topico;
	private int dia, mes;
	
	public Conteudo(String textoNoticia, int dia, int mes, String topico) {
		setTextoNoticia(textoNoticia);
		setDia(dia);
		setMes(mes);
		setTopico(topico);
	}

	public String getTextoNoticia() {
		return textoNoticia;
	}

	public void setTextoNoticia(String textoNoticia) {
		this.textoNoticia = textoNoticia;
	}

	public String getTopico() {
		return topico;
	}

	public void setTopico(String topico) {
		this.topico = topico;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	@Override
	public String toString() {
		return "Conteudo [textoNoticia=" + textoNoticia + ", topico=" + topico + ", dia=" + dia + ", mes=" + mes + "]";
	}

}
