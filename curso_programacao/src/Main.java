import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // setando localiza��o para US mudando padr�o de ponto flutuante dos n�meros de , para .
		String nome = "Jo�o";
		int idade = 27;
		double renda = 10000.5354;
		System.out.printf("%.2f%n", renda);
		System.out.println(renda);
		System.out.println("RESULTADO = " + renda + " METROS");
		System.out.printf("RESULTADO = %.2f METROS%n", renda);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
