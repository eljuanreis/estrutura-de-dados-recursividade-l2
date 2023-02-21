package controller;

public class StringController {
		
	public String rollback(String text) {
		
		// Ponto de parada
		if (text.isEmpty()) {
			return text;
		}
		
		// Transaciona as letras:
		/**
		 * abacate
		 * e + t e etc.
		 */
        String roll = rollback(text.substring(1)) + text.charAt(0);

        return roll;
	}
	
}
