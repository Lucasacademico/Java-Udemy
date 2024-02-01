
public class desconto_com_if {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double preco = 34.5;
		double desconto;
		
		if (preco < 20.0) 
			desconto = preco * 0.01;
		else 
			desconto = preco * 0.05;
		System.out.printf("Desconto: %.2f", desconto);
			
	}
}
