package view;

import controller.FatorialController;

public class Principal {
	
	public static void main(String args[]) {
		FatorialController fatorialController = new FatorialController();
		
		int fatorial = fatorialController.fatorial(5);
		
		System.out.println(fatorial);
	}
}
