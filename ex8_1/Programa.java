package ex8_1;

public class Programa {
	
	public static void main(String[] args) {
		//Publicador publicador = new Publicador();
		//publicador.consomeNoticia("Texto bem longo, varias e varias linhas ", 18, 4, "Atividade 7");
		ConsomeNoticia agregadorTopico = new AgregadorTopico("jogos");
		Noticiario noticiario = new NoticiarioAssina(agregadorTopico);
		
		noticiario.notificaNoticia("novo jogo para android e ios", 1, 1, "jogos");
		noticiario.notificaNoticia("versão para mobile lançada", 3, 2, "jogos");
		noticiario.notificaNoticia("GTA 6", 17, 2, "jogos");
		noticiario.notificaNoticia("Jogos bem famosos",17, 3, "jogos");
		noticiario.notificaNoticia("informaçoes", 23, 1, "jogos");
		noticiario.notificaNoticia("novo jogo para android e ios", 10, 4, "jogos");
		noticiario.notificaNoticia("versão para mobile lançada", 22, 4, "jogos");
		noticiario.notificaNoticia("GTA 6", 21, 4, "jogos");
		noticiario.notificaNoticia("Jogos bem famosos", 30, 4, "jogos");
		noticiario.notificaNoticia("informaçoes", 23, 1, "jogos");
			noticiario.notificaNoticia("informaçoes", 13, 5, "Política");
		
			System.out.println("===========//§§§\\==========");
		
		ConsomeNoticia agregadorMensal = new AgregadorMensal();
		noticiario = new NoticiarioAssina(agregadorMensal);
		noticiario.notificaNoticia("atividade", 4, 1, "Tecnologia");
		noticiario.notificaNoticia("do professor", 5, 1, "Tecnologia");
		noticiario.notificaNoticia("anderson ", 10, 1, "Tecnologia");
		noticiario.notificaNoticia("materia Arquitetura", 14, 1, "Tecnologia");
		noticiario.notificaNoticia("Densenvolvimento de sistemas multicamadas", 22, 1, "Tecnologia");
		noticiario.notificaNoticia("Fofoca", 14, 2, "Televisão");
		noticiario.notificaNoticia("Fofoca", 23, 2, "Televisão");
		noticiario.notificaNoticia("qualquer coisa",3 , 3, "Outros");
		noticiario.notificaNoticia("qualquer coisa", 7, 3, "Outros");
		noticiario.notificaNoticia("qualquer coisa", 16, 3, "Outros");
		noticiario.notificaNoticia("qualquer coisa", 3, 4, "Outros");
	}

}
