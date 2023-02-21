package controller;

public class FatorialController {
	
	public int fatorial(int num) {
		// Condição de parada
		if (num == 1) {
			return 1;
		}
		
		/**
		 * 5 * (5-1)
		 * 4 * (4-1)
		 * 3 * (3-1)
		 * 2 * (2-1)
		 * 1 * 1 (pediu para parar parou)
		 */
		return num * fatorial(num-1);
	}
	
}
