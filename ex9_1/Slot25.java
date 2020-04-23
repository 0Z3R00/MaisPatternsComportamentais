package ex9_1;

public class Slot25 implements Slot{
	private Slot slot;
	public double valor;

	public Slot25() {
		this.valor = 0.25;
	}

	@Override
	public void setSlot(Slot slot) {
		this.slot = slot;
	}


	@Override
	public double processar(Moeda moeda) {

		if (moeda.getValor() == valor) {
			System.out.println("Moeda de 25 centavos inserida...");
			return 0.25;
		} else if (this.slot != null) {
			this.slot.processar(moeda);

		} else  
			System.out.printf("moeda de invalida");
		return valor;


	}

}
