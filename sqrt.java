package c5;

public class sqrt {
	

	
	
	public static void main (String [] args){
	System.out.println(squareroot(100));
	System.out.println(power(2,2));
	System.out.println(abs_number(-200));
}
private static double squareroot(double x){
	return (Math.pow(x,0.5));
}
private static double power(double base, double exponent){
	double product=1.0;
	for(double i= exponent; i>0; i--){
		product*=base;
	}
	return product;
}
	private static double abs_number(double number){
		double num=1;
		num = (number < 0) ? -number : number;
		return num;
		
	}
}


