package ex9_2;

public interface Handler {
	public void setHandler(Handler handler);
	public void process(Numero numero);
	public String handlerRequest(int numero);
}
