package ex9_1;


import javax.swing.JOptionPane;

public class Maquina {

	public static void main(String[] args) {
		Slot slot1_00 = new Slot1();
		Slot slot50   =	new Slot50();
		Slot slot25   =	new Slot25();
		Slot slot10   =	new Slot10();
		Slot slot5    =	new Slot5();


		slot5.setSlot(slot10);
		slot10.setSlot(slot25);
		slot25.setSlot(slot50);
		slot50.setSlot(slot1_00);


        String escolhido = "";
		double total = 0;
		double preco = 0;
		

		System.out.println("");
		int produto = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu produto: \n1 - Refrigerante 5.50 \n2 - Salgadinho 4.75 \n3 - Agua 3.3 \n4 - Bala 3.25 \n5 - Chiclete 1.55"));
		if(produto == 1) {
			preco = 5.50;
			escolhido = "Refrigerante";
		}
		if(produto == 2) {
			preco = 4.75;
			escolhido = "Salgadinho";

		}
		if(produto == 3) {
			preco = 3.30;
			escolhido = "Agua";
		}
		if(produto == 4) {
			preco = 3.25;
			escolhido = "Bala";
		}
		if(produto == 5) {
			preco = 1.55;
			escolhido = "Chiclete";
		}
		while(total <= preco) {
			double moeda = Double.parseDouble(JOptionPane.showInputDialog("Insira a moeda..."));
			Moeda money = new Moeda(moeda);
			if(slot5.processar(money) > 0){
				total = total + moeda;
			}
		}


		System.out.println("Produto escolhido:"+escolhido+"\nTotal de reais inserido na maquina R$: " + total);
		System.out.printf("Troco R$: %.2f" , (total - preco));
	}

}

