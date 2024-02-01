package Util;

public class CurrencyConverter {
	
	public static final double iof = 0.0638;
	
	public static final double DollarConverter(double quantity, double price) {
		return quantity * price;
	}
	
	public static final double Total(double x, double y) {
		return DollarConverter(x, y) + (DollarConverter(x, y) * iof);
	}
	
}