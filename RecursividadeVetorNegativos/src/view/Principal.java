package view;

import controller.VetorNegativeController;

public class Principal {
	
	public static void main(String args[]) {
		int[] vetor = {-1,-5,-6,1,2,3,6,4,8,10};
		int tamanho = vetor.length;

		VetorNegativeController vetorNegativeController = new VetorNegativeController();
		int totalNegativos = vetorNegativeController.calculate(vetor, tamanho);
		System.out.println(totalNegativos);
	}
	
}
