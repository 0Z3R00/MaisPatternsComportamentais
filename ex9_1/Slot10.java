package ex9_1;

public class Slot10 implements Slot{
	private Slot slot;
	public double valor;

	public Slot10() {
		this.valor = 0.10;
	}

	@Override
	public void setSlot(Slot slot) {
		this.slot = slot;
	}

	@Override
	public double processar(Moeda moeda) {

		if (moeda.getValor() == valor) {
			System.out.println("Moeda de 10 centavos inserida...");
			return 0.10;
		} else if (this.slot != null) {
			this.slot.processar(moeda);

		} else  
			System.out.printf("moeda de invalida");
		return valor;


	}

}
