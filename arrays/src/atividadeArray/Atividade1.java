package atividadeArray;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		int[] array;
		final int tamanhoArray=10;
		Scanner entrada = new Scanner(System.in);
			
	       
		System.out.println("Insira os nomes dos convidados");
		array = new int[tamanhoArray];
	for(int i = 0; i < tamanhoArray; i++) {
			System.out.printf("Informe a  posição[%d]: ",i);
			array[i] = entrada.nextInt();
		}

		System.out.printf("\n%s%15s\n","Indice","Valor");
		for(int i = 0; i < tamanhoArray; i++){
			System.out.printf("%s%15s\n",i,array[i]);
		}		
		entrada.close();

	}

}
