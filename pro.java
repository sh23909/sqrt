import java.util.Scanner;

public class pro {
	public static void main(String [] args){
		double x;
		Scanner scan=new Scanner(System.in);
		System.out.println("Number?:");
		x= scan.nextInt();
		double pr=1;
		double i=0;
		while(i<10){
			pr*=x;
			i++;
			System.out.println (pr);
		}
		
	}

}