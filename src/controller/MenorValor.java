package controller;

public class MenorValor {

	public MenorValor() {
		super();
	}

	public int calculaMenor(int[] vet, int tamanho, int menorValor) {
		//Condição de parada: contagem é menor que zero, assim passando por todo o vetor. Retorna menor valor.
		if (tamanho < 0) {
			return menorValor;
		} else {
			//Condição para verificar valor. Se é menor que o valor guardado, substitui.
			if (vet[tamanho] < menorValor) {
				menorValor = vet[tamanho];
			} 
			//Recursiva chamando função com contagem - 1
			return calculaMenor(vet, tamanho - 1, menorValor);
		}
	}
}
