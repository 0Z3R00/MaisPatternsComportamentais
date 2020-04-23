package ex9_1;

public class Slot1  implements Slot{
	private Slot slot;
	private double valor;

	public Slot1() {
		this.valor = 1.00;
	}

	@Override
	public void setSlot(Slot slot) {
		this.slot = slot;
	}


	@Override
	public double processar(Moeda moeda) {

		if (moeda.getValor() == valor) {
			System.out.println("Moeda de 1 real inserida...");
			return 1.00;
		} else if (this.slot != null) {
			this.slot.processar(moeda);

		} else  
			System.out.printf("moeda de invalida");
		return valor;


	}

}
