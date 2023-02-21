package view;

import controller.CharCountController;

public class Principal {
	
	public static void main(String args[]) {
		int num = 1000;
		
		CharCountController charCountController = new CharCountController();
		
		int caracteres = charCountController.countInteger(num, 0);
		System.out.println(caracteres);
		
	}

}
