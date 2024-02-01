
public class desconto_com_ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preco = 34.5;
		
		// ternario
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		System.out.printf("Desconto: R$ %.2f", desconto);
	}

}
