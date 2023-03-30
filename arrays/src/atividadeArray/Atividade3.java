package atividadeArray;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		int[] array;
		int nota1,nota2,nota3;
	    int tamanhoArray;
		Scanner entrada = new Scanner(System.in);
			
	    System.out.println("Insira a quantidade de alunos");   
		tamanhoArray=entrada.nextInt();
	    System.out.println("Insira As notas dos alunos");
		array = new int[tamanhoArray];
	for(int i = 0; i < tamanhoArray; i++) {
			System.out.printf("Informe a  posição[%d]: ",i);
			System.out.println("Informe a primeira nota");
			nota1=entrada.nextInt();
			System.out.println("Informe a segunda nota");
			nota2=entrada.nextInt();
			System.out.println("Informe a terceira nota");
			nota3=entrada.nextInt();
			
			
			
			array[i] =(nota1+nota2+nota3)/3;
		}

		System.out.printf("\n%s%15s\n","Indice","Valor");
		for(int i = 0; i < tamanhoArray; i++){
			System.out.printf("%s%15s\n",i,array[i]);
		}		
		entrada.close();

	}

}
