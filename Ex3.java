package prova1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a massa inicial em gramas: ");
        double massaInicial = sc.nextDouble();
        double massaFinal = massaInicial;
        int segundos = 0;
        
        while (massaFinal >= 0.5) {
            massaFinal /= 2;
            segundos += 50;
        }
        
        int horas = segundos / 3600;
        segundos = segundos % 3600;
        int minutos = segundos / 60;
        segundos = segundos % 60;

        System.out.println("Massa inicial: " + massaInicial);
        System.out.println("Massa final: " + massaFinal);
        System.out.printf("Tempo: %d horas, %d minutos e %d segundos.", horas, minutos, segundos);
        
        sc.close();
    }
}
