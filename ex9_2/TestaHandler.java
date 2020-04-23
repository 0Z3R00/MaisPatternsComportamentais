package ex9_2;

public class TestaHandler {

	public static void main(String[] args) {
		Numero num;

		Handler numero1 = new HandlerNum1();
		Handler numero2 = new HandlerNum2();
		Handler numero3 = new HandlerNum3();
		Handler numero4 = new HandlerNum4();
		Handler numero5 = new HandlerNum5();
		Handler numero6 = new HandlerNum6();
		Handler numero7 = new HandlerNum7();
		Handler numero8 = new HandlerNum8();
		Handler numero9 = new HandlerNum9();
		Handler numero10 = new HandlerNum10();
		Handler numero11 = new HandlerNum11();
		Handler numero12 = new HandlerNum12();
		Handler numero13 = new HandlerNum13();
		Handler numero14 = new HandlerNum14();
		Handler numero15 = new HandlerNum15();

		numero1.setHandler(numero2);
		numero2.setHandler(numero3);
		numero3.setHandler(numero4);
		numero4.setHandler(numero5);
		numero5.setHandler(numero6);
		numero6.setHandler(numero7);
		numero7.setHandler(numero8);
		numero8.setHandler(numero9);
		numero9.setHandler(numero10);
		numero10.setHandler(numero11);
		numero11.setHandler(numero12);
		numero12.setHandler(numero13);
		numero13.setHandler(numero14);
		numero14.setHandler(numero15);
		
		

		num = new Numero(1);
		numero1.process(num);
		
		num = new Numero(2);
		numero1.process(num);
		
		num = new Numero(8);
		numero1.process(num);
		
		num = new Numero(1);
		numero1.process(num);
		
		num = new Numero(4);
		numero1.process(num);
		
		num = new Numero(3);
		numero1.process(num);
		
		num = new Numero(15);
		numero1.process(num);
		
		num = new Numero(17);
		numero1.process(num);
		
		num = new Numero(1);
		numero1.process(num);

		num = new Numero(9);
		numero1.process(num);
		
		num = new Numero(6);
		numero1.process(num);
		
		num = new Numero(14);
		numero1.process(num);
		
		num = new Numero(22);
		numero1.process(num);
		
		num = new Numero(7);
		numero1.process(num);
		
		num = new Numero(44);
		numero1.process(num);
		
		num = new Numero(0);
		numero1.process(num);
		
		num = new Numero(12);
		numero1.process(num);
		
		num = new Numero(14);
		numero1.process(num);
	}

}
