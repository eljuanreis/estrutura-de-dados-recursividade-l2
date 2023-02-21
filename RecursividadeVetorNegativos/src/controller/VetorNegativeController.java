package controller;

public class VetorNegativeController {
	
	int negativeValue = 0;
	
	public int calculate(int[] vetor, int tamanho) {
		// Ponto de parada
		if (tamanho == 0) {
			return negativeValue;
		}
		
		tamanho = tamanho - 1;
		
		if (vetor[tamanho] < 0) {
			negativeValue++;
		}
		
		/**
		 * Vai percorrer N posições do vetor e ir tirando de 1 em 1
		 */
		return calculate(vetor, tamanho);
	}
}
