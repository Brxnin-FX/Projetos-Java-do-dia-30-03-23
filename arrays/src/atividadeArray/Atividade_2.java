package atividadeArray;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		
		String[] array;
		final int tamanhoArray=10;
		Scanner entrada = new Scanner(System.in);
			
	       
		System.out.println("Insira os nomes dos convidados");
		array = new String[tamanhoArray];
	for(int i = 0; i < tamanhoArray; i++) {
			System.out.printf("Informe a  posição[%d]: ",i);
			array[i] = entrada.nextLine();
		}

		System.out.printf("\n%s%7s\n","Indice","Valor");
		for(int i = 0; i < tamanhoArray; i++){
			System.out.printf("%s%9s\n",i,array[i]);
		}		
		entrada.close();
	}

	}


