package ex9_1;

public class Slot50 implements Slot{
	private Slot slot;
	public double valor;

	public Slot50() {
		this.valor = 0.50;
	}

	@Override
	public void setSlot(Slot slot) {
		this.slot = slot;
	}


	@Override
	public double processar(Moeda moeda) {

		if (moeda.getValor() == valor) {
			System.out.println("Moeda de 50 centavos inserida...");
			return 0.50;
		} else if (this.slot != null) {
			this.slot.processar(moeda);

		} else  
			System.out.printf("moeda de invalida");
		return valor;


	}
}
