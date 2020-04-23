package ex8_1;

public class NoticiarioAssina extends Noticiario {
	ConsomeNoticia consumidor;
	
	public NoticiarioAssina(ConsomeNoticia consumidor) {
		this.consumidor = consumidor;
	}
	
	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		// TODO Auto-generated method stub
		consumidor.consomeNoticia(textoNoticia, dia, mes, topico);
	}
}
