import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // setando localização para US mudando padrão de ponto flutuante dos números de , para .
		String nome = "João";
		int idade = 27;
		double renda = 10000.5354;
		System.out.printf("%.2f%n", renda);
		System.out.println(renda);
		System.out.println("RESULTADO = " + renda + " METROS");
		System.out.printf("RESULTADO = %.2f METROS%n", renda);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
