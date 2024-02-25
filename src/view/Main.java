package view;
import controller.MenorValor;

public class Main {

	public static void main(String[] args) {
		int[] vet = {1, 34, 20, 43, 34, 96, 52, 23, 42, 67, 90};
		int tamanho = vet.length - 1;
		int ultimoValor = vet[tamanho];
		
		MenorValor mCont = new MenorValor();
		int resultado = mCont.calculaMenor(vet, tamanho, ultimoValor);
		
		System.out.println("Menor valor do vetor: " + resultado);
		
	}

}
