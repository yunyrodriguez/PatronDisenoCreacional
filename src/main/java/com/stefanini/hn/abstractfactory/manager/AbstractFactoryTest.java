package com.stefanini.hn.abstractfactory.manager;


public class AbstractFactoryTest {

	public static void main(String[] args) {

		AmdFactory instanciaAmd = new AmdFactory();
		IntelFactory instanciaInterl = new IntelFactory();

		obtainProduct(instanciaAmd, instanciaInterl);
	}

	private static void obtainProduct(AbstractFactory instancia1, AbstractFactory instancia2) {
		System.out.println(instancia1.buyMemory().getMemory());
		System.out.println(instancia2.buyMemory().getMemory());
	}

}
