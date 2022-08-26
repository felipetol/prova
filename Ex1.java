package prova1;

import java.util.Scanner;

public class Ex1 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maior = 0;
        int menor = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Insira o número " + (i + 1) + ": ");
            int num = sc.nextInt();
            if (i == 0) {
                maior = num;
                menor = num;
            } else if (num > maior) {
                maior = num;
            } else if (num < menor) {
                menor = num;
            }    
        }
        
        System.out.printf("Maior número: %d\n", maior);
        System.out.printf("Menor número: %d\n", menor);

        sc.close();
    }
}
