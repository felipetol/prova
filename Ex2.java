package prova1;

public class Ex2 {

	public static void main(String[] args) {
        
        int ano  = 1996;
        double salario = 1015;
        double aumentoPercentual = 0.03;

        while (ano < 2022) {
            salario *= 1 + aumentoPercentual;
            aumentoPercentual *= 2;
            ano += 1;
        }
        
        System.out.printf("Salário: %.2f", salario);
    }
}
