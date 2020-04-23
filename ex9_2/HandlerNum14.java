package ex9_2;

public class HandlerNum14 implements Handler {
	private Handler handler;
	private int num;

	public HandlerNum14() {
		this.num = 14;
	}

	@Override
	public void setHandler(Handler handler) {
		this.handler = handler;

	}

	@Override
	public void process(Numero numero) {

		if(numero.getNumero() == num) {
			System.out.println(handlerRequest(numero.getNumero()));
		}else if(handler != null) {
			handler.process(numero);
		}else {
			System.out.println("Numero não pertence a um Handler");
		}
	}


	@Override
	public String handlerRequest(int numero) {
		return "Numero do Handler é :"+ numero;
	}

}
