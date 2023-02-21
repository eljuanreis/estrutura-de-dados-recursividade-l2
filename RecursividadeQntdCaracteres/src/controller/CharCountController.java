package controller;

public class CharCountController {
	
	public CharCountController() {
		super();
	}
	
	public int countInteger(int num, int tamanho) {
		// Ponto de parada
		if (num > 0) {
			// Vai retirando casas decimais e aumentando o parâmetro tamanho
			return countInteger(num / 10, tamanho+1);
		} else {
			return tamanho;
		}		
	}
	
	public int countIntegerDraft(int num) {
		int a = 10;
		int b = 0;
		while (num > (num % a)) {
			a = a * 10;
			b++;
		}
		
		return b+1;
	}
}
