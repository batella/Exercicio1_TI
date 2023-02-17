package packageex01;

import java.util.*;
class SomarDoisNumeros {
public static Scanner sc = new Scanner(System.in);
public static void main (String args[]) {
//Aluno: Caio Batella - Matrícula: 766687
	
//Declaracao de variaveis
int num1, num2, soma;

//leituras
System.out.println("Digite um numero:");
num1 = sc.nextInt();
System.out.println("Digite outro numero para soma:");
num2 = sc.nextInt();

//Somar
soma = num1 + num2;

//Mostrar na tela
System.out.println("Soma:"+soma);
}
}