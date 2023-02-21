package view;

import controller.StringController;

public class Principal {

	public static void main(String[] args) {
		StringController stringController = new StringController();
		
		//etacaba (quase um eita cabra)
		String texto = "abacate";
		
		String result = stringController.rollback(texto);
		
		System.out.println(result);
	}

}
